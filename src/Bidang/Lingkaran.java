/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bidang;

/**
 *
 * @author Anggita
 */
public class Lingkaran implements MenghitungBidang {
    public int jari;

    public Lingkaran(int jari) {
        this.jari = jari;
    }
    
    @Override
    public double luas(){
        return Math.PI*jari*jari;
    }
    
    @Override
    public double keliling(){
        return 2*Math.PI*jari;
    }
}
