package model;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ihsan
 */
public class Perusahaan extends Orang implements Serializable{
    private Lowongan[] daftarLowongan;
    private static int countPerusahaan = 1;

    public Perusahaan(String nama, String id) {
        super(nama, id);
    }
    
    public void createLowongan(){ 
        daftarLowongan[jumlahLowongan] = new Lowongan(); 
        jumlahLowongan++; 
    } 
    
    public void removeLowongan(){
    }
     
    public Lowongan getLowonganIndex(int index){ 
        return daftarLowongan[index];
    }
    
    public Lowongan getLowonganId(int id){ 
        }

    @Override
    public String toString() {
        return("Nama Perusahaan : " + getNama() + "\n" + "ID Perusahaan : " + getId());
    } 
    
}
