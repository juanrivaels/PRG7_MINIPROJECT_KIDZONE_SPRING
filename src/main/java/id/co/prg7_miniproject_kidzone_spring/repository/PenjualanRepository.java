package id.co.prg7_miniproject_kidzone_spring.repository;

import id.co.prg7_miniproject_kidzone_spring.model.Penjualan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import static id.co.prg7_miniproject_kidzone_spring.constant.PenjualanConstant.*;

public interface  PenjualanRepository extends JpaRepository<Penjualan, Integer> {
    @Query(value = qPjlAllDataActive, nativeQuery = true)
    List<Penjualan> findByStatus(int status);
}
