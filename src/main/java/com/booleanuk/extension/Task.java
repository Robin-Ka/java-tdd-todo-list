package com.booleanuk.extension;

public class Task {

    static int counter = 0;
    final int id;
    String name;
    boolean completed;

    public Task(String name){
        this.name = name;
        this.completed = false;
        this.id = counter++;
    }

    public String getName(){
        return this.name;
    }

    public boolean getStatus(){
        return this.completed;
    }

    public void setStatus(boolean status){
        this.completed = status;
    }


}
