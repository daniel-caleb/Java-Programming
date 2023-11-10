/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._10_2023;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Meshewa
 */
public class IOStreams {
    public static void main(String[] args) {
        // TODO code application logic here
//        reading ree = new reading();
//        ree.reed();
//       int data[]={3,5,7,1,4};
//        Arrays.sort(data); 
             Scanner scanner = new Scanner(System.in);
             System.out.println("enter name");
    String names = scanner.nextLine();
     
        try {
       
     File myObj = new File("names.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
       System.out.println("File already exists.");
      }
            FileWriter myWriter = new FileWriter("MAJINA.txt", true);
      myWriter.write(names + "\n");
   myWriter.close(); 
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
}