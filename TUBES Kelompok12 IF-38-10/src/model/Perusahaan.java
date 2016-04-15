package model;

import java.io.Serializable;
import java.util.ArrayList;

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
    private ArrayList<Lowongan> daftarLowongan = new ArrayList();
    private static int countPerusahaan = 1;

    public Perusahaan(String nama, String id) {
        super(nama, id);
    }
    
    public String createLowongan(){ 
        Lowongan LWG;
        //Object created di dalam method (komposisi)
        String id = Integer.toString(daftarLowongan.size() + 1);
        LWG = new Lowongan("Lowongan" + id);
        //Insert it to array list
        daftarLowongan.add(LWG);
        return LWG.getIdLowongan();
        
    } 
    
    public void removeLowongan(String IdLowongan){
    }
     
    public Lowongan getLowonganIndex(int index){ 
         try {
            return daftarLowongan.get(index);
        } catch (Exception e) {
            return null; //Jika tidak ditemukan; indexoutofbonds
        }
    }
    
    public Lowongan getLowonganId(int id){ 
        for(Lowongan LWG : daftarLowongan){
            if(LWG.getIdLowongan().equals(id))
                return LWG;
        }
        return null; //Jika tidak ditemukan
    }

    @Override
    public String toString() {
        return("Nama Perusahaan : " + getNama() + "\n" + "ID Perusahaan : " + getId());
    } 
    
}
