package id.co.prg7_miniproject_kidzone_spring.service;

import id.co.prg7_miniproject_kidzone_spring.response.DtoResponse;
import id.co.prg7_miniproject_kidzone_spring.vo.DetailPenjualanVoForm;

public interface DetailPenjualanService {
    DtoResponse saveDetailPenjualan(DetailPenjualanVoForm detailPenjualanVoForm);

    DtoResponse getAllDetailPenjualan();
}
