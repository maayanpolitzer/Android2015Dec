package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            File image = new File("image.jpg");
            File newImage = new File("newImage.jpg");

            in = new FileInputStream(image); // 0-1024, 1025-2049, 2050-
            out = new FileOutputStream(newImage);

            byte[] buffer = new byte[1024];
            int length;
            while((length = in.read(buffer)) > 0){
                out.write(buffer, 0, length);
            }
        }catch(Exception e){
            System.out.println("problem");
        }finally {
            try{
                if (in != null){
                    in.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            try {
                if (out != null){
                    out.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
