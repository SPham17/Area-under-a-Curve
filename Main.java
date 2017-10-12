package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        functions area = new functions();


        System.out.println("Welcome to Calculating the area under a function\n" +
                "What would you like to find a curve under?");

        System.out.println("1. Linear: f(x) = mx + b \n" +
                "2. Quadratic: f(x) = a ( x - h )^2 + c \n" +
                "3. Sinusoidal: Sine: f(x) = a (sin ( k ( x - c)) + d\n" +
                "4. Sinusoidal: Cosine: f(x) = a ( cos ( k ( x - c )) + d\n" +
                "5. Quit");

        Scanner s = new Scanner(System.in);

        while (!s.equals("5")) {

            int menu = s.nextInt();

            switch (menu) {



                case 1: {
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    break;
                }
                case 2:
                    System.out.println("");
                case 3:
                case 4:
                case 5:
            }
        }

    }
}

