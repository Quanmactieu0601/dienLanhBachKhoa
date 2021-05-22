package com.company.dienLanhBachKhoa.resouce;

import com.company.dienLanhBachKhoa.model.HoaDon;
import com.company.dienLanhBachKhoa.service.HoaDonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hoaDon")
public class HoaDonResouce {
    public final HoaDonService hoaDonService;

    public HoaDonResouce(HoaDonService hoaDonService) {
        this.hoaDonService = hoaDonService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<HoaDon>> findAllHoaDon(){
        List<HoaDon> hoaDons = hoaDonService.findAllHoaDon();
        return new ResponseEntity<>(hoaDons , HttpStatus.OK);
    }

    @GetMapping("/find/{idKhachHang}")
    public ResponseEntity<List<HoaDon>> findHoaDonByIdKhachHang(@PathVariable("idKhachHang") Long idKhachHang){
        List<HoaDon> hoaDons = hoaDonService.findHoaDonByIdKhachHang(idKhachHang);
        return new ResponseEntity<>(hoaDons , HttpStatus.OK);
    }

    @GetMapping("/find/{idNhanVien}")
    public ResponseEntity<List<HoaDon>> findHoaDonByIdKhachHang(@PathVariable("idNhanVien") String idNhanVien){
        List<HoaDon> hoaDons = hoaDonService.findHoaDonByIdNhanVien(idNhanVien);
        return new ResponseEntity<>(hoaDons , HttpStatus.OK);
    }

    @GetMapping("/find/{ngayLap}")
    public ResponseEntity<List<HoaDon>> findHoaDonByNgayLap(@PathVariable("ngayLap") String ngayLap){
        List<HoaDon> hoaDons = hoaDonService.findHoaDonByNgayLap(ngayLap);
        return new ResponseEntity<>(hoaDons , HttpStatus.OK);
    }

    @GetMapping("/find/{idHoaDon}")
    public ResponseEntity<HoaDon> findHoaDonByIdHoaDon(@PathVariable("idHoaDon") String idHoaDon){
        HoaDon hoaDon = hoaDonService.findHoaDonByIdHoaDon(idHoaDon);
        return new ResponseEntity<>(hoaDon , HttpStatus.OK);
    }

    @GetMapping("/find/{biHuy}")
    public ResponseEntity<List<HoaDon>> findHoaDonByBiHuy(@PathVariable("biHuy") Boolean biHuy){
        List<HoaDon> hoaDons = hoaDonService.findHoaDonByBiHuy(biHuy);
        return new ResponseEntity<>(hoaDons , HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<HoaDon> addHoaDon(HoaDon hoaDon){
        HoaDon newHoaDon = hoaDonService.addHoaDon(hoaDon);
        return new ResponseEntity<>(newHoaDon,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<HoaDon> update(HoaDon hoaDon){
        HoaDon updateHoaDon = hoaDonService.updateHoaDon(hoaDon);
        return new ResponseEntity<>(updateHoaDon,HttpStatus.CREATED);
    }
}
