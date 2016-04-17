/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.ControllerPelamar;
import controller.ControllerPerusahaan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import model.Aplikasi;
import model.Main;
import view.MainMenu;

/**
 *
 * @author ihsan
 */
public class ControllerMainMenu implements ActionListener {

    MainMenu mainmenu;
//    ArrayList<MainMenu> listMain = new ArrayList<>();
    Aplikasi app;

    public ControllerMainMenu(Aplikasi app) {
        this.mainmenu = new MainMenu();
        this.mainmenu.setVisible(true);
        
        this.app= app;

        this.mainmenu.getPerusahaan().addActionListener(this);
        this.mainmenu.getPelamar().addActionListener(this);

    }
    
//    public void setListMain(ArrayList<Main> listMain){
//        this.listMain= listMain;
//    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if(x.equals(mainmenu.getPerusahaan())){
            this.mainmenu.setVisible(false);
            ControllerPerusahaan cmm= new ControllerPerusahaan(app);
            
        }
        
        else if(x.equals(mainmenu.getPelamar())){
            this.mainmenu.setVisible(false);
            ControllerPelamar cp = new ControllerPelamar(app);
        }

    }

}
