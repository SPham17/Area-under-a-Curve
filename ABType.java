package com.company;

import java.util.Scanner;

/**
 * Created by 07517pha on 11/10/2017.
 */
public class ABType {
    private double linear;
    private double quadratic;
    private double sine;
    private double linearArea;
    private double quadraticArea;
    private double sinArea;
    private double cosArea;
    private double length;
    private double width;

    public void setLinearArea(double acc, double m, double b, double d1, double d2, double a, double gx) {

        width = ( d1 - d2) / acc;               // gets the width of the small rectangles, divides it by the the amount rectangles to make all the rectangles even
        length = m * d1 + b - gx;               // gets the length (height) of the small rectangles

        for (double x = 0; x < acc; x++){       // repeats

            linear = Math.abs(length + width);
            d1 += width;
            length = m * d1 + b - gx;

           this.linearArea += linear;
        }
    }
    public double getLinearArea(){

        return linearArea;
    }

    public void setQuadraticArea(double acc, double b, double d1, double d2, double a, double gx, double c){

        width = ( d1 - d2) / acc;
        length = a * (d1*d1) + b * d1 + c - gx;

        for (double x = 0; x < acc; x++){

            quadratic = Math.abs(length + width);
            d1 += width;
            length = a * (d1*d1) + b * d1 + c - gx;

            this.quadraticArea += quadratic;
        }

    }
    public double getQuadraticArea(){

        return quadraticArea;
    }

    public void setSinArea(double acc, double k, double b, double d1, double d2, double a, double gx, double c, double d){

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

    public double getSinArea(){

        return sinArea;
    }

    public void setCosArea(double cosArea){
        this.cosArea = cosArea;
    }
    public double getCosArea(){
        return cosArea;
    }








}



