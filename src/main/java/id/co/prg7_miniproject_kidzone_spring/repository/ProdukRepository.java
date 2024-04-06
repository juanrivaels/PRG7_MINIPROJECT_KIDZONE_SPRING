package id.co.prg7_miniproject_kidzone_spring.repository;


import id.co.prg7_miniproject_kidzone_spring.model.Produk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import static id.co.prg7_miniproject_kidzone_spring.constant.ProdukConstant.qProAllDataActive;

public interface ProdukRepository extends JpaRepository<Produk, Integer> {
    @Query(value = qProAllDataActive,nativeQuery = true)
    List<Produk> findByPro_status(int status);
}
