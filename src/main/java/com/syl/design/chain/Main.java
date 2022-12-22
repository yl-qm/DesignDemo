package com.syl.design.chain;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();
        filterChain.add(new AFilter()).add(new BFilter());

        filterChain.doFilter(new Request("req"), new Response("res"));
    }
}

class Request{
    public Request(String value) {
        this.value = value;
    }

    String value;
}

class Response{
    public Response(String value) {
        this.value = value;
    }

    String value;
}

class AFilter implements Filter{

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("AFilter request body");
        System.out.println(request.value);

        chain.doFilter(request, response);

        System.out.println("AFilter response body");
        System.out.println(response.value);
    }
}

class BFilter implements Filter{

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("BFilter request body");
        System.out.println(request.value);

        chain.doFilter(request, response);

        System.out.println("BFilter response body");
        System.out.println(response.value);
    }
}

// 单一责任
interface Filter{
    void doFilter(Request request, Response response, FilterChain chain);
}

// 责任链
class FilterChain{

    private volatile int index;

    private List<Filter> list = new CopyOnWriteArrayList<>();

    public FilterChain add(Filter filter){
        list.add(filter);
        return this;
    }

    // 可以foreach全部调用,也可以通过这种主动调用的方式去实现顺序调用,以及request和response之间的隔离调用
    public void doFilter(Request request, Response response){
        if (index == list.size())
            return;
        Filter filter = list.get(index);
        index++;
        filter.doFilter(request,response, this);
    }
}

