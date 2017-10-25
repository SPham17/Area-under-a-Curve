package com.company;

/**
 * Created by 07517pha on 20/10/2017.
 */
public class ABFunctions {

    public enum abFunctions {
        LINEAR, QUADRATIC, SINE, COSINE, INVALID}
            abFunctions abFunctions;

    public void functions(abFunctions abFunctions) {
            switch (abFunctions) {
                case LINEAR:
                    System.out.println("Mondays are bad.");
                    break;

                case QUADRATIC:
                    System.out.println("Fridays are better.");
                    break;

                case SINE:
                    System.out.println("Weekends are best.");
                    break;

                case COSINE:
                    System.out.println("Weekends are best.");
                    break;

                case INVALID:
                    System.out.println("Weekends are best.");
                    break;

            }
        }
}


