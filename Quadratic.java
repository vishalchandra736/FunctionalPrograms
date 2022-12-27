package com.blz.functionalprogram;

import java.util.Scanner;
public class Quadratic {
    public static void quadRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - (4 * a * c);
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The Roots are : " + root1 + " and  " + root2);
        }
        else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("The Root is : " + root);
        }
        else {
            System.out.println("Roots are not real");
        }
    }

    public static void main(String[] args) {
        double a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 'a' value : ");
        a = scan.nextDouble();
        System.out.println("Enter the 'b' value : ");
        b = scan.nextDouble();
        System.out.println("Enter the 'c' value : ");
        c = scan.nextDouble();
        System.out.println("Equation is : " + a + "x*x + " + b + "x + " + c);
        quadRoots(a, b, c);
    }
}
