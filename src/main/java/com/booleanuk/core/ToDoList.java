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

    public ArrayList<Task> getCompletedTasks(){
        ArrayList<Task> completedTasks = new ArrayList<>();
        for (Task task : tasks){
            if (task.completed){
                completedTasks.add(task);
            }
        }
        return completedTasks;
    }

    public ArrayList<Task> getIncompleteTasks(){
        ArrayList<Task> incompleteTasks = new ArrayList<>();
        for (Task task : tasks){
            if (!task.completed){
                incompleteTasks.add(task);
            }
        }
        return incompleteTasks;
    }

    public Task search(String taskName){
        for (Task task : tasks){
            if (task.name.equals(taskName)){
                return task;
            }
        }
        System.out.println("The task was not found or does not exist!");
        return null;
    }



}
