/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ihsan
 */
public class Main {
        static Perusahaan[] listPerusahaan = new Perusahaan[10];
        static int nPerusahaan = 0;
        
        public static void main(String[] args) {
        Aplikasi ap = new Aplikasi();
        ap.data1();
        ap.menu();
    }
}
