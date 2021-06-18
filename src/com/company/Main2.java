package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int slash = 0;
        int minus;
        int n = 10;

        int mas[] = new int[n];

        for (int i = 0; i < n; i++) {
            mas[i] = random.nextInt(100);
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d", mas[i]);
        }
        System.out.println();


        System.out.println("Увеличим массив в 2 раза");

        for (int i = 0; i < n; i++) {
            mas[i] = mas[i] * 2; // увеличил в 2 раза
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d", mas[i]);
        }
        System.out.println();

        System.out.print("Введите число которое необходимо отнять: ");
        minus = input.nextInt();

        for (int i = 0; i < n; i++) {
            mas[i] = mas[i] - minus;
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d", mas[i]);
        }
        System.out.println();

        System.out.println("Сейчас мы разделим массив на его 1й элемент");
        for (int i = 0; i < n; i++) {
           System.out.print(" " + mas[i] / mas[0]);
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d", mas[i]);
        }
        System.out.println();

    }
}
