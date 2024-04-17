package id.co.prg7_miniproject_kidzone_spring.service;


import id.co.prg7_miniproject_kidzone_spring.model.Produk;
import id.co.prg7_miniproject_kidzone_spring.response.DtoResponse;

public interface ProduKService {
    DtoResponse getAllProduk();
    DtoResponse getProdukActive();
    DtoResponse getProdukById(Integer id_produk);
    DtoResponse saveProduk(Produk produk);
    DtoResponse updateProduk(Produk produk);
    DtoResponse deleteProduk(Produk produk);
}
