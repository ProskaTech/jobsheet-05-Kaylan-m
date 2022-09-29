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
 * @author Kayla Nahda Muadzah (21343052)
 */
public class BufferedReader1 {
    public static void main(String[] args ) {
     BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
     String a, b;
     float angka1, angka2, jumlah;
     System.out.println("Program Penjumlahan Dua Buah Bilangan");
     
     try {
         System.out.print("Masukkan angka pertama :");
         a = dataIn.readLine();
         /*Data yang akan diproses aritmatika harus dikonversikan dulu 
           dari tipe data String ke tipe data angka yang diperlukan.
           Data yang diperoleh dari inputan kelas BufferedReader tipe datanya selalu String*/
         angka1 = Float.parseFloat(a); //konversikan dari String ke float
         
         System.out.print("Masukkan angka kedua :");
         b = dataIn.readLine();
         angka2 = Float.parseFloat(b);//konversi dari String ke float
         
         jumlah = angka1 + angka2;
         System.out.println("Jumlah :" + jumlah);
        }
     
         catch (IOException e) {
            System.out.println("gagal membaca keyboard");
         }
}
}
