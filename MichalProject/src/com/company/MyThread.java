package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by hackeru on 2015-12-27.
 */
public class MyThread extends Thread {

    private String fileName;
    private int it;

    public MyThread(String fileName, int iterations){
        this.fileName = fileName;
        it = iterations;
    }

    @Override
    public void run() {
        createFile();
        writeToFile();
    }

    public void createFile(){
        File f = new File(fileName);
        try {
            f.createNewFile();
            //       System.out.println("DONE!");
        } catch (IOException e) {
            System.out.println("Problem");
        }
    }

    public void writeToFile(){
        try(
                FileWriter writer = new FileWriter(fileName);
        ){
            String str = "*";
            for (int i = 0; i < it; i++){
            //    Thread.sleep(1000);
                //    System.out.println(i);
                writer.write(str + System.lineSeparator());
                str += "*";
            }

        }catch (Exception e){
            System.out.println("writer problem");
        }
    }
}
