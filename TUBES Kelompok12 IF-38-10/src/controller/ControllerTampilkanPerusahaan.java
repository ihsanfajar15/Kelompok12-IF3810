/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.ControllerPerusahaan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.Aplikasi;
import model.Perusahaan;
import view.TampilkanPerusahaan;
import javax.swing.JOptionPane;

/**
 *
 * @author ihsan
 */
public class ControllerTampilkanPerusahaan implements ActionListener {

    //ArrayList<Perusahaan> listPerusahaan = new ArrayList<>();
    TampilkanPerusahaan tp;
    Aplikasi app;
    Perusahaan p;

    public ControllerTampilkanPerusahaan(Aplikasi ap) {
        this.app = ap;
        this.tp = new TampilkanPerusahaan();
        this.tp.setVisible(true);

        this.tp.getBackButton().addActionListener(this);
        this.showDatas();
    }

//    public void setLp(ArrayList<Perusahaan> lp) {
//        this.listPerusahaan = lp;
//    }
    public void showDatas() {

        tp.getHasilField().setText(app.displayPerusahaan());
        app.displayPerusahaan();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if (x.equals(tp.getBackButton())) {
            this.tp.setVisible(false);
            ControllerPerusahaan cm = new ControllerPerusahaan(app);

        }
    }

}
