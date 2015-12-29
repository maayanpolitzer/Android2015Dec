package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main{

    public static void main(String[] args) {

        String fileName = "myNewFile";
        for (int i = 0; i < 20; i++){
            String name = fileName + i + ".txt";
            MyThread t = new MyThread(name, i);
            t.start();
        }




    }



}
