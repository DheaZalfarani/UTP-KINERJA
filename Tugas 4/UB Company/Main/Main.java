/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubcompany;

/**
 *
 * @author Dhea Zalfarani
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {    
        DataMerchant.memory = DataMerchant.tambahMerchant(new Merchant("Martabak Pecenongan 78", "Terang Bulan Spesial", 80000));
        DataMerchant.memory = DataMerchant.tambahMerchant(new Merchant("Bakso Cak Min", "Bakso", 25000));
        DataMerchant.memory = DataMerchant.tambahMerchant(new Merchant("Mie Ayam Gondes", "Mie Ayam Spesial", 10000));
        
        DataMerchant.tampilData();
    }
}

