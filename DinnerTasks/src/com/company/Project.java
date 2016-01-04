package com.company;

/**
 * Created by hackeru on 2016-01-03.
 */
public class Project implements TaskCompletedListener {

    private Task[] tasks;
    private String name;

    public Project(String name, Task[] tasks){
        this.name = name;
        this.tasks = tasks;
        for (Task t : tasks){
            t.setListener(this);
        }
    }

    @Override
    public void taskCompleted() {
        System.out.println("task completed");
        boolean allCompleted = true;
        for (Task t : tasks){
            if (!t.isComplete()){
                allCompleted = false;
                break;
            }
        }
        if (allCompleted){
            projectDone();
        }
    }

    public void projectDone(){
        System.out.println("Project " + name + " is DONE!!! ready for eating!!!");
    }


}
