/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119905.latihan59.conan;

/**
 *
 * @author aruma
 */
public class DataKarakter {
    protected String nama;
    protected int umur;

    public DataKarakter(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
    public void display(){
        System.out.println("--------------");
        System.out.println("Nama : "+ nama);
        System.out.println("Umur : "+ umur + " tahun");
    }
    
}
