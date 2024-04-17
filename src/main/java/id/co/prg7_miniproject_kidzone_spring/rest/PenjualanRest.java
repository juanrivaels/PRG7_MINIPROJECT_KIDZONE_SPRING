package id.co.prg7_miniproject_kidzone_spring.rest;

import id.co.prg7_miniproject_kidzone_spring.model.Penjualan;
import id.co.prg7_miniproject_kidzone_spring.model.Produk;
import id.co.prg7_miniproject_kidzone_spring.response.DtoResponse;
import id.co.prg7_miniproject_kidzone_spring.service.PenjualanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@CrossOrigin
@RestController
@RequestMapping("/penjualan")
public class PenjualanRest {
    private final PenjualanService penjualanService;

    @Autowired
    public PenjualanRest(PenjualanService penjualanService) {
        this.penjualanService = penjualanService;
    }

    @GetMapping("/getPenjualan")
    public DtoResponse getPenjualan() {
        return penjualanService.getAllPenjualan();
    }

    @PostMapping("/savePenjualan")
    public DtoResponse savePenjualan(@RequestBody Penjualan penjualan){
        return penjualanService.savePenjualan(penjualan);
    }
}
