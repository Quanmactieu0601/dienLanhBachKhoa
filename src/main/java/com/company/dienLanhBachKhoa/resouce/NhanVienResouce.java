package com.company.dienLanhBachKhoa.resouce;

import com.company.dienLanhBachKhoa.model.NhanVien;
import com.company.dienLanhBachKhoa.repo.NhanVienRepo;
import com.company.dienLanhBachKhoa.service.NhanVienService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nhanVien")

public class NhanVienResouce {
    public final NhanVienService nhanVienService;


    public NhanVienResouce(NhanVienService nhanVienService) {
        this.nhanVienService = nhanVienService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<NhanVien>> findAllNhanVien(){
        List<NhanVien> nhanViens = nhanVienService.findAllNhanVien();
        return new ResponseEntity<>(nhanViens, HttpStatus.OK);
    }

    @GetMapping("/find/{idNhanVien}")
    public ResponseEntity<NhanVien> findNhanVienById(@PathVariable("idNhanVien") Long idNhanVien){
        NhanVien nhanVien = nhanVienService.findNhanVienByIdNhanVien(idNhanVien);
        return new ResponseEntity<>(nhanVien,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<NhanVien> addNhanVien(@RequestBody NhanVien nhanVien){
        NhanVien newNhanVien = nhanVienService.addNhanVien(nhanVien);
        return new ResponseEntity<>(newNhanVien,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<NhanVien> updateNhanVien(@RequestBody NhanVien nhanVien){
        NhanVien updateNhanVien = nhanVienService.updateNhanVien(nhanVien);
        return  new ResponseEntity<>(updateNhanVien,HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{idNhanVien}")
    public ResponseEntity<?> deleteNhanVienById(@PathVariable("idNhanVien") Long idNhanVien){
        nhanVienService.deleteNhanVienByIdNhanVien(idNhanVien);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
