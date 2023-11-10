/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

/**
 *
 * @author Meshewa
 */
public class Mavenproject5 {

    public static void main(String[] args) {
        int n = 40; // Number of Fibonacci numbers to generate
        long[] fibonacci = new long[n];

        // Initialize the first two Fibonacci numbers
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Calculate the remaining Fibonacci numbers
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Print the first 40 Fibonacci numbers
        System.out.println("First 40 Fibonacci Numbers:");
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci[i]);
        }
    }
}
