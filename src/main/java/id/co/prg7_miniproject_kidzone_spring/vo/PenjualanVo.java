package id.co.prg7_miniproject_kidzone_spring.vo;

import id.co.prg7_miniproject_kidzone_spring.model.Penjualan;
import id.co.prg7_miniproject_kidzone_spring.model.Produk;

import java.util.Date;
import java.util.Set;

public class PenjualanVo {
    private Integer penjualanId;
    private Date penjualanTanggal;
    private Float penjualanTotalHarga;

    public PenjualanVo(){

    }

    public PenjualanVo(Penjualan penjualan) {
        this.penjualanId = penjualan.getId_transaksi();
        this.penjualanTanggal = penjualan.getTgl_transaksi();
        this.penjualanTotalHarga = penjualan.getTotal_harga();
    }

    public Integer getPenjualanId() {
        return penjualanId;
    }

    public void setPenjualanId(Integer penjualanId) {
        this.penjualanId = penjualanId;
    }

    public Date getPenjualanTanggal() {
        return penjualanTanggal;
    }

    public void setPenjualanTanggal(Date penjualanTanggal) {
        this.penjualanTanggal = penjualanTanggal;
    }

    public Float getPenjualanTotalHarga() {
        return penjualanTotalHarga;
    }

    public void setPenjualanTotalHarga(Float penjualanTotalHarga) {
        this.penjualanTotalHarga = penjualanTotalHarga;
    }

}
