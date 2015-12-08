package com.company;

public class Main {

    public static void main(String[] args) {
        //  VARIABLES:
        int i = 5;      // decleration.
        int j = 4;

        String s = "Maayan";
        s = "new String Maayan";

        //System.out.println(s);
/*

//  MATH OPERATORS:

        i += 2; //  i = i + 2;
        i -= 2; //  i = i - 2;
        i *= 3; //  i = i * 3;
        i /= 1; //  i = i / 1;
        i %= 2; //  The remainder for dividing i to 2;
        i++;    //  i = i + 1;
        i--;    //  i = i - 1;

        System.out.println("i is: " + i);
*/

//  CONDITIONS(IF-ELSE):

/*
    // First example:

        if (i == 5){
            System.out.println("i is 5");
        }else if(i > 5){
            System.out.println("i is greater than 5");
        }else{
            System.out.println("i is less than 5"); //  because i is NOT 5 and NOT greater than 5;
        }

*/

/*
    //  second example:

        if(i < 5 && j > 3){
            if (j != i){
                //  i is less than 5 AND(&&) j is greater than 3;
                System.out.println("i is less than 5 AND(&&) j is greater than 3 AND j IS NOT(!=) i");
            }else{
                System.out.println("i is less than 5 AND(&&) j is greater than 3 AND j IS NOT(!=) i");
            }
        }else{
            System.out.println("at least one of the conditions is FALSE!!!");
        }
*/

//  LOOPS:

        //  while loop:
/*
        while(i < 10){
            System.out.println("i value is: " + i + ", still less than 10");
            i++;
        }
*/

        //  do-while loop:  (at least one iteration EVEN if the condition is FALSE!!!);
/*
        do{
            System.out.println("i value is: " + i + ", still less than 10");
            i++;
        }while (i < 10);
*/

        //  for loop:   //  for(int setup; condition; change int);

/*

        for (int r = 0; r < 10; r++){
            System.out.println("r value is: " + r);
        }

*/

//  ARRAYS:

        int[] arr = new int[4]; // in the right[] is the array length! you CAN'T change it!!!!!!
        arr[0] = 56;
        arr[1] = 480;
        arr[2] = -4;
        arr[3] = 0;

        // the same as:     int arr = {56, 480, -4, 0};
/*
        //  get one value:

        int val = arr[2];
        System.out.println("the value of arr[2] is: " + val);
        //same as:      System.out.println("the value of arr[2] is: " + arr[2]);

*/

/*
        //  getting all values:

        for (int k = 0; k < arr.length; k++){
            System.out.println("the value of arr[" + k + "] is: " + arr[k]);
        }

*/
    }
}
