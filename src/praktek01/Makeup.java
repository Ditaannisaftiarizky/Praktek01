/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

import static java.time.Clock.system;

/**
 *
 * @author ditaa
 */
public class Makeup {
    String merek;
    String produk;
    String warna;
    String bahan;
    String harga;
    
    void cetakInfo(){
        System.out.println("Merek   :"+merek);
        System.out.println("Produk  :"+produk);
        System.out.println("Warna   :"+warna);
        System.out.println("Bahan   :"+bahan);
        System.out.println("Harga   :"+harga);
        
    }
}
