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
public class Merchant {
    String namaMerchant,namaProduk;
    double hargaMakanan;

    Merchant(String namaMerchant, String namaProduk, double hargaMakanan){        
        this.namaMerchant   = namaMerchant;        
        this.namaProduk   = namaProduk;     
        this.hargaMakanan = hargaMakanan;
    }

    public String getNamaMerchant(){
        return namaMerchant;
    }
    public void setNamaMerchant(String namaMerchant){
        this.namaMerchant = namaMerchant;
    }
    public String getNamaProduk(){
        return namaProduk;
    }
    public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    public double getHargaMakanan(){
        return hargaMakanan;
    }
    public void setHargaMakanan(double hargaMakanan){
        this.hargaMakanan = hargaMakanan;
    }
}

