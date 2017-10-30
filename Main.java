package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                                // initializing variables for all cases
        double a;               // vertical stretch
        double b;               // y - intercept
        double c;               // c value
        double d;               // d value
        double k;               // k value
        double m;               // slope value
        double h;               // h value

        double low;             // lowerbound domain
        double high;            // higherbound domain
        double gx;              // gx value
        int n;                  // number of slices

        int deg;             // choice for degrees or rad (userinput
        boolean degrees;        // degrees or rad, true or false

        int choice;             // choice to continue or leave (userinput)
        boolean cont = true;    // continue or leave, true or false

        int ch;                 // choice to start or not (userinput)
        boolean start = true;   // start or leave, true or false


        ABFunctions f;                      // access enumerated types
        AreaBtwn function = new AreaBtwn(); // access AreaBtwn Class

        Scanner s = new Scanner(System.in); // scanner allowing userinput

        //----------------------------------------------------------------------------

        System.out.println("Welcome to Calculating the area under a function");

        System.out.println("Would you like to start?\n 1. Yes\n 2. No");

        while (start){

            ch = s.nextInt();

            if (ch == 2) {
                System.out.println(" Have a nice day! ");
           break;}

           if (ch == 1){
               System.out.println("Lets get started!\n");
                start = false;
            }


        while (cont) { // will continue loop again if true
            function.resetData();

            System.out.println("Please select a function");
            System.out.println("1. Linear: f(x) = mx + b \n" +
                    "2. Quadratic: f(x) = a ( x - h )^2 + c \n" +
                    "3. Sinusoidal: Sine: f(x) = a (sin ( k ( x - d)) + c\n" +
                    "4. Sinusoidal: Cosine: f(x) = a ( cos ( k ( x - d )) + c\n");



            int fx = s.nextInt();
            switch (fx) {                                         // user decides which function to choose
                case 1:                                           // each case accesses the enumerated variable, f, and specifies their function
                    f = ABFunctions.LINEAR;
                    break;
                case 2:
                    f = ABFunctions.QUADRATIC;
                    break;
                case 3:
                    f = ABFunctions.SINE;
                    break;
                case 4:
                    f = ABFunctions.COSINE;
                    break;
                default:
                    f = ABFunctions.INVALID;
            }
            switch (f) {
                case LINEAR: {                                      // refers to the previous choice
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
                    n = s.nextInt();

                    function.setDomain(low, high);
                    function.setIterations(n);
                    function.set_Gx(gx);

                    System.out.println(" Calculating the area of a linear function...");
                    function.CalcAreaBetween(m, b);

                    break;
                }
                case QUADRATIC:
                    System.out.println(" Please input an a value");
                    a = s.nextDouble();

                    System.out.println(" Please  input an h value");
                    h = s.nextDouble();

                    System.out.println(" Please set a c value");
                    c = s.nextDouble();

                    System.out.println(" What is the value of g(x)?");
                    gx = s.nextDouble();

                    System.out.println(" Set two domains\n " +
                            "lowerbound domain = ");
                    low = s.nextDouble();

                    System.out.println(" higherbound domain = ");
                    high = s.nextDouble();

                    System.out.println(" How accurate would you like to be\n" +
                            "acc =");
                    n = s.nextInt();

                    function.setDomain(low, high);
                    function.setIterations(n);
                    function.set_Gx(gx);


                    System.out.println(" Calculating the area of a quadratic function...");
                    function.CalcAreaBetween(a, h, c);

                    break;
                case SINE:
                    System.out.println(" Please input an a value");
                    a = s.nextDouble();

                    System.out.println(" Please set a k value");
                    k = s.nextDouble();

                    System.out.println(" Please set a d value");
                    d = s.nextDouble();

                    System.out.println(" Please set a c value");
                    c = s.nextDouble();

                    System.out.println(" What is the value of g(x)?");
                    gx = s.nextDouble();

                    System.out.println(" Set two domains\n " +
                            "lowerbound domain = ");
                    low = s.nextDouble();

                    System.out.println(" higherbound domain = ");
                    high = s.nextDouble();

                    System.out.println(" How accurate would you like to be\n" +
                            "acc =");
                    n = s.nextInt();

                    System.out.println(" Would you like to use degrees or radiant?\n" +
                            "1. Degrees\n" +
                            "2. Radiant");
                    deg = s.nextInt();

                    if (deg == 1) {
                        degrees = true;
                    } else {
                        degrees = false;
                    }

                    System.out.println(" Degrees = " + degrees + "\n");

                    function.setDomain(low, high);
                    function.setIterations(n);
                    function.set_Gx(gx);

                    System.out.println(" Calculating the area of a sinusoidal function...");
                    function.CalcAreaBetween(f, a, c, k, d, degrees);

                    break;
                case COSINE:
                    System.out.println(" Please input an a value");
                    a = s.nextDouble();

                    System.out.println(" Please set a k value");
                    k = s.nextDouble();

                    System.out.println(" Please set a d value");
                    d = s.nextDouble();

                    System.out.println(" Please set a c value");
                    c = s.nextDouble();

                    System.out.println(" What is the value of g(x)?");
                    gx = s.nextDouble();

                    System.out.println(" Set two domains\n " +
                            "lowerbound domain = ");

                    low = s.nextDouble();

                    System.out.println(" higherbound domain = ");
                    high = s.nextDouble();

                    System.out.println(" How accurate would you like to be\n" +
                            "acc =");
                    n = s.nextInt();

                    System.out.println(" Would you like to use degrees or radiant?\n" +
                            "1. Degrees\n" +
                            "2. Radiant");

                    deg = s.nextInt();
                    if (deg == 1) {
                        degrees = true;
                    } else {
                        degrees = false;
                    }

                    System.out.println(" Degrees = " + degrees + "\n");

                    function.setDomain(low, high);
                    function.setIterations(n);
                    function.set_Gx(gx);

                    System.out.println(" Calculating the area of a sinusoidal function...");
                    function.CalcAreaBetween(f, a, c, k, d, degrees);

                    break;
                case INVALID: {
                    System.out.println(" INVALID ");
                }
            }

            System.out.println(" Would you like to continue?\n" +
                    "1. Yes\n" +
                    "2. No");

            choice = s.nextInt();

            if (choice == 1) {
                cont = true;
            }
            if (choice == 2){
                cont = false;
                }
            }
        }
    }}

