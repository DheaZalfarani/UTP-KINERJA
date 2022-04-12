/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bajuerigo;
import java.util.Scanner;
/**
 *
 * @author Dhea Zalfarani
 */
public class BajuErigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        BajuErigo produksi = new BajuErigo();
        System.out.println("****************************************************");
        System.out.println("Selamat Datang di Toko Kami");
        System.out.println("****************************************************");
        System.out.println(" ");
        System.out.println("Berikut list baju yang tesedia : ");
        System.out.println("1. Baju A : 100.000");
        System.out.println("2. Baju B : 125.000");
        System.out.println("3. Baju C : 175.000");
        System.out.println(" ");
        System.out.println("****************************************************");
        System.out.println("Masukkan jenis baju yang akan anda beli : ");
        String jenis = sc.nextLine();
        System.out.println("****************************************************");
        System.out.println("Banyak baju yang ingin anda beli : ");
        int banyak = sc.nextInt();
        
        BeliBaju baju = new BeliBaju (jenis, banyak);
        baju.produksi();
    } 
}

class BeliBaju{
    String jenis;
    int harga, banyak;
    final int bajuA = 100000, bajuB = 125000, bajuC = 175000;
    
    public BeliBaju (String x, int y){
        this.jenis = x;
        this.banyak = y;
    }
        
    void hargaBajuA(){
        if (banyak > 100){
            harga = 95000;
        } else harga = bajuA;
    }
    void hargaBajuB(){
        if (banyak > 100){
            harga = 120000;
        } else harga = bajuB;
    }
    void hargaBajuC(){
        if (banyak > 100){
            harga = 160000;
        } else harga = bajuC;
    }
    void produksi(){
        if (jenis.equalsIgnoreCase("a")){
            hargaBajuA();
        }else if(jenis.equalsIgnoreCase("b")){
            hargaBajuB();
        }else if (jenis.equalsIgnoreCase("c")){
            hargaBajuC();
        }
        System.out.println("====================================================");
        System.out.println("Jenis baju yang Anda beli : "+jenis);
        System.out.println("Jumlah harga persatuan : "+harga);
        System.out.println("Total belanjaan Anda : "+ banyak*harga);
        System.out.println("====================================================");
    }  
}