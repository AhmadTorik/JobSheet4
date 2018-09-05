/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Test {
    Scanner masukan = new Scanner (System.in);
    public static void main(String[]args){
    Manusia by = new LakiLaki(175);
    System.out.println("User 1");
    System.out.println("Masukkan Tinggi Badan Anda (cm) = "+by.Tb());
    System.out.println("Masukkan Jenis Kelamin Anda (L/P) = "+by.kelamin());
    System.out.println ("Berat Badan Ideal Laki Laki ini Adalah  " + by.BeratBadan());
    System.out.println();
    Manusia be = new Perempuan(165);
     System.out.println("User 2");
    System.out.println ("Masukkan Tinggi Badan Anda (cm) = "+be.Tb());
    System.out.println("Masukkan Jenis Kelamin Anda (L/P) = "+be.kelamin());
    System.out.println ("Berat Badan Ideal Perempuan ini Adalah " + be.BeratBadan());
}

}
