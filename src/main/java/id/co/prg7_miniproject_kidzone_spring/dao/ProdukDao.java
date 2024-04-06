package id.co.prg7_miniproject_kidzone_spring.dao;


import id.co.prg7_miniproject_kidzone_spring.vo.ProdukVo;

import java.util.List;

public interface ProdukDao {
    List<ProdukVo> getAllProduk();
    List<ProdukVo> getProdukActive();
}
