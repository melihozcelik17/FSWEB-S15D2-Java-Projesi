package com.workintech.model;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void Main(String[] args){
        Task task1 = new Task("Java collections " , "Write List","Ann" , Priority.LOW,Status.ASSIGNED);
        Task task2 = new Task("Java collections " , "Write List","Ann" , Priority.LOW,Status.ASSIGNED);
        Task task3 = new Task("Java collections " , "Write List","Ann" , Priority.LOW,Status.ASSIGNED);
        Task task4 = new Task("Java collections " , "Write List","Ann" , Priority.LOW,Status.ASSIGNED);
        Task task5 = new Task("Java collections " , "Write List","Ann" , Priority.LOW,Status.ASSIGNED);

        Set<Task> annsTask = new LinkedHashSet<>();
        annsTask.add(task1);
        annsTask.add(task5);

        Set<Task>
    }
}
