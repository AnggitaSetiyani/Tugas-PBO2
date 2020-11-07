/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ruang;
import Bidang.PersegiPanjang;

/**
 *
 * @author Anggita
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {
    int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume(){
        return luas()*tinggi;
    }
    
    @Override
    public double luaspermukaan(){
        return 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
    }
    
}