package com.company;

public class MyString {

    private char[] chars;

    public MyString(char[] chars){
        this.chars = chars;
    }

    public char charAt(int i){
        if (i < chars.length){
            return chars[i];
        }
        return '-';
    }
    
    public int indexOf(char c){
        for (int i = 0; i < chars.length; i++){
            if (chars[i] == c){
                return i;
            }
        }
        return -1;
    }

    public int howManySameChars(char c){
        int counter = 0;
        for (int i = 0; i < chars.length; i++){
            if (chars[i] == c){
                counter++;
            }
        }
        return counter;
    }

    public MyString subString(int from, int to){

    }

    public int length(){

    }

    public void print(){

    }

    public boolean contains(char c){

    }

    public boolean isEmpty(){

    }

    // advanced:

    public boolean endsWith(char[] x){

    }

    public boolean equals(char[] x){

    }

    public MyString replace(char c, int index){

    }

    public MyString[] split(char c){

    }
}
