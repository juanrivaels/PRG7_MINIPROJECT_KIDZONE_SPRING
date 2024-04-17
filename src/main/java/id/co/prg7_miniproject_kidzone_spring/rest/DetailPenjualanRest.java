package id.co.prg7_miniproject_kidzone_spring.rest;

import id.co.prg7_miniproject_kidzone_spring.response.DtoResponse;
import id.co.prg7_miniproject_kidzone_spring.service.DetailPenjualanService;
import id.co.prg7_miniproject_kidzone_spring.vo.DetailPenjualanVo;
import id.co.prg7_miniproject_kidzone_spring.vo.DetailPenjualanVoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/detailpenjualan")
public class DetailPenjualanRest {
    @Autowired
    private DetailPenjualanService detailPenjualanService;

    public DetailPenjualanRest(DetailPenjualanService detailPenjualanService){
        this.detailPenjualanService = detailPenjualanService;
    }

    @GetMapping("/getDetailPenjualans")
    public DtoResponse getDetailPenjualans(){
        return detailPenjualanService.getAllDetailPenjualan();
    }

    @PostMapping("/saveDetailPenjualan")
    public DtoResponse saveDetailPenjualan(@RequestBody DetailPenjualanVoForm detailPenjualanVoForm){
        return detailPenjualanService.saveDetailPenjualan(detailPenjualanVoForm);
    }
}
