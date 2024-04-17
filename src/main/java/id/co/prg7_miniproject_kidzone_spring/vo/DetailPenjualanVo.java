package id.co.prg7_miniproject_kidzone_spring.vo;

import id.co.prg7_miniproject_kidzone_spring.model.DetailPenjualan;

import java.io.Serializable;

public class DetailPenjualanVo implements Serializable {
    private Integer transaksiId;
    private String transaksiDesc;
    private Integer produkId;
    private String produkDesc;
    private Integer transaksiJumlah;

    public DetailPenjualanVo(){

    }

    public DetailPenjualanVo(DetailPenjualan detailPenjualan){
        this.transaksiId = detailPenjualan.getDetailPenjualanPK().getId_transaksi();
        this.produkId = detailPenjualan.getDetailPenjualanPK().getId_produk();
        this.transaksiJumlah = detailPenjualan.getDetailPenjualanPK().getJumlah();
    }

    public Integer getTransaksiId() {
        return transaksiId;
    }

    public void setTransaksiId(Integer transaksiId) {
        this.transaksiId = transaksiId;
    }

    public String getTransaksiDesc() {
        return transaksiDesc;
    }

    public void setTransaksiDesc(String transaksiDesc) {
        this.transaksiDesc = transaksiDesc;
    }

    public Integer getProdukId() {
        return produkId;
    }

    public void setProdukId(Integer produkId) {
        this.produkId = produkId;
    }

    public String getProdukDesc() {
        return produkDesc;
    }

    public void setProdukDesc(String produkDesc) {
        this.produkDesc = produkDesc;
    }

    public Integer getTransaksiJumlah() {
        return transaksiJumlah;
    }

    public void setTransaksiJumlah(Integer transaksiJumlah) {
        this.transaksiJumlah = transaksiJumlah;
    }
}
