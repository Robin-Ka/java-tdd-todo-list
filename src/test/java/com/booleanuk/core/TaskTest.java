package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void testValidTask(){
        Task task = new Task("Code");

        Assertions.assertFalse(task.name.isEmpty());
        Assertions.assertFalse(task.completed);
    }

    @Test
    public void testGetName(){
        Task task = new Task("Run");

        String name = task.getName();
        Assertions.assertEquals("Run", name);
    }

    @Test
    public void testCompleteTask(){
        Task task = new Task("Run");

        task.completeTask();
        Assertions.assertTrue(task.completed);
    }

    @Test
    public void testGetStatus(){
        Task task = new Task("Run");

        Assertions.assertFalse(task.completed);
        task.completeTask();
        Assertions.assertTrue(task.completed);
    }

}
