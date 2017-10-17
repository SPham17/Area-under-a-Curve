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
    private double length1;
    private double length2;
    private double width;
    private double side1;
    private double side2;

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

    public void setLinearArea(double acc, double m, double y, double d1, double d2, double a, double gx) {

        length1 = m* d1 + y;
        length2 = y - gx;

        if(side1 >= length1 )
        if (side2 <= length1)
        if (side2 >= d1)
        if(side2 <= gx)


        for (double Acc = acc; Acc > 0; Acc++);

        this.linearArea = areaLinear;
    }
    public double getLinearArea(){

        return linearArea;
    }

    public void setQuadraticArea(double quadraticArea){

        this.linearArea = quadraticArea;
    }
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



