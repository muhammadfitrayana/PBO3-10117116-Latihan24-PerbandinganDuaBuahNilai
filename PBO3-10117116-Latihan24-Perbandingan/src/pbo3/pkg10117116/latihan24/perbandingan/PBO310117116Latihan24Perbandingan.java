/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan24.perbandingan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program Perbandingan Dua Buah Nilai
 *  
 */
public class PBO310117116Latihan24Perbandingan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;
        String ulang;
        
        Scanner baca = new Scanner (System.in);
        
        System.out.println("====PROGRAM PERBANDINGAN NILAI====");
        System.out.println("");
        
     do{   
        System.out.print("Masukan Nilai Pertama : ");
        a = baca.nextInt();
        
        System.out.print("Masukan Nilai Kedua   : ");
        b = baca.nextInt();
        
        
        
        if (a < b) {
            System.out.println("Hasil : " + a + " Lebih Kecil dari " + b);
        }
        else if (a > b) {
            System.out.println("Hasil : " + a + " Lebih Besar dari " + b);
        }    
        else
            System.out.println("Hasil : " + a + " Sama Dengan " + b);
            
         System.out.println(""); 
        System.out.print("Ulangi Aktifitas ? (YA/TIDAK) : ");
      ulang = baca.next();
      
         System.out.println("");
     }
     while(!ulang.equals("TIDAK"));
    }
}  

