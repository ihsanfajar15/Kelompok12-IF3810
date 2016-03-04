/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ihsan
 */
public abstract class Orang {
    private String nama;
    private String alamat;
    private String ktp;
    private int umur;
    
    
    public Orang (String nama) {
        this.nama = nama;
    } 
    
    public Orang (String nama, String alamat, String ktp, int umur){
        this.nama = nama;
        this.alamat = alamat;
        this.ktp = ktp;
        this.umur = umur;
    }
    
    public void setNama (String nama){
        this.nama = nama;
    }
    
    public String getNama (){
        return nama;
    }
    
    public void setAlamat (String alamat){
        this.alamat = alamat;
    }
    
    public String getAlamat (){
        return alamat;
    }
    
    public void setKtp (String ktp){
        this.ktp = ktp;
    }
    
    public String getKtp (){
        return ktp;
    }
    
    public void setUmur (int umur){
        this.umur = umur;
    }
    
    public int getUmur (){
        return umur;
    }
    
}
