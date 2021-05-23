package com.company.dienLanhBachKhoa.resouce;

import com.company.dienLanhBachKhoa.model.SanPham;
import com.company.dienLanhBachKhoa.service.SanPhamService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/find/{congSuat}")
    public ResponseEntity<List<SanPham>> findSanPhamByCongSuat(@PathVariable("congSuat") String congSuat){
        List<SanPham> sanPhams = sanPhamService.findSanPhamByCongSuat(congSuat);
        return new ResponseEntity<>(sanPhams, HttpStatus.OK);
    }
    @GetMapping("/find/{loaiMay}")
    public ResponseEntity<List<SanPham>> findSanPhamByLoaiMay(@PathVariable("loaiMay") String loaiMay){
        List<SanPham> sanPhams = sanPhamService.findSanPhamByLoaiMay(loaiMay);
        return new ResponseEntity<>(sanPhams, HttpStatus.OK);
    }

    @GetMapping("/find/{kieuMay}")
    public ResponseEntity<List<SanPham>> findSanPhamByKieuMay(@PathVariable("kieuMay") String kieuMay){
        List<SanPham> sanPhams = sanPhamService.findSanPhamByKieuMay(kieuMay);
        return new ResponseEntity<>(sanPhams, HttpStatus.OK);
    }

    @GetMapping("/find/{loaiGas}")
    public ResponseEntity<List<SanPham>> findSanPhamByLoaiGas(@PathVariable("loaiGas") String loaiGas){
        List<SanPham> sanPhams = sanPhamService.findSanPhamByLoaiGas(loaiGas);
        return new ResponseEntity<>(sanPhams, HttpStatus.OK);
    }

    @GetMapping("/find/{xuatXu}")
    public ResponseEntity<List<SanPham>> findSanPhamByXuatXu(@PathVariable("xuatXu") String xuatXu){
        List<SanPham> sanPhams = sanPhamService.findSanPhamByXuatXu(xuatXu);
        return new ResponseEntity<>(sanPhams, HttpStatus.OK);
    }

    @GetMapping("/find/{idSanPham}")
    public ResponseEntity<SanPham> findSanPhamByIdSanPham(@PathVariable("idSanPham") String idSanPham){
        SanPham sanPham = sanPhamService.findSanPhamByIdSanPham(idSanPham);
        return new ResponseEntity<>(sanPham, HttpStatus.OK);
    }

}
