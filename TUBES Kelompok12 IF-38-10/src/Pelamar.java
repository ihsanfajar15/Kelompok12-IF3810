/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ihsan
 */
public class Pelamar extends Orang {
    private BerkasLamaran berkas;
    private long id_ktp;
    
    public Pelamar(String nama, String alamat, long id_ktp){
        this.nama = nama;
        this.alamat = alamat;
        this.id_ktp = id_ktp;
    }

    public void setId_ktp(long id_ktp) {
        this.id_ktp = id_ktp;
    }

    public long getId_ktp() {
        return id_ktp;
    }
    
    public void createBerkas(BerkasLamaran b){
         berkas = b;
    }
    
}
