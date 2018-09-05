/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorphishm;

/**
 *
 * @author ASUS
 */
public class SubClass extends SuperClass{ 
    
    public static void main (String[]args)
    {
    
    SuperClass ovm = new SuperClass();
    System.out.println(ovm.hitung(1.5 , 2.5));
    System.out.println(ovm.hitung(5,5));
    }

@Override
double hitung(double nilai1, double nilai2)
{
return nilai1 + nilai2;
}
}