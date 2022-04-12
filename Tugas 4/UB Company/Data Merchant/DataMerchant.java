/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubcompany;
import java.util.Scanner;
/**
 *
 * @author Dhea Zalfarani
 */
public class DataMerchant {
    
    static Merchant[] memory = new Merchant[0];
    
    public static Merchant[] tambahMerchant(Merchant merchant){
        Merchant temp[]=new Merchant[DataMerchant.memory.length+1];
        for (int i = 0; i < DataMerchant.memory.length; i++){
            temp[i]=DataMerchant.memory[i];
        }
        temp[DataMerchant.memory.length]=merchant;
        return temp;
    }

    public static void tampilData(){
        for (Merchant mch1 : memory){
            System.out.println("---------UB Food---------");
            System.out.println("Nama Merchant   : "+mch1.getNamaMerchant());
            System.out.println("Nama Produk     : "+mch1.getNamaProduk());
            System.out.println("Harga           : "+(int)mch1.getHargaMakanan());
        }
    }
    public static Merchant cariWarung (String nama){
        for (int i = 0; i < DataMerchant.memory.length; i++){
            if (nama.equalsIgnoreCase(DataMerchant.memory[i].getNamaMerchant())){
                return DataMerchant.memory[i];
            }
        }
        return null;
    }
}

