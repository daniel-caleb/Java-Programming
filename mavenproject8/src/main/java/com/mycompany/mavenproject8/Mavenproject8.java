/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject8;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Meshewa
 */
public class Mavenproject8 {

    public static void main(String[] args) {
       try{  
     File file = new File("names.txt");
        BufferedReader br;

                
            FileInputStream fileInputStream = new FileInputStream(file);
            
            // Create a Scanner to read from the FileInputStream
            Scanner scanner = new Scanner(fileInputStream);
           
            // Read and print each line from the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);}
        }catch (Exception e){
                  System.out.println(e);  
                    }
    }
}