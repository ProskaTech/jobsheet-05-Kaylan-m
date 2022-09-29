## Created by Kayla Nahda Muadzah (21343052)
Pada jobsheet 5 ini kita diperkenalkan dengan Kelas Scanner, Kelas Bufferedreader dan Kelas JOptionpPane yang dimana ketiga kelas tersebut untuk bisa mendapatkan input dari Keyboard untuk Scanner dan BufferedReader melalui layar console atau layar software pembuat program sedangkan JOptionPane melalui layar GUI yang menggunakan bahasa pemrograman Java.

Untuk bisa menggunakan kelas tersebut kita harus mengimportnya terlebih dahulu kedalam program yaitu dengan cara :

Untuk Kelas Scanner berada pada paket java.util maka cara importnya adalah import java.util.Scanner;
Untuk Kelas Bufferedreader cara importnya terdapat 3 buah dengan cara sebagai berikut : a. import java.io.BufferedReader; b. import java.io.InputStreamReader; c. import java.io.IOException;
Untuk Kelas JOptionPane cara importnya adalah import Javax.swing.JOptionPane; atau bisa ditulis dengan import javax.swing.*;
Untuk pendeklarasian setiap kelas juga berbeda - beda terdiri dari :

Untuk Kelas Scanner deklarasinya Scanner BacaInput = new Scanner(System.in);
Untuk Kelas BufferedReader deklarasinya BufferedReader DataMasuk = new BufferedReader (new InputStreamReader(System.in));
Untuk Kelas JOptionPane deklarasinya Nama = JOptionPane.showInputDialog("Silahkan Masukan Nama Anda"); deklarasi ini membuat sebuah input dialog yang akan menampilkan sebuah dialog pesan,sebuah textfile dan tombol OK dan hasil dari dialog tersebut adalah string dan disimpan dalam variabel Nama.
Untuk Kelas Scanner mempunyai method yang berbeda untuk membaca tipe data yang diinputkan melalui keyboard yaitu dengan next(tipedata)() contohnya untuk tipe data String dia menggunakan nextLine(); dan untuk tipedata int dia menggunakan nextInt(); dan sebagainya. Untuk Kelas BufferedReader method untuk membaca inputan dari keyboardnya dengan menggunakan read(); atau readLine(); contohnya untuk tipe data String dia menggunakan readLine();.

Perbedaan dari ketiga kelas tersebut yaitu :

Untuk Kelas Scanner ketika ada perhitungan matematika maka variabel yang digunakan tidak perlu di konversikan bisa langsung dihitung.
Untuk Kelas BufferedReader ketika ada perhitungan matematika mava variabel perlu dikonversikan sebelum dihitung.
JOptionPane merupakan kelas yang digunakan untuk input dan output data berbasis GUI swing yaitu tampilan berupa dialog box.
