/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strukdat;
import java.util.Random;
/**
 *
 * @author User
 */

//membuat class Pemain
public class Pemain {
    //atribut class Pemain
    Random rand = new Random(); //digunakan supaya menjadi random
    String nama;
    int pilihan;
    
    
    public Pemain(String nama) {
        this.nama = nama;
        this.pilihan = pilihan = rand.nextInt(3 - 1) + 1;
}
    
}


