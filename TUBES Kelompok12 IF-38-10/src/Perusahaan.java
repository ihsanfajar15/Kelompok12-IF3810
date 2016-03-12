/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ihsan
 */
public class Perusahaan extends Orang{
    private Lowongan[] daftarLowongan;
    private long id_perusahaan;
    private int jumlahLowongan;
    
    public Perusahaan(String nama, String alamat, long id_perusahaan){
        this.nama = nama;
        this.alamat = alamat;
        this.id_perusahaan = id_perusahaan;   
    }

    public void setId_perusahaan(long id_perusahaan) {
        this.id_perusahaan = id_perusahaan;
    }

    public long getId_perusahaan() {
        return id_perusahaan;
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
    } 
    
    
}
