package id.co.prg7_miniproject_kidzone_spring.dao.impl;

import id.co.prg7_miniproject_kidzone_spring.dao.PenjualanDao;
import id.co.prg7_miniproject_kidzone_spring.model.Penjualan;
import id.co.prg7_miniproject_kidzone_spring.model.Produk;
import id.co.prg7_miniproject_kidzone_spring.repository.PenjualanRepository;
import id.co.prg7_miniproject_kidzone_spring.repository.ProdukRepository;
import id.co.prg7_miniproject_kidzone_spring.vo.PenjualanVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PenjualanDaoImpl implements PenjualanDao {
    @Autowired
    private PenjualanRepository penjualanRepository;
    @Autowired
    private ProdukRepository produkRepository;

    @Override
    public List<PenjualanVo> getAllPenjualan() {
        Iterable<Penjualan> penjualans = penjualanRepository.findAll();
        List<PenjualanVo> penjualanVos = new ArrayList<>();
        for(Penjualan item : penjualans){

            PenjualanVo penjualanVo = new PenjualanVo(item);
            penjualanVos.add(penjualanVo);
        }
        return penjualanVos;
    }

}
