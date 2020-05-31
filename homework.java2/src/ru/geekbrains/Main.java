package ru.geekbrains;

import java.util.Arrays;

public class Main {

    //task 1
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0};
        for (int i = 0; i < 6; i++) {
            if (arr[i] == 1) {
                arr[i] = arr[i] - 1;
            } else {
                arr[i] = arr[i] + 1;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        //task 2

        int[] arr1 = new int[8];
        for (int i = 0; i < arr1.length; i++) {
            arr1[0] = 0;
            arr1[1] = 3;
            arr1[2] = 6;
            arr1[3] = 9;
            arr1[4] = 12;
            arr1[5] = 15;
            arr1[6] = 18;
            arr1[7] = 21;
            System.out.print(arr1[i] + " ");
        }
        System.out.println();


        //task 3
        double[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++) {
            if (arr2[i] < 6) {
                arr2[i] = arr2[i] / 2;
            } else {
                arr2[i] = arr2[i];
            }
            System.out.print(arr2[i] + "   ");
        }
        System.out.println();

        //task 4
        int[][] arr3 = new int[3][3];
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if(x < y) {
                    arr3[x][y] = 0;
                } else if(x > y) {
                    arr3[x][y] = 0;
                } else{
                    arr3[x][y] = 1;
                }System.out.print(arr3[x][y] + " ");
            }
            System.out.println();
        }

    }

}
