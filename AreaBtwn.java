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
    private double D1;
    private int N;
    private double Low;
    private double High;
    private double B;

    ABFunctions abFunctions = new ABFunctions();

    public void resetData() {                                        // that will reset all of the private data in the AreaBtwn object to 0, zero

        length = 0;
        width = 0;
    }

    public void set_Gx(double b) {
        this.B = b;


    }

    public void setDomain(double low, double high) {

        this.Low = low;
        this.High = high;

        double drange = Math.abs(this.Low - this.High);

        this.D1 = drange;

    }

    public void setIterations(int n) {
        this.N = n;


    }

    public double CalcAreaBetween(double m, double b) {           //This method should call the setLineData, and calcAreaLinear methods

        setIterations(this.N);
        set_Gx(this.B);
        setDomain(this.Low, this.High);


        this.width = this.Low - this.High / this.N;
        this.length = m * this.Low + b - this.B;
        System.out.println(this.width);

        for (double x = 0; x < this.N; x++) {

            linear = Math.abs(this.length + this.width);
            this.Low += this.width;
            this.length = m * Low + b - this.B;

            this.linearArea += linear;
        }
        return this.linearArea;
    }


   // public double CalcAreaBetween(double a, double h, double c) {   // This method should call the setQuadraticData, and calcAreaQuadratic methods

    //}



    //public double CalcAreaBetween(abFunctions functions, double a, double k, double c, double d, boolean degrees) {

    //}




    private void setLineData(double m, double b) {


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



