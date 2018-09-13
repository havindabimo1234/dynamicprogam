/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Barang {
    private static String tampilIdentitas (String identitas){
        System.out.print("identitas : "+identitas);
        System.out.println("\nHitung upah MAX");
        System.out.println("daftar barang: A(5000/kg),B(7000/kg),C(2000/kg),D(3000/kg),E(10000/kg");
       
        return identitas;
    }
    public static void main(String[] args){
        String identitas ="haavinda bimo/xrpl5/14";
        tampilIdentitas (identitas);
        Scanner jml = new Scanner(System.in);
        System.out.print("Jumlah barang(dalam kg) : " );
        int uang = jml.nextInt();
        int berat [] ={7,5,4,3,2};
        String nama [] = {"E","B","A","D","C"};
        int upah [] = {10000,7000,5000,3000,2000};
        int jumlah;
        
        for(int i = 0; i < berat.length;1++){
            if (uang >= berat[i]){
                jumlah = uang / berat [i];
                int banyak = jumlah * berat[i];
                uang = uang%berat[i];
                int harga = jumlah * upah[i];
                System.out.println("barang"+ nama[i]"sejumlah"+jumlah+"total berat"+banyak+"kg. bayaran =" +harga);
            }
        }
    }
 }

