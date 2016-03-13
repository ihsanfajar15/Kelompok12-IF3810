/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ihsan
 */
public class Lowongan {
    private BerkasLamaran[] berkasMasuk;
    private BerkasLamaran[] berkasDiterima;
    private int jumlahBerkas;


 public void addBerkasMasuk(){
        berkasMasuk[jumlahBerkas] = new BerkasLamaran(); 
        jumlahBerkas++; 
}

  public void pindahBerkasMasuk(){
        berkasDiterima[jumlahBerkas] = new BerkasLamaran();
        jumlahBerkas++;
    }
  
  public BerkasLamaran getBerkasMasukID(int id){
        return berkasMasuk[id];
    }


public BerkasLamaran getBerkasMasukIndex(int index){
        return berkasMasuk[index];
    }
    
 public BerkasLamaran getBerkasDiterimaIndex(int index){
        return berkasDiterima[index];
    }

   public void removeBerkas(){
    }
}
