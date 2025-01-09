package com.booleanuk.core;

import java.util.ArrayList;

public class ToDoList {

    ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(Task task){
        if (!tasks.contains(task)){
            tasks.add(task);
        }
    }

    public void removeTask(String taskName){
        tasks.removeIf(task -> task.getName().equals(taskName));
    }

    public void changeStatus(Task task, boolean completed){
        if (tasks.contains(task)){
            task.setStatus(completed);
        }
    }

    public ArrayList<String> seeAllTasks(){
        ArrayList<String> showTasks = new ArrayList<>();
        for (int i = 0; i < tasks.size(); i++){
            showTasks.add(i, tasks.get(i).name);
        }
        return showTasks;
    }



}
