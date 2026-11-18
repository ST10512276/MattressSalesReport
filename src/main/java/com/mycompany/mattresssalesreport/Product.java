/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssalesreport;

/**
 *
 * @author Student
 */
public class Product implements IProduct {

    String[] mattressNames;
    int[][] sales;

    // Constructor to receive the mattress names and sales data
    public Product(String[] mattressNames, int[][] sales) {
        this.mattressNames = mattressNames;
        this.sales = sales;
    }

    // Calculate the total number of products sold
    @Override
    public int GetTotalProductsSold() {

        int total = 0;

        for (int row = 0; row < sales.length; row++) {

            for (int col = 0; col < sales[row].length; col++) {

                total = total + sales[row][col];
            }
        }

        return total;
    }

    // Calculate the average number of products sold
    @Override
    public double GetAverageProductSold() {

        int total = GetTotalProductsSold();

        int count = sales.length * sales[0].length;

        return (double) total / count;
    }

    // Find the mattress with the highest total sales
    @Override
    public String GetMostPopularProduct() {

        int highestTotal = 0;
        int highestIndex = 0;

        for (int row = 0; row < sales.length; row++) {

            int total = 0;

            for (int col = 0; col < sales[row].length; col++) {

                total = total + sales[row][col];
            }

            if (total > highestTotal) {
                highestTotal = total;
                highestIndex = row;
            }
        }

        return mattressNames[highestIndex];
    }
}