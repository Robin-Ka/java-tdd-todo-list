package com.booleanuk.core;

import java.util.ArrayList;

public class ToDoList {

    ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(Task task){
        if (!tasks.contains(task)){
            tasks.add(task);
        }
        System.out.println("This task is already in your ToDo List!");
    }

    public void removeTask(String taskName){
        tasks.removeIf(task -> task.getName().equals(taskName));
    }

}
