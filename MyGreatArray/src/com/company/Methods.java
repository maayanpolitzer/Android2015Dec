package com.company;

/**
 * Created by hackeru on 2015-12-20.
 */
public interface Methods {

    public boolean add(int x);      //  add x to the list... if add was successfully return true.
    public void makeRoom();         //  increase arr size * 2.
    public int get(int index);      //  returns the value of  arr in place index.
    public void clear();            //  reset the arr.
    public int indexOf(int x);      //  returns the index of value x. if there is not x return -1;
    public boolean contains(int x); //  true if there is a value = x.
    public boolean remove(int index);// deletes the value of index!!! and shift left.
    public int size();              //  how many add() were.
    public int[] toArray();         //  return a new FULL array
    public void addAt(int index, int number);   //  add new value(number) in place index and shift right.

}
