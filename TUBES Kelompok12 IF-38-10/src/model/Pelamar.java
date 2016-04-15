package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;

/**
 *
 * @author ihsan
 */
public class Pelamar extends Orang implements Serializable {
    private BerkasLamaran berkas;
    private static int countPelamar = 1;

    public Pelamar(String nama, String id) {
        super(nama, id);
    }
    
    public void createBerkas(BerkasLamaran b){
         berkas = b;
    }
       
    @Override
    public String toString() {
        return("Nama Pelamar : " + getNama() + "\n" + "ID Pelamar : " + getId());
    }
    
}
