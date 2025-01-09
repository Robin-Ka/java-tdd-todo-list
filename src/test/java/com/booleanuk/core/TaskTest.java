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
    public void testCompleteTask(){
        Task task = new Task("Run");

        task.completeTask();
        Assertions.assertTrue(task.completed);
    }

}
