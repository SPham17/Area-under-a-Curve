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

        int deg;                // choice for degrees or rad (userinput
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

        System.out.println("Would you like to start?\n 1. Yes\n 2. No");    // decides whether they would like to start

        while (start){                                                      // if start is true, then begin

            ch = s.nextInt();                                               // user input of the choice

            if (ch == 2) {
                System.out.println(" Have a nice day! ");                   // stop if true
           break;}

           if (ch == 1){
               System.out.println("Lets get started!\n");                   // start if false
                start = false;
            }


        while (cont) {                                             // will continue loop again if true
            function.resetData();                                  // resets all the data at the start when looping

            System.out.println("Please select a function");        // function choices
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
                    f = ABFunctions.QUADRATIC;                    // calculate quadratic
                    break;
                case 3:
                    f = ABFunctions.SINE;                         // calculate sine
                    break;
                case 4:
                    f = ABFunctions.COSINE;                       // calculate cosine
                    break;
                default:
                    f = ABFunctions.INVALID;                      // if user types in something else, display "invalid"
            }
            switch (f) {
                case LINEAR: {                                              // refers to the previous choice
                    System.out.println(" Please input the slope");          // user inputs slope
                    m = s.nextDouble();

                    System.out.println(" Please input your y-intercept");   // user inputs y - intercept
                    b = s.nextDouble();


                    System.out.println(" What is the value of g(x)?");      // user inputs gx
                    gx = s.nextDouble();

                    System.out.println(" Set two domains\n " +              // user inputs lowerbound and higherbound domain
                            "lowerbound domain = ");
                    low = s.nextDouble();

                    System.out.println(" higherbound domain = ");
                    high = s.nextDouble();

                    System.out.println(" How accurate would you like to be\n" + // inputs the amount of rectangles to use
                            "acc =");
                    n = s.nextInt();

                    function.setDomain(low, high);                              // sends parameters to setting methods
                    function.setIterations(n);
                    function.set_Gx(gx);

                    System.out.println(" Calculating the area of a linear function...");
                    function.CalcAreaBetween(m, b);                             // calls method. inside method calculates and displays area

                    break;
                }
                case QUADRATIC:
                    System.out.println(" Please input an a value");                 //inputs a value
                    a = s.nextDouble();

                    System.out.println(" Please  input an h value");                // inputs h value
                    h = s.nextDouble();

                    System.out.println(" Please set a c value");                    // inputs c value
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

                    function.setDomain(low, high);                                  // sends parameters to setting methods
                    function.setIterations(n);
                    function.set_Gx(gx);


                    System.out.println(" Calculating the area of a quadratic function...");
                    function.CalcAreaBetween(a, h, c);                              // calls method. inside method calculates and displays area

                    break;
                case SINE:
                    System.out.println(" Please input an a value");                 // user inputs a value
                    a = s.nextDouble();

                    System.out.println(" Please set a k value");                    // user inputs k value
                    k = s.nextDouble();

                    System.out.println(" Please set a d value");                    // user inputs d value
                    d = s.nextDouble();

                    System.out.println(" Please set a c value");                    // user inputs c value
                    c = s.nextDouble();

                    System.out.println(" What is the value of g(x)?");              // user inputs gx value
                    gx = s.nextDouble();

                    System.out.println(" Set two domains\n " +                      // user inputs lowerbound and higherbound domains
                            "lowerbound domain = ");
                    low = s.nextDouble();

                    System.out.println(" higherbound domain = ");
                    high = s.nextDouble();

                    System.out.println(" How accurate would you like to be\n" +     // user inputs amound of rectangles
                            "acc =");
                    n = s.nextInt();

                    System.out.println(" Would you like to use degrees or radiant?\n" +     // user inputs whether to user degrees or radiants
                            "1. Degrees\n" +
                            "2. Radiant");
                    deg = s.nextInt();

                    if (deg == 1) {
                        degrees = true;                                             // if true, use degrees, if false, use radiants
                    } else {
                        degrees = false;
                    }

                    System.out.println(" Degrees = " + degrees + "\n");             // tells user if using degrees or radiants

                    function.setDomain(low, high);
                    function.setIterations(n);
                    function.set_Gx(gx);

                    System.out.println(" Calculating the area of a sinusoidal function...");
                    function.CalcAreaBetween(f, a, c, k, d, degrees);                           // calls method. inside method calculates and displays area

                    break;
                case COSINE:
                    System.out.println(" Please input an a value");                 // same as sign
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
                    function.CalcAreaBetween(f, a, c, k, d, degrees);                           // calls method. inside method calculates and displays area

                    break;
                case INVALID: {
                    System.out.println(" INVALID ");                                    // displays invalid if switch statement was not inputted properly
                }
            }

            System.out.println(" Would you like to continue?\n" +                       // options on whether to loop back to the start
                    "1. Yes\n" +
                    "2. No");

            choice = s.nextInt();                                                       // user inputs decision, if true, loop back, if false, break out of the program

            if (choice == 1) {
                cont = true;
            }
            if (choice == 2){
                cont = false;
                }
            }
        }
    }}

