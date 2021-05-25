package com.company.dienLanhBachKhoa.resouce;

import com.company.dienLanhBachKhoa.model.BaiViet;
import com.company.dienLanhBachKhoa.service.BaiVietService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/baiViet")
public class BaiVietResouce {
    private final BaiVietService baiVietService;


    public BaiVietResouce(BaiVietService baiVietService) {
        this.baiVietService = baiVietService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<BaiViet>> getAllBaiViet(){
        List<BaiViet> baiViets = baiVietService.findAllBaiViet();
        return new ResponseEntity<>(baiViets , HttpStatus.OK);
    }

    @GetMapping("/find/theLoai/{theLoai}")
    public ResponseEntity<List<BaiViet>> getBaiVietByTheLoai(@PathVariable("theLoai") String theLoai){
        List<BaiViet> baiViets = baiVietService.findBaiVietByTheLoai(theLoai);
        return new ResponseEntity<>(baiViets , HttpStatus.OK);
    }
    
    @GetMapping("/find/idBaiViet/{idBaiViet}")
    public ResponseEntity<BaiViet> getBaiVietByIdBaiViet(@PathVariable("idBaiViet") Long idBaiViet){
        BaiViet baiViet = baiVietService.findBaiVietByIdBaiViet(idBaiViet);
        return new ResponseEntity<>(baiViet,HttpStatus.OK);                
    }
    
    @PostMapping("/add")
    public ResponseEntity<BaiViet> addBaiViet(@RequestBody BaiViet baiViet){
        BaiViet newBaiViet = baiVietService.addBaiViet(baiViet);
        return new ResponseEntity<>(newBaiViet , HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<BaiViet> updateBaiViet(@RequestBody BaiViet BaiViet){
        BaiViet updateBaiViet = baiVietService.addBaiViet(BaiViet);
        return new ResponseEntity<>(updateBaiViet, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{idbaiViet}")
    public ResponseEntity<BaiViet> deleteBaiViet(@PathVariable("idBaiViet") String idBaiViet){
        baiVietService.deleteBaiViet(idBaiViet);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
