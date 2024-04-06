package id.co.prg7_miniproject_kidzone_spring.vo;

import id.co.prg7_miniproject_kidzone_spring.model.Ukuran;

public class UkuranVo {
    private int ukr_id;
    private String ukr_nama;
    private String ukr_kategori;
    private int ukr_panjang;
    private int ukr_lebar_dada;
    private int ukr_lingkar_pinggang; // Mengubah nama variabel
    private int ukr_tinggi;
    private String ukr_status;


    public UkuranVo(){

    }

    public UkuranVo(int ukr_id, String ukr_nama, String ukr_kategori, int ukr_panjang, int ukr_lebar_dada, int ukr_lingkar_pinggang, int ukr_tinggi, String ukr_status) {
        this.ukr_id = ukr_id;
        this.ukr_nama = ukr_nama;
        this.ukr_kategori = ukr_kategori;
        this.ukr_panjang = ukr_panjang;
        this.ukr_lebar_dada = ukr_lebar_dada;
        this.ukr_lingkar_pinggang = ukr_lingkar_pinggang; // Mengubah nama variabel
        this.ukr_tinggi = ukr_tinggi;
        this.ukr_status = ukr_status;
    }

    public UkuranVo(Ukuran ukr_ukuran) {
        this.ukr_id = ukr_ukuran.getUkr_id();
        this.ukr_nama = ukr_ukuran.getUkr_nama();
        this.ukr_kategori = String.valueOf(ukr_ukuran.getUkr_kategori());
        this.ukr_panjang = ukr_ukuran.getUkr_panjang();
        this.ukr_lebar_dada = ukr_ukuran.getUkr_lebar_dada();
        this.ukr_lingkar_pinggang = ukr_ukuran.getUkr_lingkar_pinggang(); // Mengambil nilai lingkar_dada dari model Ukuran
        this.ukr_tinggi = ukr_ukuran.getUkr_tinggi();
        this.ukr_status = String.valueOf(ukr_ukuran.getUkr_status());
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

    public String getUkr_kategori() {
        return ukr_kategori;
    }

    public void setUkr_kategori(String ukr_kategori) {
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

    public String getUkr_status() {
        return ukr_status;
    }

    public void setUkr_status(String ukr_status) {
        this.ukr_status = ukr_status;
    }
}
