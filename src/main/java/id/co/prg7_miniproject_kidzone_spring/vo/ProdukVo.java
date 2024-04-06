package id.co.prg7_miniproject_kidzone_spring.vo;


import id.co.prg7_miniproject_kidzone_spring.model.Produk;

public class ProdukVo {
    private Integer produkId ;
    private String produkNama;
    private String produkKategori;
    private Integer produkUkuran;
    private String produkDeskripsi;
    private Float produkHarga;
    private Integer produkStok;
    private String produkWarna;
    private String produkStatus;

    public ProdukVo(){

    }

    public ProdukVo(Produk produk) {
        this.produkId = produk.getPro_id();
        this.produkNama = produk.getPro_nama();
        this.produkKategori = produk.getPro_kategori().toString();
        this.produkUkuran = produk.getPro_ukuran();
        this.produkDeskripsi = produk.getPro_deskripsi();
        this.produkHarga = produk.getPro_harga();
        this.produkStok = produk.getPro_stok();
        this.produkWarna = produk.getPro_warna();
        this.produkStatus = produk.getPro_status().toString();
    }

    public Integer getProdukId() {
        return produkId;
    }

    public void setProdukId(Integer produkId) {
        this.produkId = produkId;
    }

    public String getProdukNama() {
        return produkNama;
    }

    public void setProdukNama(String produkNama) {
        this.produkNama = produkNama;
    }

    public String getProdukKategori() {
        return produkKategori;
    }

    public void setProdukKategori(String produkKategori) {
        this.produkKategori = produkKategori;
    }

    public Integer getProdukUkuran() {
        return produkUkuran;
    }

    public void setProdukUkuran(Integer produkUkuran) {
        this.produkUkuran = produkUkuran;
    }

    public String getProdukDeskripsi() {
        return produkDeskripsi;
    }

    public void setProdukDeskripsi(String produkDeskripsi) {
        this.produkDeskripsi = produkDeskripsi;
    }

    public Float getProdukHarga() {
        return produkHarga;
    }

    public void setProdukHarga(Float produkHarga) {
        this.produkHarga = produkHarga;
    }

    public Integer getProdukStok() {
        return produkStok;
    }

    public void setProdukStok(Integer produkStok) {
        this.produkStok = produkStok;
    }

    public String getProdukWarna() {
        return produkWarna;
    }

    public void setProdukWarna(String produkWarna) {
        this.produkWarna = produkWarna;
    }

    public String getProdukStatus() {
        return produkStatus;
    }

    public void setProdukStatus(String produkStatus) {
        this.produkStatus = produkStatus;
    }
}
