package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        System.out.println("Welcome to Calculating the area under a function\n" +
                "Please select a function");

        System.out.println("1. Linear: f(x) = mx + b \n" +
                "2. Quadratic: f(x) = a ( x - h )^2 + c \n" +
                "3. Sinusoidal: Sine: f(x) = a (sin ( k ( x - c)) + d\n" +
                "4. Sinusoidal: Cosine: f(x) = a ( cos ( k ( x - c )) + d\n" +
                "5. Quit\n");
        Scanner s = new Scanner(System.in);

        int fx = s.nextInt();

        System.out.println(" Please input an a value");
        double a = s.nextDouble();

        System.out.println(" Please input the slope");
        double slope = s.nextDouble();

        System.out.println(" Please input your y-intercept");
        double b = s.nextDouble();

        System.out.println(" What is the value of g(x)?");
        double gx = s.nextDouble();

        System.out.println(" Set two domains\n " +
                "d1 = ");
        double d1 = s.nextDouble();

        System.out.println(" d2 = ");
        double d2 = s.nextDouble();

        System.out.println(" How accurate would you like to be\n" +
                "acc =");
        double acc = s.nextDouble();

        System.out.println(" Please set a c value");
        double c = s.nextDouble();

        System.out.println(" Please set a d value");
        double d = s.nextDouble();

        System.out.println(" Please set a k value");
        double k = s.nextDouble();

        System.out.println(" Function:"+ fx +
                "a =" + a +
                "\nSlope =" + slope +
                "\ny-intercept = " + b +
                "\ng(x) = " + gx +
                "\nd1 = "+ d1 +
                "\nd2 = " + d2 +
                "\nacc = " + acc +
                "\nc = " + c +
                "\nd = " + d +
                "\nk = " + k);



        while (fx != 5) {

            int menu = s.nextInt();

            switch (menu) {



                case 1: {


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

