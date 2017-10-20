package com.company;

/**
 * Created by 07517pha on 20/10/2017.
 */
public class ABFunctions {

    public enum abFunction {
        LINEAR, QUADRATIC, SINE, COSINE, INVALID}

        public void abFunctions(int fx) {
            switch (fx) {
                case 1:
                    System.out.println("Mondays are bad.");
                    break;

                case 2:
                    System.out.println("Fridays are better.");
                    break;

                case 3:
                    System.out.println("Weekends are best.");
                    break;


            }
        }
}


