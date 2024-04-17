package id.co.prg7_miniproject_kidzone_spring.repository;

import id.co.prg7_miniproject_kidzone_spring.model.DetailPenjualan;
import id.co.prg7_miniproject_kidzone_spring.model.DetailPenjualanPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailPenjualanRepository extends JpaRepository<DetailPenjualan, DetailPenjualanPK> {
}
