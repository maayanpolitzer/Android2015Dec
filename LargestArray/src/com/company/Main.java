package com.company;

public class Main {


    public static int[] arr = {0,0,0,6};
    static int largestSumSoFar = 0;
    static int from, to;
    static int[] largestArray;

    public static void main(String[] args) {

        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
            //    System.out.print(i + "," + j + " ");
                int sum = getSum(i,j);
                if (sum > largestSumSoFar){
                    largestSumSoFar = sum;
                    from = i;
                    to = j;
                }
            }
            //System.out.println("");
        }
        System.out.println("largest sum: " + largestSumSoFar);
        buildArray();
        for (int i : largestArray){
            System.out.print(i + " ");
        }
    }

    private static void buildArray() {
        largestArray = new int[to - from + 1];
        for (int i = 0; i < largestArray.length; i++){
            largestArray[i] = arr[from + i];
        }
    }

    public static int getSum(int from, int to){
        int sum = 0;
        for (int i = from; i <= to; i++){
            sum += arr[i];
        }
    //    System.out.println(sum);
        return sum;
    }
}
