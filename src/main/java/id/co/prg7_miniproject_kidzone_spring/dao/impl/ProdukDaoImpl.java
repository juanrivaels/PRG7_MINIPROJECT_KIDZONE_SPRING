package id.co.prg7_miniproject_kidzone_spring.dao.impl;

import id.co.prg7_miniproject_kidzone_spring.dao.ProdukDao;
import id.co.prg7_miniproject_kidzone_spring.model.Produk;
import id.co.prg7_miniproject_kidzone_spring.repository.ProdukRepository;
import id.co.prg7_miniproject_kidzone_spring.vo.ProdukVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProdukDaoImpl implements ProdukDao {
    @Autowired
    private ProdukRepository produkRepository;

    @Override
    public List<ProdukVo> getAllProduk(){
        Iterable<Produk> produks = produkRepository.findAll();
        List<ProdukVo> produkVos = new ArrayList<>();
        for (Produk item : produks){
            ProdukVo produkVo = new ProdukVo(item);

            if(produkVo.getProdukKategori().equals("1")){
                produkVo.setProdukKategori("Baju");
            } else if (produkVo.getProdukKategori().equals("0")) {
                produkVo.setProdukKategori("Celana");
            }
            if(produkVo.getProdukStatus().equals("1")){
                produkVo.setProdukStatus("Tersedia");
            } else if (produkVo.getProdukStatus().equals("0")) {
                produkVo.setProdukStatus("Tidak Tersedia");
            }

            produkVos.add(produkVo);
        }
        return produkVos;
    }

    @Override
    public List<ProdukVo> getProdukActive(){
        Iterable<Produk> produks = produkRepository.findByPro_status(1);
        List<ProdukVo> produkVos = new ArrayList<>();
        for (Produk item : produks){
            ProdukVo produkVo = new ProdukVo(item);

            if(produkVo.getProdukKategori().equals("1")){
                produkVo.setProdukKategori("Baju");
            } else if (produkVo.getProdukKategori().equals("0")) {
                produkVo.setProdukKategori("Celana");
            }
            if(produkVo.getProdukStatus().equals("1")){
                produkVo.setProdukStatus("Tersedia");
            } else if (produkVo.getProdukStatus().equals("0")) {
                produkVo.setProdukStatus("Tidak Tersedia");
            }

            produkVos.add(produkVo);
        }
        return produkVos;
    }
}
