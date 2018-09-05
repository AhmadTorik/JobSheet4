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
public class Singa extends hewan {
    
    @Override
    void setNama()
    {
        String Singa = "Diablo";
        System.out.println("Nama Singa : "+Singa);
    }
     @Override
    void setSuara()
    {
        String suara = "Roaaaarrrrr";
        System.out.println("Suara Singa: "+suara);
    }
    @Override
    void setBerat()
    {
        double berat = 10.0;
        System.out.println("Berat Kucing: "+berat+" Kg");
    }
}
