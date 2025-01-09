package com.booleanuk.core;

public class Task {

    String name;
    boolean completed;

    public Task(String name){
        this.name = name;
        this.completed = false;
    }

    public void completeTask(){
        this.completed = true;
    }
}
