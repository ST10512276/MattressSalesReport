/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mattresssalesreport;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */

public class MattressSalesReportTests {

    // Test whether the total products sold is calculated correctly
    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {

        String[] mattressNames = {"Cozy Nights Monarch","Restonic Barbados","Sealy Phuket"};

        int[][] sales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };

        Product product = new Product(mattressNames, sales);

        //Calculates the total products sold
        int result = product.GetTotalProductsSold();

        //Checks if the total is correct
        assertEquals(153, result);
    }

    // Test whether the average products sold is calculated correctly
    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {

        // Arrange: Create the mattress names and sales data
        String[] mattressNames = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        int[][] sales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };

        Product product = new Product(mattressNames, sales);

        //Calculates the average products sold
        double result = product.GetAverageProductSold();

        //Checks if the average is correct
        assertEquals(17.0, result, 0.001);
    }
}