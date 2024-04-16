package id.co.prg7_miniproject_kidzone_spring.service.impl;


import id.co.prg7_miniproject_kidzone_spring.dao.PenjualanDao;
import id.co.prg7_miniproject_kidzone_spring.model.DetailPenjualan;
import id.co.prg7_miniproject_kidzone_spring.model.Penjualan;
import id.co.prg7_miniproject_kidzone_spring.model.Produk;
import id.co.prg7_miniproject_kidzone_spring.repository.PenjualanRepository;
import id.co.prg7_miniproject_kidzone_spring.repository.ProdukRepository;
import id.co.prg7_miniproject_kidzone_spring.response.DtoResponse;
import id.co.prg7_miniproject_kidzone_spring.service.PenjualanService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static id.co.prg7_miniproject_kidzone_spring.constant.PenjualanConstant.*;


@Service
@Transactional
public class PenjualanServiceImpl implements PenjualanService {
    @Autowired
    private PenjualanRepository penjualanRepository;

    @Autowired
    private PenjualanDao penjualanDao;
    @Autowired
    private ProdukRepository produkRepository;

    public DtoResponse getAllPenjualan(){
        if(penjualanDao.getAllPenjualan() != null){
            return new DtoResponse(200, penjualanDao.getAllPenjualan());
        }
        return new DtoResponse(200, null, mPjlNotFound);
    }

    public DtoResponse savePenjualan(Penjualan penjualan, Set<Produk> produk){
        penjualan.setTgl_transaksi(new Date());
        try{
            Float total = 0f;
            for(Produk p : produk){
                total += p.getPro_harga(); // misalnya, hitung total harga dari semua produk
            }
            penjualan.setTotal_harga(total);

            // Buat detail penjualan untuk setiap produk
            Set<DetailPenjualan> detailPenjualan = new HashSet<>();
            for (Produk p : produk) {
                DetailPenjualan detail = new DetailPenjualan();
                detail.setPenjualan(penjualan);
                detail.setProduk(p);
                detail.setJumlah(p.getPro_stok()); // Mengambil jumlah dari Produk
                detail.setSub_harga(p.getPro_harga() * p.getPro_stok()); // Hitung subtotal berdasarkan harga produk dan jumlah
                detailPenjualan.add(detail);
            }

            penjualan.setDetailPenjualan(detailPenjualan);

            penjualanRepository.save(penjualan);
            return new DtoResponse(200, penjualan, mPjlCreateSuccess);
        } catch (Exception e){
            return new DtoResponse(500, mPjlCreateFailed);
        }
    }
}
