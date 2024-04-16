package id.co.prg7_miniproject_kidzone_spring.model;

import jakarta.persistence.*;

@Entity
@Table(name = "detail_penjualan")
public class DetailPenjualan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detail")
    private Integer id_detail;

    @ManyToOne
    @JoinColumn(name = "id_transaksi", referencedColumnName = "id_transaksi")
    private Penjualan penjualan;

    @ManyToOne
    @JoinColumn(name = "id_produk", referencedColumnName = "pro_id")
    private Produk produk;

    @Column(name = "jumlah")
    private Integer jumlah;

    @Column(name = "sub_harga")
    private Float sub_harga;

    public DetailPenjualan() {
    }

    public Integer getId_detail() {
        return id_detail;
    }

    public void setId_detail(Integer id_detail) {
        this.id_detail = id_detail;
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

    public Float getSub_harga() {
        return sub_harga;
    }

    public void setSub_harga(Float sub_harga) {
        this.sub_harga = sub_harga;
    }
}

