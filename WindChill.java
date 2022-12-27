package com.blz.functionalprogram;

import java.util.Scanner;

public class WindChill {
    public static void NWS(int v, int t) {
        if(t > 50 && v > 120 && v < 3)
            System.out.println("Invalid Input!!!");
        else {
            double w = 35.74 + (0.6215 * t) + Math.pow((((0.4275 * t) + 35.75) * v), 0.16);
            System.out.println("The Wind Chill is : " + w);
        }
    }
    public static void main(String[] args) {
        int v, t;
        double w;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Speed of wild (in miles per hour) : ");
        v = scan.nextInt();
        System.out.println("Enter the Temperature (in Fahrenheit) : ");
        t = scan.nextInt();
        NWS(v, t);
    }
}
