package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void validTask(){
        Task task = new Task("Robin");

        Assertions.assertTrue(!task.name.isEmpty());
    }
}
