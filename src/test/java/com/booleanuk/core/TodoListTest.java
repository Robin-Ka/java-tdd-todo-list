package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTest {

    @Test
    public void testAddTask() {
        ToDoList toDoList = new ToDoList();
        Task task = new Task("Swim");

        toDoList.addTask(task);
        Assertions.assertTrue(toDoList.tasks.contains(task));
    }

    @Test
    public void testRemoveTask() {
        ToDoList toDoList = new ToDoList();
        Task task1 = new Task("Sing");
        Task task2 = new Task("Jump");
        toDoList.addTask(task1);
        toDoList.addTask(task2);

        Assertions.assertTrue(toDoList.tasks.contains(task1));
        Assertions.assertTrue(toDoList.tasks.contains(task2));
        toDoList.removeTask("Jump");
        Assertions.assertFalse(toDoList.tasks.contains(task2));

    }

    @Test
    public void testSeeTask() {

    }

    @Test
    public void testChangeStatus() {

    }

    @Test
    public void testGetCompletedTasks() {

    }

    @Test
    public void testGetIncompleteTasks() {

    }

    @Test
    public void testSearch() {

    }

}
