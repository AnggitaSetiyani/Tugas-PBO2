/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ruang;

import Bidang.Lingkaran;

/**
 *
 * @author Anggita
 */
public class Kerucut extends Lingkaran implements MenghitungRuang{
    public int tinggi, garispelukis ;

    public Kerucut(int jari, int tinggi, int garispelukis) {
        super(jari);
        this.tinggi = tinggi;
        this.garispelukis = garispelukis;
    }
    
    @Override
    public double volume(){
        return 0.33*luas()*tinggi;
    }
    
    @Override
    public double luaspermukaan(){
        return luas() + (Math.PI*jari*garispelukis);
    }
}

