package com.company;

public class Main {

    static int[] n = {5,4,6};
    static boolean b = false;

    public static void main(String[] args) {
        System.out.println("before");
        try{

            c();
            System.out.println("Maayan");
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("in finally");
            b = true;
        }
        if(b) {
            System.out.println("after");
        }
    }

    public static void c(){
        System.out.println(n[5]);
        b = true;
    }
}
