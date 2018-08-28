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
public class Transaksi extends Pembeli {
    
    public static int total;
    
//konstruktor
 public Transaksi (int IdBarang,
            String NamaBarang,
            int HargaBarang,
            String MerkBarang,
            int IdPembeli,
            String NamaPembeli,
            String Alamat,
            String NoTelp,
            int Total
          ) 
 {
     super(IdBarang,
             NamaBarang,
             HargaBarang,
             MerkBarang,
             IdPembeli,
             NamaPembeli,
             Alamat,
             NoTelp);
        this.total = Total;      
 }
 //method
 public void Cetak()
 {
     super.Cetak();
     System.out.println("Total Barang : "+this.total);
 }
    public static void main(String[] args) 
    {
        System.out.println("Data pembelian Barang");
        System.out.println("...........................");
        Transaksi keluaran = new Transaksi(101,
                "Mukena",
                445000,
                "Rabbanni",
                248,
                "zahra Puspa",
                "Tempes,Karangtinoto",
                "082333285563",
                 3);
         keluaran.Cetak(); 
         System.out.println("Total Harga  : "+(hargabarang * total));
         System.out.println("...........................");
    }
}
