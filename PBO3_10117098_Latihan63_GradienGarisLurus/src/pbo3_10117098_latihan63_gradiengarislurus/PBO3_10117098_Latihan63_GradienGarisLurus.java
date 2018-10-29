/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan63_gradiengarislurus;

/**
 *
 * @author 
 * NAMA     : SANTI SUSANTI
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : program ini berisi program untuk menampilkan hasil dari 
 *                     hitung gradien dengan x dan y yg sudah ditentukan 
 *                     berdasarkan konsep interface
 */
public class PBO3_10117098_Latihan63_GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koordinat koor = new Koordinat(2,10,5,7);
        System.out.println("Garis yang melalui titik ("+koor.getX1()+","
                +koor.getY1()
                +") dan ("+koor.getX2()+","+koor.getY2()+")"+"\nmemiliki gradien"
                        + " sebesar "+koor.hitungGradien());
        Koordinat koor1 = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik ("+koor1.getX1()+","
                +koor1.getY1()+") dan ("+koor1.getX2()+","+koor1.getY2()+")"+
                        "\nmemiliki gradien sebesar "+koor1.hitungGradien());
    }
    
}
