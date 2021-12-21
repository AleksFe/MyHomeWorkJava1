/**
 *Java 1. MyHomeWork3
 *
 *@author Aleksandra Feschuk
 *@version 20.12.2021
 */

import java.util.Arrays;

class MyHomeWork3 {

    public static void main(String[]args) {

        toStringArr1();
        toStringArr2();
        toStringArr3();
        toStringArr4();
        //toStringArr5();
    }

        static void toStringArr1() {
        int[] arr1 = {0,1,1,0,0,1 } ;
        System.out.println(Arrays.toString(arr1));
        for(int i=0; i < arr1.length; i++)
            if (arr1[i]==0)
            arr1[i] = 1;
            else
            arr1[i] = 0;
            System.out.println(Arrays.toString(arr1));
        }

        static void toStringArr2() {
        int[] arr2 = new int[100];
        for(int i = 1; i < arr2.length; i++)
            arr2[i] = i + 1;
            System.out.println(Arrays.toString(arr2));
        }

        static void toStringArr3() {
        int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr3.length; i++){
            if (arr3[i] < 6) {
                arr3[i]*= 2;
            }
        }
            System.out.println(Arrays.toString(arr3));
        }

        static void toStringArr4() {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - i - 1] = 1;
            System.out.println(Arrays.toString(matrix[i]));
        }
        }
        //static void toStringArr5(){
        //int[] arr5 = new int[len];
        //for (int i = 0; i < len; i++) {
            //arr5[i] = initialValue;
            //System.out.println(Arrays.toString(arr5));
        }
        //}
//}
