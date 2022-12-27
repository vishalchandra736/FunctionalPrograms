package com.blz.functionalprogram;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        int row, col;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of Row : ");
        row = scan.nextInt();
        System.out.println("Enter the Number of Colum : ");
        col = scan.nextInt();
        int[][] TwoDArray = new int[row][col];
        System.out.println("Enter the Input for 2D Array : ");
        for (int i=0; i<row; i++) {
            System.out.println("Enter the Input in Row " + (i+1) + " : ");
            for (int j=0; j<col; j++) {
                System.out.print("Enter the Input in Colum " + (j+1) + " : ");
                TwoDArray[i][j] = scan.nextInt();
            }
        }
        System.out.println("2D Array was Printed : ");
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                System.out.print(TwoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
