/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;
import java.io.*;
import java.util.*;
/**
 *
 * @author Dhea Zalfarani
 */
public class Solution {

    public static void main(String[] args) {
    
    Persegi persegi = new Persegi();
    Segitiga segitiga = new Segitiga();
    Lingkaran lingkaran = new Lingkaran();
        
    Scanner sc = new Scanner(System.in);
    int menu = sc.nextInt();
    if(menu == 1){
        persegi.sisi = sc.nextInt();
        persegi.luasPersegi();
    }else if(menu == 2){
        segitiga.alas = sc.nextInt();
        segitiga.tinggi = sc.nextInt();
        segitiga.luasSegitiga();
    }else if(menu == 3){
        lingkaran.r  = sc.nextInt();
        if(lingkaran.r%7 == 0){
            lingkaran.phi=(22/7);
        }else{
            lingkaran.phi=3.14;
        }lingkaran.luasLingkaran();
    }else{
        System.out.println("Input yang anda masukan tidak sesuai");
    }
    }
}

class Persegi{
        int sisi;
        Persegi(){
            
        }
        Persegi(int sisi){
            this.sisi = sisi;
        }
        void luasPersegi(){
            int luas = sisi*sisi;
            System.out.println(luas);
        }
    }
    class Segitiga{
        int alas, tinggi;
        Segitiga(){
            
        }
        Segitiga(int alas, int tinggi){
                this.alas = alas;
                this.tinggi = tinggi;
        }
        void luasSegitiga(){
            int luas = alas*tinggi/2;
            System.out.println(luas);
        }
    }
    class Lingkaran{
        int r;
        double phi;
        Lingkaran(){
            
        }
        Lingkaran(int r, double phi){
                this.r = r;
                this.phi = phi;
        }
        void luasLingkaran(){
            Double luas = phi*r*r;
            int luas1 = luas.intValue();
            Double luas2 = (double)luas1;
            System.out.println(luas2);
        }
    }
