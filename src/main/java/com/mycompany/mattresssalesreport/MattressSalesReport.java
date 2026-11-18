/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mattresssalesreport;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class MattressSalesReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Store the names of the three mattresses
        String[] mattressNames = {"Cozy Nights Monarch","Restonic Barbados","Sealy Phuket"};

        // Storing the sales for each mattress over three months using a 2D array
        int[][] sales = new int[mattressNames.length][3];

        //Capturing the sales report using nested for loop
        for (int row = 0; row < mattressNames.length; row++) {

            for (int col = 0; col < sales[row].length; col++) {

                System.out.print("Enter number of sales for month "
                        + (col + 1) + " for " + mattressNames[row] + ": ");

                sales[row][col] = input.nextInt();
            }

            System.out.println();
        }

        // AN OBJECT OF THE PRODUCT CLASS
        Product product = new Product(mattressNames, sales);

        PrintProduct report = new PrintProduct();

        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("****************************************");

        report.PrintTotalProductSales(product);
        report.PrintAverageProductSales(product);
        report.PrintMostPopularProduct(product);
    }
}