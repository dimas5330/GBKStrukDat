/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.strukdat;

/**
 *
 * @author User
 */

 // membuat class GBK
public class GBK {

    public static void main(String[] args) {
        //membuat object player1 dan player2
        Pemain player1 = new Pemain("jawar");
        Pemain player2 = new Pemain("Bintang");
        
        //membuat obhect Permainan a
        Permainan a = new Permainan(player1.nama, player1.pilihan,player2.nama, player2.pilihan);
        //menampilkan hasil menggunakan method hasil di class Permainan
        a.hasil();
    }
}
