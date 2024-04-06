package id.co.prg7_miniproject_kidzone_spring.repository;

import id.co.prg7_miniproject_kidzone_spring.model.Ukuran;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import static id.co.prg7_miniproject_kidzone_spring.constant.UkuranConstant.qAllDataActive;

@Repository
public interface UkuranRepository extends JpaRepository<Ukuran, Integer> {
    @Query(value = qAllDataActive, nativeQuery = true)
    List<Ukuran> findByStatus(int status);

}
