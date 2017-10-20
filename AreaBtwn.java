package com.company;

import java.util.Scanner;

/**
 * Created by 07517pha on 11/10/2017.
 */
public class AreaBtwn {
    private double linear;
    private double quadratic;
    private double sine;
    private double linearArea;
    private double quadraticArea;
    private double sinArea;
    private double cosArea;
    private double length;
    private double width;

    ABFunctions abFunctions = new ABFunctions();


    void resetData(){                                        // that will reset all of the private data in the AreaBtwn object to 0, zero

    }
    void setDomain(double low, double high){

    }
    void setIterations(int n){

    }
    double CalcAreaBetween(double m, double b)  {           //This method should call the setLineData, and calcAreaLinear methods

    }


    double CalcAreaBetween(double a, double h, double c){   // This method should call the setQuadraticData, and calcAreaQuadratic methods

    }


    double CalcAreaBetween(ABFunction f, double a, double k, double c, double d, boolean degrees) {

    }




    private void setLineData(double m, double b) {

        width = (d1 - d2) / acc;               // gets the width of the small rectangles, divides it by the the amount rectangles to make all the rectangles even
        length = m * d1 + b - gx;               // gets the length (height) of the small rectangles

        for (double x = 0; x < acc; x++) {       // repeats

            linear = Math.abs(length + width);
            d1 += width;
            length = m * d1 + b - gx;

            this.linearArea += linear;
        }
    }

    public double calcAreaLinear() {

        return linearArea;
    }
}































/*
    private void setLineData(double acc, double m, double b, double d1, double d2, double gx) {

        width = ( d1 - d2) / acc;               // gets the width of the small rectangles, divides it by the the amount rectangles to make all the rectangles even
        length = m * d1 + b - gx;               // gets the length (height) of the small rectangles

        for (double x = 0; x < acc; x++){       // repeats

            linear = Math.abs(length + width);
            d1 += width;
            length = m * d1 + b - gx;

           this.linearArea += linear;
        }
    }
    public double calcAreaLinear(){

        return linearArea;
    }

    private void setQuadraticData(double acc, double h, double d1, double d2, double a, double gx, double c){

        width = ( d1 - d2) / acc;
        length = a * (d1 - h) * (d1 - h) + c - gx;

        for (double x = 0; x < acc; x++){

            quadratic = Math.abs(length + width);
            d1 += width;
            length = a * (d1 - h) * (d1 - h) + c - gx;

            this.quadraticArea += quadratic;
        }

    }
    private double calcAreaQuadratic(){

        return quadraticArea;
    }

    private void setSinusoidalData(double acc, double k, double b, double d1, double d2, double a, double gx, double c, double d){

        width = (d1 - d2) / acc;
        double degrees = Math.toRadians(d1 - c);
        length = a * (Math.sin(k * (degrees))) + d - gx;
        for (double x = 0; x < acc; x++) {

            sine = Math.abs(length * width);

            d1 += width;
            length = a * (Math.sin(k * (degrees))) + d - gx;

            this.sinArea += sine;
        }
    }

    public double calcAreaSine(){

        return sinArea;
    }


    public double calcAreaCosine(){
        return cosArea;
    }



*/



