package id.co.prg7_miniproject_kidzone_spring.dao.impl;

import id.co.prg7_miniproject_kidzone_spring.dao.UkuranDao;
import id.co.prg7_miniproject_kidzone_spring.model.Ukuran;
import id.co.prg7_miniproject_kidzone_spring.repository.UkuranRepository;
import id.co.prg7_miniproject_kidzone_spring.vo.UkuranVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UkuranDaoImpl implements UkuranDao {
    @Autowired
    private UkuranRepository ukuranRepository;

    @Override
    public List<UkuranVo> getAllUkurans() {
        Iterable<Ukuran> ukurans = ukuranRepository.findAll();
        List<UkuranVo> ukuranVos = new ArrayList<>();

        for (Ukuran item : ukurans) {
            UkuranVo ukuranVo = new UkuranVo(item);

            if (ukuranVo.getUkr_status().equals("0")) {
                ukuranVo.setUkr_status("Tidak Aktif");
            } else if (ukuranVo.getUkr_status().equals("1")) {
                ukuranVo.setUkr_status("Aktif");
            }

            if (ukuranVo.getUkr_kategori().equals("0")) {
                ukuranVo.setUkr_kategori("Baju");
            } else if (ukuranVo.getUkr_kategori().equals("1")) {
                ukuranVo.setUkr_kategori("Celana");
            }
            ukuranVos.add(ukuranVo);
        }
        return ukuranVos;
    }
    @Override
    public List<UkuranVo> getUkuranActive() {
        Iterable<Ukuran> ukurans = ukuranRepository.findByStatus(1);
        List<UkuranVo> ukuranVos = new ArrayList<>();
        for (Ukuran item : ukurans) {
            UkuranVo ukuranVo = new UkuranVo(item);
            ukuranVos.add(ukuranVo);
        }
        return ukuranVos;
    }

}
