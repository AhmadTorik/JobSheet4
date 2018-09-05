/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPratikum;

/**
 *
 * @author ASUS
 */
public class Test {
    public static void main (String []args)
    {
        RataNilai R = new RataNilai();
        System.out.println("Rata Nilai 21 dan 13 adalah : "+ R.average(21, 13));
        System.out.println("Rata Nilai 19.3 dan 39.5 adalah : "+ R.average(19.3,39.5));
        System.out.println("Rata Nilai 123, 567 dan 744 adalah : "+ R.average(123, 567, 744));
        
        
    }
}
