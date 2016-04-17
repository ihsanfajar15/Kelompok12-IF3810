/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.ControllerPerusahaan;
import view.TampilkanBerkasDiterima;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Aplikasi;

/**
 *
 * @author ihsan
 */
public class ControllerTampilkanBerkasDiterima implements ActionListener{
    TampilkanBerkasDiterima tp;
    Aplikasi app;

    public ControllerTampilkanBerkasDiterima(Aplikasi ap) {
        this.app = ap;
        this.tp = new TampilkanBerkasDiterima();
        this.tp.setVisible(true);

        this.tp.getBackButton().addActionListener(this);
        this.tp.getTampilkanButton().addActionListener(this);
        
    }

//    public void setLp(ArrayList<Perusahaan> lp) {
//        this.listPerusahaan = lp;
//    }
  

    
    @Override
    public void actionPerformed(ActionEvent ae) {
             Object x = ae.getSource();
        if (x.equals(tp.getBackButton())) {
            this.tp.setVisible(false);
            ControllerPerusahaan cm = new ControllerPerusahaan(app);
        }
        else if(x.equals(tp.getTampilkanButton())){
            String namaPerusahaan = tp.getNamaPerusahaanField().getText();
            String namaLowongan = tp.getNamaLowonganField().getText();
            tp.getHasilField().setText(app.displayBerkasDiTerima(namaPerusahaan, namaLowongan));
        
        }
    
}
}