/**
 *Java 1. MyHomeWork3
 *
 *@author Aleksandra Feschuk
 *@version 20.12.2021
 */

import java.util.Arrays;
import java.util.Random;

class MyHomeWork3 {
    static Random random = new Random();

    public static void main(String[] args) {
        int a[] = { 0,1,1,0,0,1 } ;
        for(int i=0; i < a.length; i++)
        if (a[i]==0)
        a[i] = 1;
        else
        a[i] = 0;}
        System.out.println(Arrays.toString(arr))
}