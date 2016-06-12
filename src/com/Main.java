package com;

public class Main {

    public static void main(String[] args) {
    	double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double h = Double.parseDouble(args[2]);
        double x ;


        for( x=a; x<=b;x+=h ){
            double f =Math.tan(2*x)-3;
            System.out.println("" + x + ": " + f);
        }
    }

}
