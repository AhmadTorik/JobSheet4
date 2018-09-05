/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverridingMethod;

/**
 *
 * @author ASUS
 */
public class Kucing extends hewan {
    @Override
    void setNama()
    {
        String Kucing = "Carberus";
        System.out.println("Nama Kucing : "+Kucing);
    }
    @Override
    void setSuara()
    {
        String suara = "Meow Meow Miauw";
        System.out.println("Suara Kucing: "+suara);
    }
    @Override
    void setBerat()
    {
        double berat = 2.0;
        System.out.println("Berat Kucing: "+berat+" Kg");
    }
}
