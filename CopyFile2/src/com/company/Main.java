package com.company;

import javafx.scene.shape.Line;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {

    //    copyFile();
        appendToFile();
    }


    public static void appendToFile(){
        try(
                FileWriter out = new FileWriter("newText.txt", true);
                ){
            out.write(System.lineSeparator() + "hello world");
        }catch(Exception e){

        }
    }


    public static void copyFile(){
        try(
                FileReader in = new FileReader("text.txt");
                FileWriter out = new FileWriter("newText.txt");
                ){
            int length;
            while((length = in.read()) != -1){
                out.write(length);
            }

        }catch(Exception e){
            System.out.println("error");
        }
    }
}
