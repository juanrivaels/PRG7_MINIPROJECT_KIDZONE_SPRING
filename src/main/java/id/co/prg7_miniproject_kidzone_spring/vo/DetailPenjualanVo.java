package id.co.prg7_miniproject_kidzone_spring.vo;

import id.co.prg7_miniproject_kidzone_spring.model.DetailPenjualan;

import java.io.Serializable;

public class DetailPenjualanVo implements Serializable {
    private Integer id_transaksi;
    private String transaksiDesc;
    private Integer id_produk;
    private String produkDesc;
    private Integer jumlah;

    public DetailPenjualanVo(){

    }

    public DetailPenjualanVo(DetailPenjualan detailPenjualan){
        this.id_transaksi = detailPenjualan.getDetailPenjualanPK().getId_transaksi();
        this.id_produk = detailPenjualan.getDetailPenjualanPK().getId_produk();
        this.jumlah = detailPenjualan.getJumlah();
    }

    public Integer getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(Integer id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public String getTransaksiDesc() {
        return transaksiDesc;
    }

    public void setTransaksiDesc(String transaksiDesc) {
        this.transaksiDesc = transaksiDesc;
    }

    public Integer getId_produk() {
        return id_produk;
    }

    public void setId_produk(Integer id_produk) {
        this.id_produk = id_produk;
    }

    public String getProdukDesc() {
        return produkDesc;
    }

    public void setProdukDesc(String produkDesc) {
        this.produkDesc = produkDesc;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }
}
