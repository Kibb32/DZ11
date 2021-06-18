package com.company;

import java.util.Random;
import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int proizvedenie = 1;
        int sum = 0;
        int n = 10;
        int summ = 0;
        int k1;
        int k2;
        int s1;
        int s2;

        int mas[] = new int[n];

        for (int i = 0; i < n; i++) {
            mas[i] = random.nextInt(100);
            System.out.printf("%-5d", mas[i]);
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            sum += mas[i];
        }
        System.out.println("Сумма всех элементов массива = " + sum);
        System.out.println();


        System.out.println("Среднее арифметическое массива = "+sum/ n);

        for (int i = 0; i < n; i++) {
            proizvedenie = proizvedenie * mas[i];
        }
        System.out.println("Произведение всех элементов массива = " + proizvedenie);
        System.out.println();


        for (int i = 0; i < n - 4; i++) {
            summ += mas[i];
        }
        System.out.println("Сумма первых 6ти элементов = " + summ);


        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d", mas[i]);
        }
        System.out.println();

    }
}
