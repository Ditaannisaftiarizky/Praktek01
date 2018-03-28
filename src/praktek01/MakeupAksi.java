/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author ditaa
 */
public class MakeupAksi {
    public static void main(String[] args) {
        Makeup Wardah = new Makeup();
        Makeup Maybelline = new Makeup ();
        Makeup Purbasari = new Makeup();
        
        Wardah.merek="Wardah";
        Wardah.produk="Lipstik";
        Wardah.bahan="Matte";
        Wardah.warna="Oh so Nude";
        Wardah.harga="Rp. 50000";
        
        Maybelline.merek="Maybelline";
        Maybelline.produk="Lipstik";
        Maybelline.bahan="Matte";
        Maybelline.warna="Orange Plum";
        Maybelline.harga="Rp. 65000";
        
        Purbasari.merek="Purbasari";
        Purbasari.produk="Lipstik";
        Purbasari.bahan="Matte";
        Purbasari.warna="Red";
        Purbasari.harga="Rp. 45000";
        
        Wardah.cetakInfo();
        Maybelline.cetakInfo();
        Purbasari.cetakInfo();
       
       
        
    }
         
}
