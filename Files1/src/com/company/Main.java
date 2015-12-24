package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    static File f;

    public static void main(String[] args) {

        f = new File("myFile.txt");

        createFile();
        editFile();
        deleteFile();

    }

    public static void createFile(){
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void editFile(){
        if (f.exists()){
            try {
                String str = "My text...";
                FileOutputStream out = new FileOutputStream(f);
                byte[] textInBytes = str.getBytes();
                out.write(textInBytes);
                out.close();
            } catch (IOException e) {
                System.out.println("problem with file/stream");
            }
        }
    }

    public static void deleteFile(){
        if (f.exists()){
            f.delete();
        }
    }

}
