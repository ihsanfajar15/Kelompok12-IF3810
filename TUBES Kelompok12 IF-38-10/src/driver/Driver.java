/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import controller.ControllerMainMenu;
import model.Aplikasi;

/**
 *
 * @author ihsan
 */
public class Driver {
    public static void main(String[] args) {
        
        
        Aplikasi app= new Aplikasi();
        app.addPerusahaan("Bukalapak", "Bukalapak");
        app.addPerusahaan("Gojek", "Gojek");
        app.addPerusahaan("ihsan", "ihsanfajar15");
        
        app.getPerusahaan("ihsanfajar15").createLowongan("L01", "Designer", "20 April 2016");
        
        
        app.addPelamar("garincha", "P02");
        app.getPelamar("garincha").createBerkas("B02", "Docs", "23 April 2016");
        app.getPerusahaan("ihsanfajar15").getLowongan("Designer").addBerkas(app.getPelamar("garincha").getBerkas("B01"));
        
        
        app.addPelamar("arief", "P03");
        
          ControllerMainMenu cmm = new ControllerMainMenu(app);
    }
  
    
}

