package id.co.prg7_miniproject_kidzone_spring.rest;


import id.co.prg7_miniproject_kidzone_spring.model.Penjualan;
import id.co.prg7_miniproject_kidzone_spring.model.Produk;
import id.co.prg7_miniproject_kidzone_spring.response.DtoResponse;
import id.co.prg7_miniproject_kidzone_spring.service.PenjualanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/penjualan")
public class PenjualanRest {
    @Autowired
    private PenjualanService penjualanService;

    public PenjualanRest(PenjualanService penjualanService){
        this.penjualanService = penjualanService;
    }

    @GetMapping("/getPenjualan")
    public DtoResponse getPenjualan(){
        return penjualanService.getAllPenjualan();
    }

    @PostMapping("/savePenjualan")
    public DtoResponse savePenjualan(@RequestBody Penjualan penjualan, @RequestBody Set<Produk> produk){
        return penjualanService.savePenjualan(penjualan, produk);
    }

}
