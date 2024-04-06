package id.co.prg7_miniproject_kidzone_spring.rest;
import id.co.prg7_miniproject_kidzone_spring.model.Produk;
import id.co.prg7_miniproject_kidzone_spring.response.DtoResponse;
import id.co.prg7_miniproject_kidzone_spring.service.ProduKService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produks")
public class ProdukRest {
    @Autowired
    private ProduKService produKService;
    public ProdukRest(ProduKService produKService){
        this.produKService = produKService;
    }
    @GetMapping("/getProduks")
    public DtoResponse getProduks(){
        return produKService.getAllProduk();
    }
    @GetMapping("/getProdukActive")
    public DtoResponse getProdukActive(){
        return produKService.getProdukActive();
    }
    @PostMapping("/saveProduk")
    public DtoResponse saveProduk(@RequestBody Produk produk){
        return produKService.saveProduk(produk);
    }
    @PostMapping("/updateProduk")
    public DtoResponse updateProduk(@RequestBody Produk produk){
        return produKService.updateProduk(produk);
    }
    @PostMapping("/deleteProduk")
    public DtoResponse deleteProduk(@RequestBody Produk produk){
        return produKService.deleteProduk(produk);
    }

}
