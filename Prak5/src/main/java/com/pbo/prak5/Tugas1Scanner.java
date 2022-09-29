/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.prak5;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Tugas1Scanner {
     public static void main(String args []) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter word1: ");
        String word1 = in.nextLine();
        
        System.out.print("Enter word2: ");
        String word2 = in.nextLine();
        
        System.out.print("Enter word3: ");
        String word3 = in.nextLine();
        
        System.out.println("\nEnter word1 : " + word1 +
                           "\nEnter word2 : " + word2 +
                           "\nEnter word3 :" + word3 +
                           "\nGoodbye and Hello");
    }
    
}
