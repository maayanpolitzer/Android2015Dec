package com.company;

/**
 * Created by hackeru on 2015-12-20.
 */
public class MyArrayList implements Methods {

    private int[] arr;
    private int counter;

    public MyArrayList(){
        arr = new int[10];
        counter = 0;
    }

    @Override
    public boolean add(int x) {
        if (arr == null){
            return false;
        }
        if (counter == arr.length) {
            makeRoom();
        }
        arr[counter++] = x;
        return true;
    }

    @Override
    public void makeRoom() {
        int[] temp = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }

    @Override
    public int get(int index) {
        if (index >= counter){
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }

    @Override
    public void clear() {
        arr = new int[10];
        counter = 0;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < counter; i++){
            s += arr[i] + " ";
        }
        return s;
    }

    @Override
    public int indexOf(int x) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(int x) {
        return indexOf(x) != -1;
    }

    @Override
    public boolean remove(int index) {
        if (index > counter || index < 0){
            return false;
        }
        for (int i = index + 1; i < counter; i++){
            arr[i-1] = arr[i];
        }
        counter--;
        return true;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public int[] toArray() {
        int[] newArr = new int[counter];
        for (int i = 0; i < counter; i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }

    @Override
    public void addAt(int index, int number) {
        if(index < counter) {
            add(4444);
            for (int i = counter; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = number;
        }
    }

}
