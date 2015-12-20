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
        char[] newChar = new char[to-from+1];
        for (int i = from; i <= to; i++){
            newChar[i-from] = chars[i];
        }
        MyString a = new MyString(newChar);
        return a;
    }

    public int length(){
        return chars.length;
    }

    @Override
    public String toString() {
       print();
        return null;
    }

    public void print(){
        for (int i = 0; i < chars.length; i++){
            System.out.print(chars[i]);
        }
    }

    public boolean contains(char c){
        /*
        for (int i = 0;i < chars.length; i++){
            if (c == chars[i]){
                return true;
            }
        }
        return false;
        */
        return indexOf(c) != -1;
    }

    public boolean isEmpty(){
        return length() == 0;
        /*
        if (chars.length == 0){
            return true;
        }
        return false;
        */

    }

    // advanced:

    public boolean endsWith(char[] x){
        int k = chars.length - 1;
        for (int i = x.length - 1; i >= 0; i--){
            if (x[i] != chars[k]){
                return false;
            }
            k--;
        }
        return true;
    }

    public boolean equals(char[] x){
        if (chars.length != x.length){
            return false;
        }
        if (x == chars){
            return true;
        }
        for (int i = 0; i < length(); i++){
            if (chars[i] != x[i]){
                return false;
            }
        }
        return true;
    }

    public MyString replace(char c, int index){
        chars[index] = c;
        MyString m = new MyString(chars);
        return m;
    }

    public MyString[] split(char c){
        MyString[] myStringArray = new MyString[howManySameChars(c) + 1];
        myStringArray[0] = subString(0,4);
        myStringArray[1] = subString(5, length()-1);
        return myStringArray;
    }



}
