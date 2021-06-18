package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int s;
        int k;
        int n = 10;

        int mas[] = new int[n];

        for (int i = 0; i < n; i++) {
            mas[i] = random.nextInt(100);
        }

        System.out.println("Введите индекс массива от 0 до 9: ");
        s = input.nextInt();
        if (mas[s] > 0){
            System.out.println("Положительное");
        }
        System.out.println();

        System.out.println("Введите индекс массива от 0 до 9: ");
        k = input.nextInt();

        if (mas[k]%2==0){
            System.out.println("Четное");
        }else {
            System.out.println("Нечетное");
        }
        System.out.println();

        if (mas[s]>mas[k]){
            System.out.println("S больше K");
        } else {
            System.out.println("K больше S");
        }

        for (int i = 0; i < n; i++) {

            System.out.printf("%-5d", mas[i]);
        }
        System.out.println();


    }
}
