package com.company.observer;

public class Type2Observer implements Observer {

    //accept the email address as a constructor parameter

    private String email;

    @Override
    public void notifyObserver(String news) {
        System.out.println("Wrapping the news" + news);
        //send an actual email to the observer
    }
}
