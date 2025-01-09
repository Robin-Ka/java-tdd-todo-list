package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
    public void testSeeAllTask() {
        ToDoList toDoList = new ToDoList();
        Task task1 = new Task("a");
        Task task2 = new Task("b");
        Task task3 = new Task("c");
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        toDoList.addTask(task3);

        Assertions.assertEquals(List.of("a", "b", "c"), toDoList.seeAllTasks());
    }

    @Test
    public void testChangeStatus() {
        ToDoList toDoList = new ToDoList();
        Task task1 = new Task("a");
        Task task2 = new Task("b");
        Task task3 = new Task("c");
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        toDoList.addTask(task3);

        Assertions.assertFalse(task1.getStatus());
        Assertions.assertFalse(task2.getStatus());
        Assertions.assertFalse(task3.getStatus());
        toDoList.changeStatus(task2, true);
        toDoList.changeStatus(task3, true);
        Assertions.assertFalse(task1.getStatus());
        Assertions.assertTrue(task2.getStatus());
        Assertions.assertTrue(task3.getStatus());

    }

    @Test
    public void testGetCompletedTasks() {
        ToDoList toDoList = new ToDoList();
        Task task1 = new Task("a");
        Task task2 = new Task("b");
        Task task3 = new Task("c");
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        toDoList.addTask(task3);
        toDoList.changeStatus(task2, true);
        toDoList.changeStatus(task3, true);

        Assertions.assertEquals(List.of(task2, task3), toDoList.getCompletedTasks());

    }

    @Test
    public void testGetIncompleteTasks() {
        ToDoList toDoList = new ToDoList();
        Task task1 = new Task("a");
        Task task2 = new Task("b");
        Task task3 = new Task("c");
        Task task4 = new Task("d");
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        toDoList.addTask(task3);
        toDoList.addTask(task4);
        toDoList.changeStatus(task2, true);
        toDoList.changeStatus(task3, true);

        Assertions.assertEquals(List.of(task1, task4), toDoList.getIncompleteTasks());

    }

    @Test
    public void testSearchExists() {
        ToDoList toDoList = new ToDoList();
        Task task1 = new Task("a");
        Task task2 = new Task("b");
        Task task3 = new Task("c");
        Task task4 = new Task("d");
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        toDoList.addTask(task3);
        toDoList.addTask(task4);

        Task searchedTask = toDoList.search("d");
        Assertions.assertEquals(task4, searchedTask);
    }

    @Test
    public void testSearchDoesntExists() {
        ToDoList toDoList = new ToDoList();
        Task task1 = new Task("a");
        Task task2 = new Task("b");
        Task task3 = new Task("c");
        Task task4 = new Task("d");
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        toDoList.addTask(task3);
        toDoList.addTask(task4);

        Task searchedTask = toDoList.search("e");
        Assertions.assertNull(searchedTask);
    }

}
