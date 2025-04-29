/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg702;

import java.util.Scanner;
import static javax.swing.text.html.HTML.Tag.P;

/**
 *
 * @author LAB F
 */
public class Pertemuan702 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String  ulang ="ya";
        Scanner p = new Scanner(System.in);
        do{
            System.out.println("Aplikasi CARI DUDA");
            System.out.println("1.Hitung Luas Persegi");
            System.out.println("2.Hitung Luas segitiga");
            System.out.println("3,Selesai");
            System.out.print("Pilih (1/2/3): ");
            String pil = p.nextLine();
            switch (pil) {
                case"1":
                    System.out.println("Memilih Menu Hitung Luas Persegi");
                    break;
                case "2" :
                    System.out.println("Memilih Menu Hitung Luas segitiga");
                    break;
                case "3":
                    ulang = "tidak";
                    break;
                default:
                    System.out.println("Silakan pilih 1/2/3");
                    
               
            }
            
        }while (ulang.equals("ya"));
        System .out.println("bye...");
        }
    }
    

