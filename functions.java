package com.company;

import java.util.Scanner;

/**
 * Created by 07517pha on 11/10/2017.
 */
public class functions {
    private double domain;
    private double range;
    private double linearArea;
    private double quadraticArea;
    private double sinArea;
    private double cosArea;
    private double Acc;
    private double y1;
    private double y2;
    private double area1;
    private double area2;
    private double dx;
    private double rec;

    public void setDomain(double d1) {

        this.domain = d1;
    }
    public double getDomain() {

        return domain;
    }

    public void setRange(double theRange) {

        this.range = theRange;
    }
    public double getRange() {

        return range;
    }

    public void setLinearArea(double acc, double b, double d1, double d2, double slope, double gx) {


        area1 =
        area2 =

        this.linearArea = b;

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



