/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Bidang.Lingkaran;
import Bidang.PersegiPanjang;
import Ruang.Balok;
import Ruang.Kerucut;
import java.util.Scanner;

/**
 *
 * @author Anggita
 */
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int pilih;
        char jawab;
        
        do
       {
           System.out.println("Menu");
           System.out.println("1. Balok");
           System.out.println("2. Kerucut");
           System.out.println("3. Exit");
           System.out.print("Pilih : ");
           pilih = input.nextInt();
           
           switch(pilih)
           {
               case 1 :
                   System.out.print("Panjang\t : ");
                   int panjang = input.nextInt();
                   System.out.print("Lebar\t : ");
                   int lebar = input.nextInt();
                   System.out.print("Tinggi\t : ");
                   int tinggi = input.nextInt();
                   PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
                   Balok balok = new Balok (panjang, lebar, tinggi);
                   System.out.println("------OUTPUT------");
                   System.out.println("Luas Persegi\t\t : "+pp.luas());
                   System.out.println("Keliling Persegi\t : "+pp.keliling());
                   System.out.println("Volume Balok\t\t : "+balok.volume());
                   System.out.println("Luas Permukaan Balok\t : "+balok.luaspermukaan());
                break;
                
               case 2 :
                   System.out.print("Jari-Jari\t : ");
                   int jari = input.nextInt();
                   System.out.print("Tinggi\t\t : ");
                   tinggi = input.nextInt();
                   System.out.print("Garis Pelukis(S) : ");
                   int garispelukis = input.nextInt();
                   Lingkaran lingkaran = new Lingkaran(jari);
                   Kerucut kerucut = new Kerucut(jari, tinggi, garispelukis);
                   System.out.println("------OUTPUT------");
                   System.out.println("Luas Lingkaran\t\t : "+lingkaran.luas());
                   System.out.println("Keliling Lingkaran\t : "+lingkaran.keliling());
                   System.out.println("Volume Kerucut\t\t : "+kerucut.volume());
                   System.out.println("Luas Permukaan Kerucut   : "+kerucut.luaspermukaan());
                break;
                
               
           }
          System.out.print("Ingin kembali ke menu?");
          jawab = input.next().charAt(0);
        } while (jawab == 'y');
        
    }
    
}
