package id.co.prg7_miniproject_kidzone_spring.service.impl;


import id.co.prg7_miniproject_kidzone_spring.dao.PenjualanDao;
import id.co.prg7_miniproject_kidzone_spring.model.DetailPenjualan;
import id.co.prg7_miniproject_kidzone_spring.model.DetailPenjualanPK;
import id.co.prg7_miniproject_kidzone_spring.model.Penjualan;
import id.co.prg7_miniproject_kidzone_spring.model.Produk;
import id.co.prg7_miniproject_kidzone_spring.repository.DetailPenjualanRepository;
import id.co.prg7_miniproject_kidzone_spring.repository.PenjualanRepository;
import id.co.prg7_miniproject_kidzone_spring.repository.ProdukRepository;
import id.co.prg7_miniproject_kidzone_spring.response.DtoResponse;
import id.co.prg7_miniproject_kidzone_spring.service.PenjualanService;
import id.co.prg7_miniproject_kidzone_spring.service.ProduKService;
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
    @Autowired
    private DetailPenjualanRepository detailPenjualanRepository;
    @Autowired
    private ProduKService produKService;

    @Override
    public DtoResponse getAllPenjualan() {
        if (penjualanDao.getAllPenjualan() != null) {
            return new DtoResponse(200, penjualanDao.getAllPenjualan());
        }
        return new DtoResponse(200, null, mPjlNotFound);
    }

    @Override
    public DtoResponse savePenjualan(Penjualan penjualan) {
        try {
            penjualan.setTgl_transaksi(new Date());

//            // Iterate over the list of product IDs in the transaction
//            for (Integer idProduk : penjualan.getIdProdukList()) {
//                DtoResponse produkResponse = produKService.getProdukById(idProduk);
//                Produk produk = (Produk) produkResponse.getData();
//                if (produk != null && produk.getPro_stok() > 0) {
//                    produk.setPro_stok(produk.getPro_stok() - 1);
//                    produKService.updateProduk(produk);
//                } else {
//                    return new DtoResponse(400, null, "Produk dengan ID" + idProduk + "tidak tersedia.");
//                }
//            }

            // Save the sales transaction
            Penjualan savedPenjualan = penjualanRepository.save(penjualan);

            // Update the detail_penjualan table with the details of the products sold
            for (Integer idProduk : penjualan.getIdProdukList()) {
                DetailPenjualan detailPenjualan = new DetailPenjualan();
                DetailPenjualanPK detailPenjualanPK = new DetailPenjualanPK();
                detailPenjualanPK.setId_transaksi(savedPenjualan.getId_transaksi());
                detailPenjualanPK.setId_produk(idProduk);
//                detailPenjualan.setJumlah(1);
                detailPenjualan.setDetailPenjualanPK(detailPenjualanPK);

                // Save the detail of the product sold
                detailPenjualanRepository.save(detailPenjualan);
            }

            return new DtoResponse(200, savedPenjualan, mPjlCreateSuccess);
        } catch (Exception e) {
            return new DtoResponse(500, penjualan, mPjlCreateFailed);
        }
    }
}
