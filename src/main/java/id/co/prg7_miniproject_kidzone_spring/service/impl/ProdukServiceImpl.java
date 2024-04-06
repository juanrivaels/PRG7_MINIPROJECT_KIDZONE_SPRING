package id.co.prg7_miniproject_kidzone_spring.service.impl;

import id.co.prg7_miniproject_kidzone_spring.dao.ProdukDao;
import id.co.prg7_miniproject_kidzone_spring.model.Produk;
import id.co.prg7_miniproject_kidzone_spring.repository.ProdukRepository;
import id.co.prg7_miniproject_kidzone_spring.response.DtoResponse;
import id.co.prg7_miniproject_kidzone_spring.service.ProduKService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static id.co.prg7_miniproject_kidzone_spring.constant.ProdukConstant.*;


@Service
@Transactional
public class ProdukServiceImpl implements ProduKService {
    @Autowired
    private ProdukDao produkDao;
    @Autowired
    private ProdukRepository produkRepository;

    @Override
    public DtoResponse getAllProduk(){
        if (produkDao.getAllProduk() != null){
            return new DtoResponse(200,produkDao.getAllProduk());
        }
        return new DtoResponse(500,null,mProEmptyData);
    }
    @Override
    public DtoResponse getProdukActive(){
        if (produkDao.getProdukActive() != null){
            return new DtoResponse(200,produkDao.getProdukActive());
        }
        return new DtoResponse(500,null,mProEmptyData);
    }
    @Override
    public DtoResponse saveProduk(Produk produk){
        produk.setPro_status(1);
        try {
            produkRepository.save(produk);
            return new DtoResponse(200,produk,mProCreateSuccess);
        }catch (Exception e){
            return new DtoResponse(500,null,mProCrateFailed);
        }
    }
    @Override
    public DtoResponse updateProduk(Produk produk){
        try {
            Produk existingProduk = produkRepository.findById(produk.getPro_id()).orElse(null);
            if (existingProduk == null){
                return new DtoResponse(404, null, mProNotFound);
            }

            if (produk.getPro_nama() != null){
                existingProduk.setPro_nama(produk.getPro_nama());
            }
            if (produk.getPro_kategori() != null){
                existingProduk.setPro_kategori(produk.getPro_kategori());
            }
            if (produk.getPro_deskripsi() != null){
                existingProduk.setPro_deskripsi(produk.getPro_deskripsi());
            }
            if (produk.getPro_ukuran() != null){
                existingProduk.setPro_ukuran(produk.getPro_ukuran());
            }
            if (produk.getPro_harga() != null){
                existingProduk.setPro_harga(produk.getPro_harga());
            }
            if (produk.getPro_stok() != null){
                existingProduk.setPro_stok(produk.getPro_stok());
            }
            if (produk.getPro_warna() != null){
                existingProduk.setPro_warna(produk.getPro_warna());
            }
            if (produk.getPro_status() != null){
                existingProduk.setPro_status(produk.getPro_status());
            }

            Produk updateProduk = produkRepository.save(existingProduk);
            if (updateProduk != null){
                return new DtoResponse(200, updateProduk, mProUpdateSuccess);
            }else {
                return new DtoResponse(500, null, mProUpdateFailed);
            }
        }catch (Exception e){
            return new DtoResponse(500, null, mProUpdateFailed);
        }
    }
    public DtoResponse deleteProduk(Produk produk){
        try{
            Produk searchProduk= produkRepository.findById(produk.getPro_id()).orElseThrow();
            if(searchProduk != null){
                searchProduk.setPro_status(0);
                produkRepository.save(searchProduk);
                return new DtoResponse(200, searchProduk, mProDeleteSuccess);
            }else{
                return new DtoResponse(404, mProNotFound);
            }
        }catch (Exception e){
            return new DtoResponse(500, mProDeleteFailed);
        }
    }
}
