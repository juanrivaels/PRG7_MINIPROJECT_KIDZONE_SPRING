package id.co.prg7_miniproject_kidzone_spring.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class DetailPenjualanPK implements Serializable {
    @Column(name = "id_produk")
    private Integer id_produk;
    @Column(name = "id_transaksi")
    private Integer id_transaksi;

    public DetailPenjualanPK(){

    }

    public DetailPenjualanPK(Integer id_produk, Integer id_transaksi) {
        this.id_produk = id_produk;
        this.id_transaksi = id_transaksi;
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

}
