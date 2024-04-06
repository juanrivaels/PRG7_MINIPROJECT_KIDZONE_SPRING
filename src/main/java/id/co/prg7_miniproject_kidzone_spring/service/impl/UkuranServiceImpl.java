package id.co.prg7_miniproject_kidzone_spring.service.impl;

import id.co.prg7_miniproject_kidzone_spring.dao.UkuranDao;
import id.co.prg7_miniproject_kidzone_spring.model.Ukuran;
import id.co.prg7_miniproject_kidzone_spring.repository.UkuranRepository;
import id.co.prg7_miniproject_kidzone_spring.response.DtoResponse;
import id.co.prg7_miniproject_kidzone_spring.service.UkuranService;
import id.co.prg7_miniproject_kidzone_spring.vo.UkuranVo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static id.co.prg7_miniproject_kidzone_spring.constant.UkuranConstant.*;

@Service
@Transactional
public class UkuranServiceImpl implements UkuranService {

    @Autowired
    private UkuranDao ukuranDao;

    @Autowired
    private UkuranRepository ukuranRepository;

    @Override
    public DtoResponse getAllUkurans() {
        if (ukuranDao.getAllUkurans() != null){
            return new DtoResponse(200, ukuranDao.getAllUkurans());
        }
        return new DtoResponse(200, null, mEmptyData);
    }

    @Override
    public DtoResponse getUkuranActive() {
        if (ukuranDao.getUkuranActive() != null){
            return new DtoResponse(200, ukuranDao.getUkuranActive());
        }
        return new DtoResponse(200, null, mEmptyData);
    }

    @Override
    public DtoResponse saveUkuran(UkuranVo ukuranVo) {
        try {
            Ukuran ukr_ukuran = new Ukuran();
            ukr_ukuran.setUkr_id(ukuranVo.getUkr_id());
            ukr_ukuran.setUkr_nama(ukuranVo.getUkr_nama());
            ukr_ukuran.setUkr_kategori(Integer.parseInt(ukuranVo.getUkr_kategori()));
            ukr_ukuran.setUkr_panjang(ukuranVo.getUkr_panjang());
            ukr_ukuran.setUkr_lebar_dada(ukuranVo.getUkr_lebar_dada());
            ukr_ukuran.setUkr_lingkar_pinggang(ukuranVo.getUkr_lingkar_pinggang());
            ukr_ukuran.setUkr_tinggi(ukuranVo.getUkr_tinggi());
            ukr_ukuran.setUkr_status(1);

            ukuranRepository.save(ukr_ukuran);
            return new DtoResponse(200, ukr_ukuran, mCreateSuccess);
        } catch (Exception e) {
            return new DtoResponse(500, null, mCreateFailed);
        }
    }


    @Override
    public DtoResponse updateUkuran(Ukuran ukuran) {
        try {
            Ukuran updatedUkuran = ukuranRepository.save(ukuran);
            if (updatedUkuran != null) {
                return new DtoResponse(200, updatedUkuran, mUpdateSuccess);
            } else {
                return new DtoResponse(500, null, mNotFound);
            }
        } catch (Exception e) {
            return new DtoResponse(500, null, mUpdateFailed);
        }
    }

    @Override
    public DtoResponse deleteUkuran(UkuranVo ukuranVo) {
        try {
            Ukuran ukuranData = ukuranRepository.findById(ukuranVo.getUkr_id()).orElse(null);
            if (ukuranData == null) {
                return new DtoResponse(500, null, mNotFound);
            }
            ukuranData.setUkr_status(0); // Assuming '0' means inactive or deleted

            Ukuran updatedUkuran = ukuranRepository.save(ukuranData);
            return new DtoResponse(200, updatedUkuran, mDeleteSuccess);
        } catch (Exception e) {
            return new DtoResponse(500, null, mDeleteFailed);
        }
    }
}
