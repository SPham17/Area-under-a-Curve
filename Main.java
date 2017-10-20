package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double a; // initializing variables for all cases
        double b;
        double c;
        double d;
        double k;
        double m;
        double h;

        double low;
        double high;
        double gx;
        double acc;


        System.out.println("Welcome to Calculating the area under a function\n" +
                "Please select a function");

        System.out.println("1. Linear: f(x) = mx + b \n" +
                "2. Quadratic: f(x) = a ( x - h )^2 + c \n" +
                "3. Sinusoidal: Sine: f(x) = a (sin ( k ( x - c)) + d\n" +
                "4. Sinusoidal: Cosine: f(x) = a ( cos ( k ( x - c )) + d\n" +
                "5. Quit\n");
        Scanner s = new Scanner(System.in);

        int fx = s.nextInt();


        while (fx != 5) {

            int menu = s.nextInt();

            switch (menu) {
                case 1: {
                    System.out.println(" Please input the slope");
                     m = s.nextDouble();

                    System.out.println(" Please input your y-intercept");
                     b = s.nextDouble();

                    System.out.println(" What is the value of g(x)?");
                     gx = s.nextDouble();

                    System.out.println(" Set two domains\n " +
                            "lowerbound domain = ");
                     low = s.nextDouble();

                    System.out.println(" higherbound domain = ");
                     high = s.nextDouble();

                    System.out.println(" How accurate would you like to be\n" +
                            "acc =");
                     acc = s.nextDouble();


                    AreaBtwn linear = new AreaBtwn();
                    //linear.setLineData(acc, m, low, high, gx, b);

                    System.out.println(" Calculating the area of a linear function...");
                    System.out.println(" Your area is " + linear.calcAreaLinear());

                    break;
                }
                case 2:
                    System.out.println(" Please input an a value");
                     a = s.nextDouble();


                    System.out.println(" What is the value of g(x)?");
                     gx = s.nextDouble();

                    System.out.println(" Please set a c value");
                     c = s.nextDouble();

                    System.out.println(" Set two domains\n " +
                            "lowerbound domain = ");
                     low = s.nextDouble();

                    System.out.println(" higherbound domain = ");
                     high = s.nextDouble();


                case 3:
                    System.out.println(" Please input an a value");
                     a = s.nextDouble();


                    System.out.println(" What is the value of g(x)?");
                     gx = s.nextDouble();

                    System.out.println(" Please set a c value");
                     c = s.nextDouble();

                    System.out.println(" Please set a k value");
                     k = s.nextDouble();

                    System.out.println(" Please set a d value");
                     d = s.nextDouble();

                    System.out.println(" Set two domains\n " +
                            "lowerbound domain = ");
                     low = s.nextDouble();

                    System.out.println(" higherbound domain = ");
                     high = s.nextDouble();

                case 4:
                    System.out.println(" Please input an a value");
                     a = s.nextDouble();

                    System.out.println(" Please set a c value");
                     c = s.nextDouble();

                    System.out.println(" Please set a k value");
                     k = s.nextDouble();

                    System.out.println(" Please set a d value");
                     d = s.nextDouble();

                    System.out.println(" What is the value of g(x)?");
                     gx = s.nextDouble();

                    System.out.println(" Set two domains\n " +
                            "lowerbound domain = ");

                     low = s.nextDouble();

                    System.out.println(" higherbound domain = ");
                     high = s.nextDouble();

                case 5:
            }
        }

    }
}

