package id.co.prg7_miniproject_kidzone_spring.service;

import id.co.prg7_miniproject_kidzone_spring.model.Penjualan;
import id.co.prg7_miniproject_kidzone_spring.model.Produk;
import id.co.prg7_miniproject_kidzone_spring.response.DtoResponse;

import java.util.Set;

public interface PenjualanService {
    DtoResponse getAllPenjualan();
    DtoResponse savePenjualan(Penjualan penjualan);
}
