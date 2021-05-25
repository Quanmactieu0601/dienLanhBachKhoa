package com.company.dienLanhBachKhoa.resouce;

import com.company.dienLanhBachKhoa.model.SanPham;
import com.company.dienLanhBachKhoa.service.SanPhamService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sanPham")
public class SanPhamResource {
    public final SanPhamService sanPhamService;

    public SanPhamResource(SanPhamService sanPhamService) {
        this.sanPhamService = sanPhamService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<SanPham>> findAllSanPham(){
        List<SanPham> sanPhams = sanPhamService.findAllSanPham();
        return new ResponseEntity<>(sanPhams, HttpStatus.OK);
    }

    @GetMapping("/find/congSuat/{congSuat}")
    public ResponseEntity<List<SanPham>> findSanPhamByCongSuat(@PathVariable("congSuat") String congSuat){
        List<SanPham> sanPhams = sanPhamService.findSanPhamByCongSuat(congSuat);
        return new ResponseEntity<>(sanPhams, HttpStatus.OK);
    }

    @GetMapping("/find/loaiSanPham/{loaiSanPham}")
    public ResponseEntity<List<SanPham>> findSanPhamByLoaiSanPham(@PathVariable("loaiSanPham") String loaiSanPham){
        List<SanPham> sanPhams = sanPhamService.findSanPhamByLoaiSanPham(loaiSanPham);
        return new ResponseEntity<>(sanPhams, HttpStatus.OK);
    }

    @GetMapping("/find/loaiMay/{loaiMay}")
    public ResponseEntity<List<SanPham>> findSanPhamByLoaiMay(@PathVariable("loaiMay") String loaiMay){
        List<SanPham> sanPhams = sanPhamService.findSanPhamByLoaiMay(loaiMay);
        return new ResponseEntity<>(sanPhams, HttpStatus.OK);
    }

    @GetMapping("/find/kieuMay/{kieuMay}")
    public ResponseEntity<List<SanPham>> findSanPhamByKieuMay(@PathVariable("kieuMay") String kieuMay){
        List<SanPham> sanPhams = sanPhamService.findSanPhamByKieuMay(kieuMay);
        return new ResponseEntity<>(sanPhams, HttpStatus.OK);
    }

    @GetMapping("/find/loaiGas/{loaiGas}")
    public ResponseEntity<List<SanPham>> findSanPhamByLoaiGas(@PathVariable("loaiGas") String loaiGas){
        List<SanPham> sanPhams = sanPhamService.findSanPhamByLoaiGas(loaiGas);
        return new ResponseEntity<>(sanPhams, HttpStatus.OK);
    }

    @GetMapping("/find/xuatXu/{xuatXu}")
    public ResponseEntity<List<SanPham>> findSanPhamByXuatXu(@PathVariable("xuatXu") String xuatXu){
        List<SanPham> sanPhams = sanPhamService.findSanPhamByXuatXu(xuatXu);
        return new ResponseEntity<>(sanPhams, HttpStatus.OK);
    }

    @GetMapping("/find/idSanPham/{idSanPham}")
    public ResponseEntity<SanPham> findSanPhamByIdSanPham(@PathVariable("idSanPham") Long idSanPham){
        SanPham sanPham = sanPhamService.findSanPhamByIdSanPham(idSanPham);
        return new ResponseEntity<>(sanPham, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<SanPham> addSanPham(@RequestBody SanPham sanPham){
        SanPham newSanPham = sanPhamService.addSanPham(sanPham);
        return  new ResponseEntity<>(newSanPham, HttpStatus.CREATED);
    }


}
