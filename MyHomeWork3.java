/**
 *Java 1. MyHomeWork3
 *
 *@author Aleksandra Feschuk
 *@version 20.12.2021
 */

import java.util.Arrays;
import java.util.Random;

class MyHomeWork3 {
    //static Random random = new Random();

    public static void main(String[]args) {
        int[] arr = {0,1,1,0,0,1 } ;
        for(int i=0; i < arr.length; i++)
            if (arr[i]==0)
            arr[i] = 1;
            else
            arr[i] = 0;
            System.out.println(Arrays.toString(arr));
    }
    static void main(String[]args) {
        int[] arr = new int[100];
        for(int i = 1; i < arr.length; i++)
            arr[i] = i + 1;
            System.out.println(Arrays.toString(arr));
    }
    //static void main
}
