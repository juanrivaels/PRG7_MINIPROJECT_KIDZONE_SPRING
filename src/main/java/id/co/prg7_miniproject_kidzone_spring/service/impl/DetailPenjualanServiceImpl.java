package id.co.prg7_miniproject_kidzone_spring.service.impl;

import id.co.prg7_miniproject_kidzone_spring.dao.DetailPenjualanDao;
import id.co.prg7_miniproject_kidzone_spring.model.DetailPenjualan;
import id.co.prg7_miniproject_kidzone_spring.model.DetailPenjualanPK;
import id.co.prg7_miniproject_kidzone_spring.model.Penjualan;
import id.co.prg7_miniproject_kidzone_spring.model.Produk;
import id.co.prg7_miniproject_kidzone_spring.repository.DetailPenjualanRepository;
import id.co.prg7_miniproject_kidzone_spring.repository.PenjualanRepository;
import id.co.prg7_miniproject_kidzone_spring.repository.ProdukRepository;
import id.co.prg7_miniproject_kidzone_spring.response.DtoResponse;
import id.co.prg7_miniproject_kidzone_spring.service.DetailPenjualanService;
import id.co.prg7_miniproject_kidzone_spring.vo.DetailPenjualanVoForm;
import id.co.prg7_miniproject_kidzone_spring.vo.PenjualanVo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.BaseUri;
import org.springframework.stereotype.Service;

import static id.co.prg7_miniproject_kidzone_spring.constant.PenjualanConstant.*;

@Service
@Transactional
public class DetailPenjualanServiceImpl implements DetailPenjualanService {
    @Autowired
    private DetailPenjualanDao detailPenjualanDao;
    @Autowired
    private DetailPenjualanRepository detailPenjualanRepository;
    @Autowired
    private ProdukRepository produkRepository;
    @Autowired
    private PenjualanRepository penjualanRepository;

    @Override
    public DtoResponse getAllDetailPenjualan(){
        if (detailPenjualanDao.getAllDetailPenjualan() != null){
            return new DtoResponse(200, detailPenjualanDao.getAllDetailPenjualan());
        }
        return new DtoResponse(200, null, mPjlEmptyData);
    }

    @Override
    public DtoResponse saveDetailPenjualan(DetailPenjualanVoForm detailPenjualanVoForm){
        try {
            DetailPenjualanPK detailPenjualanPK = new DetailPenjualanPK();
            detailPenjualanPK.setId_transaksi(detailPenjualanVoForm.getId_transaksi());
            detailPenjualanPK.setId_produk(detailPenjualanVoForm.getId_produk());

            Penjualan existingPenjualan = penjualanRepository.findById(detailPenjualanVoForm.getId_transaksi()).orElse(null);
            if (existingPenjualan == null){
                return new DtoResponse(404, null, "Peminjaman is invalid");
            }

            Produk existingProduk = produkRepository.findById(detailPenjualanVoForm.getId_produk()).orElse(null);
            if (existingProduk == null){
                return new DtoResponse(404, null, "Produk is Invalid");
            }
            DetailPenjualan detailPenjualan = new DetailPenjualan();
            detailPenjualan.setDetailPenjualanPK(detailPenjualanPK);

            DetailPenjualan detailPenjualan1 = detailPenjualanRepository.save(detailPenjualan);
            return new DtoResponse(200, detailPenjualan1, mPjlCreateSuccess);
        }catch (Exception e){
            return new DtoResponse(500, detailPenjualanVoForm,mPjlCreateSuccess);
        }
    }
}
