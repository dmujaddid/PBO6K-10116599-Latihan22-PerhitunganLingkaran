/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Robby Eka Purnama
 * KELAS    : PBO6K
 * NIM      : 10116599
 * Deskripsi Program : Program perhitungan yang inputannya berasal dari user.
 * 
 */
public class PBO6K10116599Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Variabel
        double luas, diameter, jariJari, keliling;
        
        
        System.out.println("=======Perhitungan Lingkaran=======");
        Scanner scan = new Scanner(System.in);
        
        
        // Input diameter oleh user
        do {
        System.out.print("Masukkan nilai diameter lingkaran : ");
        //diameter=scan.nextDouble();
        while (!scan.hasNextDouble()) {
        System.out.println("Nilai Diameter tidak sesuai");
            System.out.println();
            System.out.print("Masukkan nilai diameter lingkaran : ");
        scan.next(); // this is important!
        }
        diameter = scan.nextDouble();
        } while (diameter <= 0);
       
              
        // Rumus Perhitungan
        jariJari=(diameter/2);
        luas = 3.14*jariJari*jariJari;
        keliling = 3.14*diameter;
        
        
        // Menampilkan Perhitungan
        System.out.println();
        System.out.println("=======Hasil Perhitungan Lingkaran=======");
        System.out.println("Jari-jari lingkaran\t: " +jariJari+ " cm");
        System.out.println("Luas lingkaran\t\t: " +luas+  " cm");
        System.out.println("Keliling lingkaran\t: " +keliling+  " cm");
        
    }
    
}
