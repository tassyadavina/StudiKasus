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
class Pembeli extends TokoBuku 
{
    public int idpembeli;
    public String namapembeli;
    public String alamat;
    public String notelp;
    
    //konstruktor
    public Pembeli (int IdBarang,
            String NamaBarang,
            int HargaBarang,
            String MerkBarang,
            int IdPembeli,
            String NamaPembeli,
            String Alamat,
            String NoTelp)
    {
        super(IdBarang,NamaBarang,HargaBarang,MerkBarang);
        this.idpembeli = IdPembeli;
        this.namapembeli = NamaPembeli;
        this.alamat = Alamat;
        this.notelp = NoTelp;
    }
    //metode
    public void Cetak()
    {
        super.cetak();
        System.out.println("Id Pembeli   : "+this.idpembeli);
        System.out.println("Nama Pembeli : "+this.namapembeli);
        System.out.println("Alamat       : "+this.alamat);
        System.out.println("No Telp      : "+this.notelp);
    }
}
