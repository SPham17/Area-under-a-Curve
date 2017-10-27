package com.company;

import com.sun.javafx.geom.transform.BaseTransform;

import java.util.Scanner;

/**
 * Created by 07517pha on 11/10/2017.
 */
public class AreaBtwn {
    private double area;


    private double length;
    private double width;

    private int N;
    private double Acc;

    private double Low;
    private double High;

    private double gx;

    private boolean Degrees;
    //funtion variables
    private double M;
    private double B;
    private double A;
    private double C;
    private double H;
    private double D;
    private double K;

    ABFunctions AB;


    ABFunctions sc;

    public void resetData() {                                        // that will reset all of the private data in the AreaBtwn object to 0, zero

        length = 0;
        width = 0;
        N = 0;
        Low = 0;
        High = 0;
        gx = 0;

    }

    public void set_Gx(double b) {
        this.gx = b;


    }

    public void setDomain(double low, double high) {                // sets the domain

        this.Low = low;
        this.High = high;

    }

    public void setIterations(int n) {                              // sets number of slices
        this.N = n;


    }

    public double CalcAreaBetween(double m, double b) {           //This method should call the setLineData, and calcAreaLinear methods

        setIterations(this.N);
        set_Gx(this.gx);
        setDomain(this.Low, this.High);


        this.width = (this.High - this.Low) / this.N;
        this.length = M * this.Low + b - this.gx;

        for (double x = 0; x < this.N; x++) {

            area = Math.abs(this.length + this.width);
            this.Low += this.width;
            this.length = m * Low + b - this.gx;

            this.area += Acc;
        }
        return this.area;
    }


   // public double CalcAreaBetween(double a, double h, double c) {   // This method should call the setQuadraticData, and calcAreaQuadratic methods

    //}



    //public double CalcAreaBetween(abFunctions functions, double a, double k, double c, double d, boolean degrees) {

    //}




    private void setLineData(double m, double b) {              // grabs parameters from main. sets datatype from AreaBtwn to refer to the main

        M = m;
        B = b;

        }


    private void setQuadraticData(double a, double h, double c) {

        A = a;
        H = h;
        C = c;

    }

    private void setSinusoidalData(ABFunctions f, double a, double k, double c, double d, boolean degrees){

        A = a;
        K = k;
        C = c;
        D = d;
        Degrees = degrees;
        AB = f;

        if (Degrees == false){                          // if user inputs Degrees as false, the turn the domains into radians. if true, leave it as degrees
            Low = Math.toRadians(Low);
            High = Math.toRadians(High);
            setDomain(Low, High);
        }else{
            setDomain(Low,High);

    }

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



