/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssalesreport;

/**
 *
 * @author Student
 */
public interface IProduct {

    // Method to return the total products sold
    int GetTotalProductsSold();

    // Method to return the average products sold
    double GetAverageProductSold();

    // Method to return the most popular product
    String GetMostPopularProduct();
}