/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ihsan
 */
public class BerkasLamaran {
    
private long id_berkas;
        private String nama;
        private String alamat;
        private String tanggalLahir;
        private String jurusan;
        private String sekolahTinggi;
        private int tahunLulus;

    public BerkasLamaran(long id_berkas, String nama, String alamat, String tanggalLahir, String jurusan, String sekolahTinggi, int tahunLulus) {
        this.id_berkas = id_berkas;
        this.nama = nama;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
        this.jurusan = jurusan;
        this.sekolahTinggi = sekolahTinggi;
        this.tahunLulus = tahunLulus;
    }

    BerkasLamaran() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void setId_berkas(long id_berkas) {
        this.id_berkas = id_berkas;
    }

    public long getId_berkas() {
        return id_berkas;
    }

    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setSekolahTinggi(String sekolahTinggi) {
        this.sekolahTinggi = sekolahTinggi;
    }

    public void setTahunLulus(int tahunLulus) {
        this.tahunLulus = tahunLulus;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getSekolahTinggi() {
        return sekolahTinggi;
    }

    public int getTahunLulus() {
        return tahunLulus;
    }
        
    
}
