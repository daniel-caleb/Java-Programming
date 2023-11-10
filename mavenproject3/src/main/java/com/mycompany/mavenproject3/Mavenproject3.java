/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

/**
 *
 * @author Meshewa
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        int y = 75000;
        if (y >= 150000){
            System.out.println("Senior Manager");
        }
        else if((y>=100000) && (y<150000)){
        System.out.println("Manager");
        }
        else if((y>=30000) && (y<100000)){
        System.out.println("Supervisor");
        }
    }
}
