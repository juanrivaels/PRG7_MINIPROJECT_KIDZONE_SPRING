package id.co.prg7_miniproject_kidzone_spring.rest;

import id.co.prg7_miniproject_kidzone_spring.model.Ukuran;
import id.co.prg7_miniproject_kidzone_spring.response.DtoResponse;
import id.co.prg7_miniproject_kidzone_spring.service.UkuranService;
import id.co.prg7_miniproject_kidzone_spring.vo.UkuranVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/ukurans")
public class UkuranRest {
    @Autowired
    private UkuranService ukuranService;

    public UkuranRest(UkuranService ukuranService){
        this.ukuranService = ukuranService;
    }

    @GetMapping("/getUkurans")
    public DtoResponse getUkurans(){
        return ukuranService.getAllUkurans();
    }

    @GetMapping("/getUkuranActive")
    public DtoResponse getUkuranActive(){
        return ukuranService.getUkuranActive();
    }

    @PostMapping("/saveUkuran")
    public DtoResponse saveUkuran(@RequestBody UkuranVo ukuranVo){
        return ukuranService.saveUkuran(ukuranVo);
    }

    @PutMapping("/updateUkuran")
    public DtoResponse updateUkuran(@RequestBody Ukuran ukuran){
        return ukuranService.updateUkuran(ukuran);
    }

    @DeleteMapping("/deleteUkuran")
    public DtoResponse deleteUkuran(@RequestBody UkuranVo ukuranVo){
        return ukuranService.deleteUkuran(ukuranVo);
    }




}

