package com.company.dienLanhBachKhoa.resouce;

import com.company.dienLanhBachKhoa.model.DichVu;
import com.company.dienLanhBachKhoa.service.DichVuService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Resource
@RequestMapping("/dichVu")
public class DichVuResouce {
    public final DichVuService dichVuService;


    public DichVuResouce(DichVuService dichVuService) {
        this.dichVuService = dichVuService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<DichVu>> findAllDichVu(){
        List<DichVu> dichVus = dichVuService.findAllDichVu();
        return new ResponseEntity<>(dichVus , HttpStatus.OK);
    }

    @GetMapping("/find/{theLoai}")
    public ResponseEntity<List<DichVu>> findDichVuByTheLoai(@PathVariable("theLoai") String theLoai){
        List<DichVu> dichVus = dichVuService.findDichVuByTheLoai(theLoai);
        return new ResponseEntity<>(dichVus , HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<DichVu> addDichVu(@RequestBody DichVu dichVu){
        DichVu newDichVu = dichVuService.addDichVu(dichVu);
        return new ResponseEntity<>(newDichVu , HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<DichVu> updateDichVu(@RequestBody DichVu dichVu){
        DichVu updateDichVu = dichVuService.addDichVu(dichVu);
        return new ResponseEntity<>(updateDichVu , HttpStatus.CREATED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteDichVuByIdDichVu(@PathVariable("idDichVu") String idDichVu){
        dichVuService.deleteDichVu(idDichVu);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
