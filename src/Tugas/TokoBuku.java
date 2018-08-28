/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author PERSONALISE NOTEBOOK
 */
class TokoBuku {
    public int idbarang;
    public String namabarang;
    public static int hargabarang;
    public String merkbarang;
            
    //konstruktor
    public TokoBuku (int IdBarang,String NamaBarang,int HargaBarang,String MerkBarang )
    {
        this.idbarang = IdBarang;
        this.namabarang = NamaBarang;
        this.hargabarang = HargaBarang;
        this.merkbarang = MerkBarang;
    }
    //metode
    public void cetak()
    {
        System.out.println("Id Barang    : "+this.idbarang);
        System.out.println("Nama Barang  : "+this.namabarang);
        System.out.println("Harga Barang : "+this.hargabarang);
        System.out.println("merk Barang  : "+this.merkbarang);
    }
}

