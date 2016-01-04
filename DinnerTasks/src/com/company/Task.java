package com.company;

/**
 * Created by hackeru on 2016-01-03.
 */
public class Task {

    private String name;
    private boolean complete;
    private TaskCompletedListener listener;

    public Task(String name){
        this.name = name;
        complete = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
        if (complete){
            listener.taskCompleted();
        }
    }

    public TaskCompletedListener getListener() {
        return listener;
    }

    public void setListener(TaskCompletedListener listener) {
        this.listener = listener;
    }
}
