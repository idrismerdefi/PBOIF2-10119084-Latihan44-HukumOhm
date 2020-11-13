/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan44.hukumohm;
/**
Nama : Muhammad Idris Merdefi
Kelas : PBOIF2
NIM : 10119084
Deskripsi Program : Program ini berisi program untuk menampilkan perhitungan hukum ohm
 */
public class Baterai {
    private float kuatArus,hambatan;
    
   
     public float getKuatArus() {
        kuatArus = 3;
        return kuatArus;
    }

    
    public float getHambatan() {
        hambatan =12 ;
        return hambatan;
    }
    
    public float hitungTegangan(){
        return kuatArus * hambatan;
    }
    
    
   public void baterai(){
      System.out.println("=====Hukum Ohm=====");
      System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar");
      System.out.println("akan berbanding lurus dengan beda potensial");
      System.out.println("pada ujung-ujung kawat penghantar tersebut");
      System.out.println("asalkan suhu kawat dijaga konstan.\n");
      System.out.println("Kuat arus : "+getKuatArus()+" ampere");
      System.out.println("Hambatan : "+getHambatan()+" ohm");
      System.out.println("Hasil Tegangan : "+hitungTegangan()+" volt");
   }
    
}
