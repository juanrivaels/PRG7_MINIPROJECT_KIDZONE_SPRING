package id.co.prg7_miniproject_kidzone_spring.service;

import id.co.prg7_miniproject_kidzone_spring.model.Ukuran;
import id.co.prg7_miniproject_kidzone_spring.response.DtoResponse;
import id.co.prg7_miniproject_kidzone_spring.vo.UkuranVo;

public interface UkuranService {
    DtoResponse getAllUkurans();
    DtoResponse getUkuranActive();
    DtoResponse saveUkuran(UkuranVo ukuranVo);
    DtoResponse updateUkuran(Ukuran ukuran);
    DtoResponse deleteUkuran(UkuranVo ukuranVo);
}
