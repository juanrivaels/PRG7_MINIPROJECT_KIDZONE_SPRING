package id.co.prg7_miniproject_kidzone_spring.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "detail_penjualan")
public class DetailPenjualan implements Serializable {

    @EmbeddedId
    private DetailPenjualanPK detailPenjualanPK;
    @Column(name = "jumlah")
    private Integer jumlah;

    @ManyToOne
    @JoinColumn(name = "id_transaksi", referencedColumnName = "id_transaksi", insertable = false, updatable = false)
    private Penjualan penjualan;

    @ManyToOne
    @JoinColumn(name = "id_produk", referencedColumnName = "pro_id", insertable = false, updatable = false)
    private Produk produk;


    public DetailPenjualan() {
    }

    public DetailPenjualan(DetailPenjualanPK detailPenjualanPK, Integer jumlah) {
        this.detailPenjualanPK = detailPenjualanPK;
        this.jumlah = jumlah;
    }

    public DetailPenjualanPK getDetailPenjualanPK() {
        return detailPenjualanPK;
    }

    public void setDetailPenjualanPK(DetailPenjualanPK detailPenjualanPK) {
        this.detailPenjualanPK = detailPenjualanPK;
    }

    public Penjualan getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(Penjualan penjualan) {
        this.penjualan = penjualan;
    }

    public Produk getProduk() {
        return produk;
    }

    public void setProduk(Produk produk) {
        this.produk = produk;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }
}

