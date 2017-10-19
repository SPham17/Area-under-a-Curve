package com.company;

import java.util.Scanner;

/**
 * Created by 07517pha on 11/10/2017.
 */
public class functions {
    private double linearArea;
    private double quadraticArea;
    private double sinArea;
    private double cosArea;

    private double Acc;
    private double y1;
    private double y2;
    private double area1;
    private double area2;
    private double total;
    private double dx;
    private double x1;
    private double x2;
    private double gxint;
    private double split;



    public void setLinearArea(double acc, double b, double d1, double d2, double slope, double gx) {

        y1 = slope*d1 + b; // y value for domain 1
        y2 = slope*d2 + b; // y value for domain 2
        dx = (d2 - d1) / acc; // finds the distance between each rectangle
        gxint = gx - b / slope; // x intercept for gx and function
        Acc = Math.abs(d2) + Math.abs(d1) / acc; // determines the amount of rectangles that will be used

        for (area1 = area1; d1 < gxint || gxint < d2; acc++) { // for d1 is smaller than the x interecept, keep adding rectangles, stop adding rectangles when acc = d2
        split = d1 + d2 - gxint; // the point between the two triangles
            area1 =  dx*y1;// multiplies the distance between each rectangle with each new height

        }

        for (double Acc = acc; Acc > d1 || Acc < d2; Acc++)

            total = area1 + area2;

        this.linearArea = total;

    }
    public double getLinearArea(){

        return linearArea;
    }

    public void setQuadraticArea(double acc, double d2, double d1, double area1){

        dx = (d2 - d1) / acc;
        // finds the distance between each rectangle

        for (double Acc = acc; Acc > 0; Acc++){
            if ((d1 < d2)) {
                area1 = Acc*Acc*dx;
                continue;
            }
        //determines the height of each rectangle, also adds rectangles until it reaches the user input's number

        this.quadraticArea = area1;
    }}
    public double getQuadraticArea(){

        return quadraticArea;
    }

    public void setSinArea(double sinArea){

        this.sinArea = sinArea;
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



