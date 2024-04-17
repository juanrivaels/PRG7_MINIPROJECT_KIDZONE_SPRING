package id.co.prg7_miniproject_kidzone_spring.dao.impl;

import id.co.prg7_miniproject_kidzone_spring.dao.DetailPenjualanDao;
import id.co.prg7_miniproject_kidzone_spring.model.DetailPenjualan;
import id.co.prg7_miniproject_kidzone_spring.model.Produk;
import id.co.prg7_miniproject_kidzone_spring.repository.DetailPenjualanRepository;
import id.co.prg7_miniproject_kidzone_spring.repository.PenjualanRepository;
import id.co.prg7_miniproject_kidzone_spring.repository.ProdukRepository;
import id.co.prg7_miniproject_kidzone_spring.vo.DetailPenjualanVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DetailPenjualanDaoImpl implements DetailPenjualanDao {
    @Autowired
    private DetailPenjualanRepository detailPenjualanRepository;
    @Autowired
    private PenjualanRepository penjualanRepository;
    @Autowired
    private ProdukRepository produkRepository;

    public List<DetailPenjualanVo> getAllDetailPenjualan(){
        Iterable<DetailPenjualan> detailPenjualan = detailPenjualanRepository.findAll();
        List<DetailPenjualanVo> detailPenjualanVos = new ArrayList<>();
        for (DetailPenjualan item : detailPenjualan){
            DetailPenjualanVo detailPenjualanVo = new DetailPenjualanVo(item);

            Produk produk = produkRepository.findById(detailPenjualanVo.getProdukId()).orElseThrow();
            detailPenjualanVo.setProdukDesc(produk.getPro_nama());

            detailPenjualanVos.add(detailPenjualanVo);
        }
        return detailPenjualanVos;
    }
}
