/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan39.nilai.terbesar.dan.terkecil;
import java.util.Scanner;
/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi : Program Nilai Terbesar dan Terkecil
 */
public class PBOIF210119076Latihan39NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        Scanner scanner = new Scanner (System.in);
        String nama;
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa======");
        System.out.print("Masukan Nama petugas : ");
        nama = scanner.nextLine();
        nilai.inputBanyakNilai();
        nilai.inputNilai();
        System.out.println();
        System.out.println("=====Hasil Nilai Mahasiswa====");
        nilai.outputNilai();
        System.out.println("");
        System.out.println("Nilai Terbesar adalah = " + nilai.max());
        System.out.println("Nilai Terkecil adalah = " + nilai.min());
        System.out.println("");
        System.out.println("Petugas : " + nama);
    }
    
}
