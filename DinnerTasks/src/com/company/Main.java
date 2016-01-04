package com.company;

public class Main {

    public static void main(String[] args) {

        Task[] tasks = new Task[3];
        tasks[0] = new Task("wash vegtables");
        tasks[1] = new Task("cut vegtables");
        tasks[2] = new Task("TIBUL");

        Project salad = new Project("salad", tasks);

        for (Task t : tasks){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t.setComplete(true);
        }

    }
}
