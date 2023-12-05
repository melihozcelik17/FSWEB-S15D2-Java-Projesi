package com.workintech.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task>bobsTasks;
    private Set<Task>carolsTasks;

    //public TaskData (){
    //annsTasks = new HashSet<>();
    //}

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
    }



    public Set<Task> getUnion(List<Set<Task>> taskList){
        Set<Task> totals = new HashSet<>();
        for(Set<Task> tasks:taskList){
            totals.addAll(tasks);
        }
        return totals;
    }
}
