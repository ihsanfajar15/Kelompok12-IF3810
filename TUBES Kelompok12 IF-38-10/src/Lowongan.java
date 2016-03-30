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
    final BerkasLamaran[] berkasDiterima;
    private int nBerkas;
   

 public void addBerkas(BerkasLamaran b, BerkasLamaran[] BerkasLamaran){ 
    if (nBerkas<berkasDiterima.length){
        BerkasLamaran[nBerkas]=b;
        nBerkas++;
   }else {
     System.out.println("Lowongan sudah full");
  }
} 


public void pindahBerkasMasuk(int jumlahBerkas){
    berkasDiterima[jumlahBerkas] = new BerkasLamaran();
    berkasDiterima[jumlahBerkas] = BerkasLamaran[nBerkas];
    jumlahBerkas++;
}


public BerkasLamaran getBerkasID(int targetID){ 
    BerkasLamaran foundBerkas;

    for(BerkasLamaran b : berkasDiterima){ 
        if(BerkasLamaran.getId() == targetID){ 
            foundBerkas = b; 
            break; 
        } 
    } 
    if(foundAccount != null){ 
        return foundBerkas; 
    }else{ 
        return null; 
    } 
}


    public BerkasLamaran getBerkasMasukIndex(int index){
        return berkasMasuk[index];
    }
    
    public void removeBerkas(int targetID){ 
    //removeLowongan from List
    BerkasLamaran foundBerkas;
 
    for(BerkasLamaran a : berkasMasuk){ 
        if(BerkasLamaran.getId_berkas() == targetID){ 
            a = null; 
            break; 
        } 
     }
      public String toString(){
            String x = "Berkas Lamaran yang Diterima :  " +this.getBerkasID(nBerkas)+
                       "\Berkas Masuk :  "+this.getBerkasMasukIndex(int index);
            return x;
        }
   
    }
  
