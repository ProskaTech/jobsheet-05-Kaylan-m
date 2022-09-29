/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.prak5;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author acer
 */
public class Tugas1BufferedReader {
      public static void main(String args[]) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String word1 = "", word2 = "", word3 = "";
        
        try {
           System.out.print("Enter word1 :");
           word1 = dataIn.readLine();
           System.out.print("Enter word2 :");
           word2 = dataIn.readLine();
           System.out.print("Enter word3 :");
           word3 = dataIn.readLine();
        }
        
        catch (IOException e) {
            System.out.println("gagal membaca keyboard");
        }
        System.out.println("\nEnter word1 : " + word1 +
                           "\nEnter word2 : " + word2 +
                           "\nEnter word3 :" + word3 +
                           "\nGoodbye and Hello");
        }
    
}