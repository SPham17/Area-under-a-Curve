package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double area1 = 0;
        double area2 = 0;

        System.out.println("Welcome to Calculating the area under a function\n" +
                "Please select a function");

        System.out.println("1. Linear: f(x) = mx + b \n" +
                "2. Quadratic: f(x) = a ( x - h )^2 + c \n" +
                "3. Sinusoidal: Sine: f(x) = a (sin ( k ( x - c)) + d\n" +
                "4. Sinusoidal: Cosine: f(x) = a ( cos ( k ( x - c )) + d\n" +
                "5. Quit\n");
        Scanner s = new Scanner(System.in);

        int fx = s.nextInt();

        System.out.println(" Please input the slope");
        double slope = s.nextDouble();

        System.out.println(" Please input your y-intercept");
        double b = s.nextDouble();

        System.out.println(" What is the value of g(x)?");
        double gx = s.nextDouble();

        System.out.println(" Set two domains\n " +
                "d1 (lower bound) = ");
        double d1 = s.nextDouble();

        System.out.println(" d2 (higher bound) = ");
        double d2 = s.nextDouble();

        System.out.println(" How accurate would you like to be, between" + d1 + " >= x >= " + d2 + "\n "+
                "acc =");
        double acc = s.nextDouble();

        System.out.println("Function: "+ fx +
                "\nSlope = " + slope +
                "\ny-intercept = " + b +
                "\ng(x) = " + gx +
                "\nd1 = "+ d1 +
                "\nd2 = " + d2 +
                "\nacc = " + acc);


        while (fx != 5) {

            switch (fx) {

                case 1: {
                functions areaLinear = new functions();
                areaLinear.setLinearArea(acc, d1, d2, slope, b, gx);

                }
                case 2:
                    System.out.println("Welcome");

                    functions quad = new functions();
                    quad.setQuadraticArea(acc, d1, d2, area1);

                    System.out.println(" Your area is" + quad.getQuadraticArea());
                case 3:
                case 4:
                case 5:
            }
        }

    }
}

