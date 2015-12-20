package com.company;

/**
 * Created by hackeru on 2015-12-20.
 */
public class MyArrayList implements Methods {

    private int[] arr;
    private int counter;

    public MyArrayList(){
        this.arr = new int[10];
        counter = 0;
    }

    @Override
    public boolean add(int x) {
        if (counter < arr.length){
            arr[counter] = x;
            counter++;
        }
    }

    @Override
    public void makeRoom() {

    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public int indexOf(int x) {
        return 0;
    }

    @Override
    public boolean contains(int x) {
        return false;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int[] toArray() {
        return new int[0];
    }

    @Override
    public void addAt(int index, int number) {

    }
}
