/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package araymultidimensi;

import java.util.Scanner;

/**
 *
 * @author Yudhi Putra
 * TGL 12 April 2025
 */
public class Araymultidimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [][] meja = new String[3][3];
        Scanner inp = new Scanner(System.in);
        
        for(int brs=0; brs<3; brs++){
            for(int klm=0; klm<3; klm++){
                System.out.println("Data Meja Baris:"+meja[brs][klm]);
        }
            System.out.println("");
    }
    }
}
