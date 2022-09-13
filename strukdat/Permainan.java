/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strukdat;

/**
 *
 * @author User
 */

// class Permainan
public final class Permainan{
    //atribut class Permainan
    String nama1;
    String nama2;
    int pilihan2;
    int pilihan1;
    String trupilihan1;
    String trupilihan2;
    
    
    public Permainan(String nama1, int pilihan1 , String nama2, int pilihan2){
        this.nama1 = nama1;
        this.pilihan1 = pilihan1;
        this.nama2 = nama2;
        this.pilihan2 = pilihan2;
        switch (this.pilihan1) {
            case 1:
                this.trupilihan1 = "Gunting";
                break;
            case 2:
                this.trupilihan1 = "Kertas";
                break;
            default:
                this.trupilihan1 = "Batu";
                break;
        }
        switch (this.pilihan2) {
            case 1:
                this.trupilihan2 = "Gunting";
                break;
            case 2:
                this.trupilihan2 = "Kertas";
                break;
            default:
                this.trupilihan2 = "Batu";
                break;
        }
       
                
    }
    //method  player1win dalam Class
    void player1win(){
        System.out.println(nama1 + "(" + trupilihan1 + ")" + " menang melawan " + nama2 + "(" + trupilihan2 + ")" );
    }
    //method player2win dalam Class
    void player2win(){
        System.out.println(nama2 + "(" + trupilihan2 + ")" + " menang melawan " + nama1 + "(" + trupilihan1 + ")" );
    }
    //method hasil dalam Class
    void hasil(){
        //menggunakan pengondisian if untuk menentukan hasil
        if (pilihan1 == 1 && pilihan2 == 2){
            player1win();
        }
        else if (pilihan1 == 1 && pilihan2 == 3){
            player2win();
        }
        else if (pilihan1 == 2 && pilihan2 == 1){
            player2win();
        }
        else if (pilihan1 == 2 && pilihan2 == 3){
            player1win();
        }
        else if (pilihan1 == 3 && pilihan2 == 1){
            player1win();
        }
        else if (pilihan1 == 3 && pilihan2 == 2){
            player2win();
        }
        else{
             System.out.println(nama1 + "(" + trupilihan1 + ")" + " seri melawan " + nama2 + "(" + trupilihan2 + ")" );
        }
    }
}
