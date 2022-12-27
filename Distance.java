package com.blz.functionalprogram;

import java.util.Scanner;

public class Distance {
    public static double calculateDistance(int x, int y) {
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return distance;
    }

    public static void main(String[] args) {
        int x, y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Value of x-point : ");
        x = scan.nextInt();
        System.out.println("Enter the Value of y-point : ");
        y = scan.nextInt();
        System.out.println("Distance : " + calculateDistance(x, y));
    }
}
