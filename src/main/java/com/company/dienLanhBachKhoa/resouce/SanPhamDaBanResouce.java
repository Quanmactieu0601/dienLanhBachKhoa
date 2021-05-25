package com.company.dienLanhBachKhoa.resouce;

import com.company.dienLanhBachKhoa.model.SanPhamDaBan;
import com.company.dienLanhBachKhoa.service.SanPhamDaBanService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sanPhamDaBan")
public class SanPhamDaBanResouce {
    public final SanPhamDaBanService sanPhamDaBanService;

    public SanPhamDaBanResouce(SanPhamDaBanService sanPhamDaBanService) {
        this.sanPhamDaBanService = sanPhamDaBanService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<SanPhamDaBan>> findAllSanPhamDaBan(){
        List<SanPhamDaBan> sanPhamDaBans = sanPhamDaBanService.findAllSanPhamDaBan();
        return new ResponseEntity<>(sanPhamDaBans, HttpStatus.OK);
    }

    @GetMapping("/find/{idHoaDon}")
    public ResponseEntity<List<SanPhamDaBan>> findSanPhamDaBanByIdHoaDon(@PathVariable("idHoaDon") Long idHoaDon){
        List<SanPhamDaBan> sanPhamDaBans = sanPhamDaBanService.findSanPhamDaBanByIdHoaDon(idHoaDon);
        return new ResponseEntity<>(sanPhamDaBans, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<SanPhamDaBan> addSanPhamDaBan(SanPhamDaBan sanPhamDaBan){
        SanPhamDaBan newSanPhamDaBan = sanPhamDaBanService.addSanPhamDaBan(sanPhamDaBan);
        return new ResponseEntity<>(newSanPhamDaBan,HttpStatus.CREATED);
    }
}
