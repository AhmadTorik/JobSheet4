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
public class LakiLaki extends Manusia {
     public String kelamin;
     public int TinggiBadan;
     
    public LakiLaki(int TinggiBadan) {
        this.TinggiBadan = TinggiBadan;
    }
    
    public int Tb()
    {
        return 175;
    }
     @Override
    public double BeratBadan()
    {
        return ((TinggiBadan - 100)-((TinggiBadan - 100)*10/100)-1) ;
    }
     @Override
    public String kelamin() {
        return "L";
    }
   
         
}
