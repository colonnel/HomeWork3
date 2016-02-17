package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Task3.1
        Random r = new Random();
        int rnd = 100;
        int size = 3;
        int[][] arr1 = new int[size][size];     //firs array
        int[][] arr2 = new int[size][size];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = r.nextInt(rnd);
            }
        }
        System.out.println("Массив 1:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                System.out.print(arr1[i][j] + "|");
            }
            System.out.println();
        }


        //second array
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr1[i][j] = r.nextInt(rnd);
            }
        }
        System.out.println("Массив 2:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                System.out.print(arr1[i][j] + "|");
            }
            System.out.println();


        }
        //summa
        for (int i=0;i<arr1.length ;i++)
        {
            for (int j=0;j<arr1[i].length ;j++)
            {

                System.out.print (arr1[i][j]+arr2[i][j]+ "|");
            }
            System.out.println();
        }

        int[][] sum = new int[size][size];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Сложение:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {

                System.out.print(sum[i][j] + "|");
            }
            System.out.println();
        }

        //multi
        int[][] multi = new int[size][size];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                multi[i][j] += arr1[i][j] * arr2[i][j];
            }
        }

        System.out.println("Умножение:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {

                System.out.print(multi[i][j] + "|");
            }
            System.out.println();
        }

        //Task 3.2
//        System.out.println("Задание 3.2================");
//        Random r = new Random();
//        int a = r.nextInt(20) - 10;
//        int size = 5;
//        int[][] arr1 = new int[size][size];
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                arr1[i][j] = r.nextInt(20) - 10;
//            }
//        }
//
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                System.out.print(arr1[i][j] + "|");
//            }
//            System.out.println();
//        }
//        System.out.println("Номера ячеек с отрицательными элемментами:");
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                if (arr1[i][j] < 0) {
//                    System.out.print(" " + i + j);
//                }
//            }
//
//        }


//Task 3.3
//        Random r = new Random();
//        int a = r.nextInt(201) - 100;
//        int[] numbers = new int[40];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = r.nextInt(201) - 100;
//        }
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//
//        int min = numbers[0];
//        for (int i = 0; i < numbers.length; i++) {
//            if (min > numbers[i])
//                min = numbers[i];
//        }
//
//        System.out.println("Минимальное значение:  " + min);
//
//        int max = numbers[0];
//        for (int j = 0; j < numbers.length; j++) {
//            if (max < numbers[j])
//                max = numbers[j];
//        }
//
//        System.out.println("Максимальное значение:  " + max);
    }
}
