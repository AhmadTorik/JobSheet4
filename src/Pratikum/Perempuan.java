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
public class Perempuan extends Manusia {
     public String kelamin;
      public double TinggiBadan ;
   
    
    public Perempuan(double TinggiBadan)
    {
        this.TinggiBadan = TinggiBadan;
    }
    
    public int Tb()
    {
        return 165;
    }
    
    public double BeratBadan()
    {
        return ((TinggiBadan - 100)-((TinggiBadan - 100)*15/100)-3.25) ;
    }

    @Override
    public String kelamin() {
        return "P";
    }
    
   
}
