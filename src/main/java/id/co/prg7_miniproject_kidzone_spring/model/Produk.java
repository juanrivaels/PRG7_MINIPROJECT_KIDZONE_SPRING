package id.co.prg7_miniproject_kidzone_spring.model;
import jakarta.persistence.*;

@Entity
@Table(name = "ms_produk")
public class Produk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "pro_id  ")
    private Integer pro_id  ;
    @Column (name = "pro_nama ")
    private String pro_nama ;
    @Column (name = "pro_kategori ")
    private Integer pro_kategori ;
    @Column (name = "pro_ukuran ")
    private Integer pro_ukuran ;
    @Column (name = "pro_deskripsi")
    private String pro_deskripsi;
    @Column (name = "pro_harga ")
    private Float pro_harga ;
    @Column (name = "pro_stok ")
    private Integer pro_stok ;
    @Column (name = "pro_warna ")
    private String pro_warna ;
    @Column (name = "pro_status")
    private Integer pro_status;

    public Produk(){

    }

    public Produk(Integer pro_id, String pro_nama, Integer pro_kategori, Integer pro_ukuran, String pro_deskripsi, Float pro_harga, Integer pro_stok, String pro_warna, Integer pro_status) {
        this.pro_id = pro_id;
        this.pro_nama = pro_nama;
        this.pro_kategori = pro_kategori;
        this.pro_ukuran = pro_ukuran;
        this.pro_deskripsi = pro_deskripsi;
        this.pro_harga = pro_harga;
        this.pro_stok = pro_stok;
        this.pro_warna = pro_warna;
        this.pro_status = pro_status;
    }

    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }

    public String getPro_nama() {
        return pro_nama;
    }

    public void setPro_nama(String pro_nama) {
        this.pro_nama = pro_nama;
    }

    public Integer getPro_kategori() {
        return pro_kategori;
    }

    public void setPro_kategori(Integer pro_kategori) {
        this.pro_kategori = pro_kategori;
    }

    public Integer getPro_ukuran() {
        return pro_ukuran;
    }

    public void setPro_ukuran(Integer pro_ukuran) {
        this.pro_ukuran = pro_ukuran;
    }

    public String getPro_deskripsi() {
        return pro_deskripsi;
    }

    public void setPro_deskripsi(String pro_deskripsi) {
        this.pro_deskripsi = pro_deskripsi;
    }

    public Float getPro_harga() {
        return pro_harga;
    }

    public void setPro_harga(Float pro_harga) {
        this.pro_harga = pro_harga;
    }

    public Integer getPro_stok() {
        return pro_stok;
    }

    public void setPro_stok(Integer pro_stok) {
        this.pro_stok = pro_stok;
    }

    public String getPro_warna() {
        return pro_warna;
    }

    public void setPro_warna(String pro_warna) {
        this.pro_warna = pro_warna;
    }

    public Integer getPro_status() {
        return pro_status;
    }

    public void setPro_status(Integer pro_status) {
        this.pro_status = pro_status;
    }
}