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
public abstract class Orang implements Serializable {
    private String nama;
    private String id;

    public Orang(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public abstract String toString();
    
 
}
