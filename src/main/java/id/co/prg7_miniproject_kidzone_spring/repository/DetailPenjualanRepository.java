package id.co.prg7_miniproject_kidzone_spring.repository;

import id.co.prg7_miniproject_kidzone_spring.model.DetailPenjualan;
import id.co.prg7_miniproject_kidzone_spring.model.DetailPenjualanPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DetailPenjualanRepository extends JpaRepository<DetailPenjualan, DetailPenjualanPK> {
    @Query("SELECT dp FROM DetailPenjualan dp WHERE dp.detailPenjualanPK.id_transaksi = :id_transaksi")
    List<DetailPenjualan> findById_Transaksi(@Param("id_transaksi") Integer id_transaksi);
}

