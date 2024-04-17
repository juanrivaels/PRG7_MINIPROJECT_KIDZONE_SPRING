package id.co.prg7_miniproject_kidzone_spring.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class DetailPenjualanPK implements Serializable {
    @Column(name = "id_produk")
    private Integer id_produk;
    @Column(name = "id_transaksi")
    private Integer id_transaksi;
    @Column(name = "jumlah")
    private Integer jumlah;

    public DetailPenjualanPK(){

    }

    public DetailPenjualanPK(Integer id_produk, Integer id_transaksi, Integer jumlah) {
        this.id_produk = id_produk;
        this.id_transaksi = id_transaksi;
        this.jumlah = jumlah;
    }

    public Integer getId_produk() {
        return id_produk;
    }

    public void setId_produk(Integer id_produk) {
        this.id_produk = id_produk;
    }

    public Integer getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(Integer id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }
}
