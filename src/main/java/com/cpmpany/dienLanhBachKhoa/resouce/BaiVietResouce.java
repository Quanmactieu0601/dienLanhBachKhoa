package com.cpmpany.dienLanhBachKhoa.resouce;

import com.cpmpany.dienLanhBachKhoa.model.BaiViet;
import com.cpmpany.dienLanhBachKhoa.model.BaiViet;
import com.cpmpany.dienLanhBachKhoa.repo.BaiVietRepo;
import com.cpmpany.dienLanhBachKhoa.service.BaiVietService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

@Resource
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

    @GetMapping("/find/{theLoai}")
    public ResponseEntity<List<BaiViet>> getBaiVietByTheLoai(@PathVariable("theLoai") String theLoai){
        List<BaiViet> baiViets = baiVietService.findBaiVietByTheLoai(theLoai);
        return new ResponseEntity<>(baiViets , HttpStatus.OK);
    }
    
    @GetMapping("find/{idBaiViet}")
    public ResponseEntity<BaiViet> getBaiVietByIdBaiViet(@PathVariable("idBaiViet") String idBaiViet){
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

    @DeleteMapping("/delete")
    public ResponseEntity<BaiViet> deleteBaiViet(@PathVariable("id") String idBaiViet){
        baiVietService.deleteBaiViet(idBaiViet);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
