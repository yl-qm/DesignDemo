package com.syl.design.observer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        button.add(new KeyMapListener()).add(new MouseListener());
        button.push();
    }
}

// 被观察者
class Button{
    public List<Observer> observerList = new ArrayList<>();

    public Button add(Observer observer){
        observerList.add(observer);
        return this;
    }

    public void push(){
        PushEvent pushEvent = new PushEvent("place", "down", this);

        for (Observer observer : observerList) {
            observer.showMsg(pushEvent);
        }
    }
}

// 事件抽象
abstract class Event<T>{

    T resource;

    abstract T getResource();
}

// 事件
class PushEvent extends Event<Button>{

    public String place;

    public String up;

    public PushEvent(String place, String up, Button resource) {
        this.place = place;
        this.up = up;
        this.resource = resource;
    }

    @Override
    Button getResource() {
        return resource;
    }
}

// 观察者
interface Observer{
    void showMsg(Event event);
}

class KeyMapListener implements Observer{

    @Override
    public void showMsg(Event event) {
        if (event.getResource() instanceof Button) {
            System.out.println("button push keymap listener");
        } else {
            System.out.println("unknown make keymap listener");
        }
    }
}

class MouseListener implements Observer{

    @Override
    public void showMsg(Event event) {
        if (event.getResource() instanceof Button) {
            System.out.println("button push mouse listener");
        } else {
            System.out.println("unknown make mouse listener");
        }
    }
}
