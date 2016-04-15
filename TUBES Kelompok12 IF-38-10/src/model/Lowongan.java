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
public class Lowongan implements Serializable {
    private ArrayList<BerkasLamaran> berkasMasuk = new ArrayList();
    private ArrayList<BerkasLamaran> berkasDiterima = new ArrayList();
    private String idLowongan;

    public Lowongan(String idLowongan) {
        this.idLowongan = idLowongan;
    }

    public String getIdLowongan() {
        return idLowongan;
    }

    public void setIdLowongan(String idLowongan) {
        this.idLowongan = idLowongan;
    }
    
    
    public void addBerkasMasuk(BerkasLamaran b){
        berkasMasuk.add(b);
    }
    
    public void pindahBerkasMasuk(){
    }
     
    public BerkasLamaran getBerkasMasukID(int id){
        for(BerkasLamaran BL : berkasMasuk){
            if(BL.getId_berkas() == id)
                return BL;
        }
        return null; //Jika tidak ditemukan
    }
    
    
    public BerkasLamaran getBerkasMasukIndex(int index){
       try {
            return berkasMasuk.get(index);
        } catch (Exception e) {
            return null; //Jika tidak ditemukan
        }
    }
        
    public BerkasLamaran getBerkasDiterimaIndex(int index){
            try {
            return berkasDiterima.get(index);
        } catch (Exception e) {
            return null; //Jika tidak ditemukan
        }
    }
         
}

