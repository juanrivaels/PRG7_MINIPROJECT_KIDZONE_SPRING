package id.co.prg7_miniproject_kidzone_spring.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "trs_penjualan")
public class Penjualan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transaksi")
    private Integer id_transaksi;

    @Column(name = "tgl_transaksi")
    private Date tgl_transaksi;

    @Column(name = "total_harga")
    private Float total_harga;
    private Integer jumlah;

    @Transient
    private List<Integer>idProdukList;
    @OneToMany(mappedBy = "penjualan")
    private List<DetailPenjualan> detailPenjualanList;

    public Penjualan() {
    }

    public Penjualan(Integer id_transaksi, Date tgl_transaksi, Float total_harga) {
        this.id_transaksi = id_transaksi;
        this.tgl_transaksi = tgl_transaksi;
        this.total_harga = total_harga;
    }

    public Integer getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(Integer id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public Date getTgl_transaksi() {
        return tgl_transaksi;
    }

    public void setTgl_transaksi(Date tgl_transaksi) {
        this.tgl_transaksi = tgl_transaksi;
    }

    public Float getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(Float total_harga) {
        this.total_harga = total_harga;
    }

    public List<Integer> getIdProdukList() {
        return idProdukList;
    }

    public void setIdProdukList(List<Integer> idProdukList) {
        this.idProdukList = idProdukList;
    }

    public List<DetailPenjualan> getDetailPenjualanList() {
        return detailPenjualanList;
    }

    public void setDetailPenjualanList(List<DetailPenjualan> detailPenjualanList) {
        this.detailPenjualanList = detailPenjualanList;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }
}
