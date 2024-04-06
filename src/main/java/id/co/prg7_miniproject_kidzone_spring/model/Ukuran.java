package id.co.prg7_miniproject_kidzone_spring.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ms_ukuran")
public class Ukuran {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ukr_id")
    private int ukr_id;
    @Column(name = "ukr_nama")
    private String ukr_nama;
    @Column(name = "ukr_kategori")
    private int ukr_kategori;
    @Column(name = "ukr_panjang")
    private int ukr_panjang;
    @Column(name = "ukr_lebar_dada")
    private int ukr_lebar_dada;
    @Column(name = "ukr_lingkar_pinggang")
    private int ukr_lingkar_pinggang; // Mengubah nama variabel
    @Column(name = "ukr_tinggi")
    private int ukr_tinggi;
    @Column(name = "ukr_status")
    private int ukr_status;


    public Ukuran(){

    }

    public Ukuran(int ukr_id, String ukr_nama, int ukr_kategori, int ukr_panjang, int ukr_lebar_dada, int ukr_lingkar_pinggang,int ukr_tinggi, int ukr_status) {
        this.ukr_id = ukr_id;
        this.ukr_nama = ukr_nama;
        this.ukr_kategori = ukr_kategori;
        this.ukr_panjang = ukr_panjang;
        this.ukr_lebar_dada = ukr_lebar_dada;
        this.ukr_lingkar_pinggang = ukr_lingkar_pinggang;
        this.ukr_tinggi = ukr_tinggi;
        this.ukr_status = ukr_status;
    }

    public int getUkr_id() {
        return ukr_id;
    }

    public int getUkr_tinggi() {
        return ukr_tinggi;
    }

    public void setUkr_tinggi(int ukr_tinggi) {
        this.ukr_tinggi = ukr_tinggi;
    }

    public void setUkr_id(int ukr_id) {
        this.ukr_id = ukr_id;
    }

    public String getUkr_nama() {
        return ukr_nama;
    }

    public void setUkr_nama(String ukr_nama) {
        this.ukr_nama = ukr_nama;
    }

    public int getUkr_kategori() {
        return ukr_kategori;
    }

    public void setUkr_kategori(int ukr_kategori) {
        this.ukr_kategori = ukr_kategori;
    }

    public int getUkr_panjang() {
        return ukr_panjang;
    }

    public void setUkr_panjang(int ukr_panjang) {
        this.ukr_panjang = ukr_panjang;
    }

    public int getUkr_lebar_dada() {
        return ukr_lebar_dada;
    }

    public void setUkr_lebar_dada(int ukr_lebar_dada) {
        this.ukr_lebar_dada = ukr_lebar_dada;
    }

    public int getUkr_lingkar_pinggang() {
        return ukr_lingkar_pinggang;
    }

    public void setUkr_lingkar_pinggang(int ukr_lingkar_pinggang) {
        this.ukr_lingkar_pinggang = ukr_lingkar_pinggang;
    }

    public int getUkr_status() {
        return ukr_status;
    }

    public void setUkr_status(int ukr_status) {
        this.ukr_status = ukr_status;
    }
}
