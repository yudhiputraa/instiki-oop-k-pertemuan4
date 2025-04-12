/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_pertemuan4;

import java.util.Scanner;

/**
 *
 * @author Yudhi Putra
 * TGL 12 MARET 2025
 */
public class Oop_pertemuan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nama = new String[5];
        
        nama[0] = "marlon";
        nama[1] = "yudhi";
        nama[2] = "wayan";
        nama[3] = "kempot";
        nama[4] = "riski";
        
        Scanner inp = new Scanner(System.in);
        
        for(int idx=0; idx<5; idx++ ){
            System.out.print("Data Teman Ke-"+String.valueOf(idx)+":");
            nama[idx] = inp.nextLine();
   
        }
        String NamaTeman = nama[2];
        System.out.printf("Data Teman: %s\n", nama[2]);
        
        //Menampilkan data Array dengan Perulangan
        for(int idx=0; idx<5; idx++ ){
            System.out.println("Data Teman ke-"+String.valueOf(idx+1)+": "+nama[idx]); //Integer.toString()
        }
        
        for(String nm : nama){
            System.out.println(nm);
        }
    }
    }
    


