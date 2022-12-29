package com.blz.functionalprogram;

import java.util.Scanner;

public class SumToZero {
    public static void main(String[] args) {
        int num, count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the No of Elements (equal or grater than 3) : ");
        num = scan.nextInt();
        int[] elements = new int [num];
        if (num < 3)
            System.out.println("Invalid input!!!");
        else {
            for(int i=0; i<elements.length; i++) {
                System.out.println("Enter the " + (i+1) + " Element : ");
                elements[i] = scan.nextInt();
            }
            for(int i=0; i<elements.length - 2; i++) {
                for(int j=i+1; j<elements.length - 1; j++) {
                    for (int k=i+2; k<elements.length; k++){
                        int sum = elements[i] + elements[j] + elements[k];
                        if (sum == 0) {
                            count ++;
                            System.out.println("Sum of (" + elements[i] +") + (" + elements[j] +") + (" + elements[k] + ") = " + sum);
                        }
                    }
                }
            }
            System.out.println("Total combination of Zero is : " + count);
        }

    }
}
