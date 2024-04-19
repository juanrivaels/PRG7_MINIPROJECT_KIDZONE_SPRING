package id.co.prg7_miniproject_kidzone_spring.vo;

import id.co.prg7_miniproject_kidzone_spring.model.DetailPenjualan;

public class DetailPenjualanVoForm {
    private Integer id_transaksi;
    private Integer id_produk;
    private Integer jumlah;

    public DetailPenjualanVoForm(){

    }

    public DetailPenjualanVoForm(DetailPenjualan detailPenjualan) {
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

    public Integer getId_produk() {
        return id_produk;
    }

    public void setId_produk(Integer id_produk) {
        this.id_produk = id_produk;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }
}
