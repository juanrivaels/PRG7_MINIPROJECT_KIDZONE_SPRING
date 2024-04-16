package id.co.prg7_miniproject_kidzone_spring.model;

import jakarta.persistence.*;

import java.util.Date;
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

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "detail_penjualan",
            joinColumns = {
                    @JoinColumn(name = "id_transaksi", referencedColumnName = "id_transaksi")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "id_produk", referencedColumnName = "pro_id")
            })
    private Set<Produk> produk;

    @OneToMany(mappedBy = "penjualan", cascade = CascadeType.ALL)
    private Set<DetailPenjualan> detailPenjualan;

    public Penjualan() {
    }

    public Penjualan(Integer id_transaksi, Date tgl_transaksi, Float total_harga, Set<Produk> produk) {
        this.id_transaksi = id_transaksi;
        this.tgl_transaksi = tgl_transaksi;
        this.total_harga = total_harga;
        this.produk = produk;
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

    public Set<Produk> getProduk() {
        return produk;
    }

    public void setProduk(Set<Produk> produk) {
        this.produk = produk;
    }

    public Set<DetailPenjualan> getDetailPenjualan() {
        return detailPenjualan;
    }

    public void setDetailPenjualan(Set<DetailPenjualan> detailPenjualan) {
        this.detailPenjualan = detailPenjualan;
    }
}
