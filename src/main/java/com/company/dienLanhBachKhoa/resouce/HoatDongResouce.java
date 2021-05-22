package com.company.dienLanhBachKhoa.resouce;

import com.company.dienLanhBachKhoa.model.HoatDong;
import com.company.dienLanhBachKhoa.service.HoatDongService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hoatDong")
public class HoatDongResouce {
    public final HoatDongService hoatDongService;

    public HoatDongResouce(HoatDongService hoatDongService) {
        this.hoatDongService = hoatDongService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<HoatDong>> findAllHoatDong(){
        List<HoatDong> hoatDongs = hoatDongService.findAllHoatDong();
        return new ResponseEntity<>(hoatDongs, HttpStatus.OK);
    }

    @GetMapping("/find/{idHoaDon}")
    public ResponseEntity<List<HoatDong>> findHoatDongByIdHoaDon(@PathVariable("idHoaDon") String idHoaDon){
        List<HoatDong> hoatDongs = hoatDongService.findHoatDongByIdHoaDon(idHoaDon);
        return new ResponseEntity<>(hoatDongs, HttpStatus.OK);
    }

    @GetMapping("/find/{idDichvu}")
    public ResponseEntity<List<HoatDong>> findHoatDongByIdDichVu(@PathVariable("idDichvu") String idDichvu){
        List<HoatDong> hoatDongs = hoatDongService.findHoatDongByIdDichVu(idDichvu);
        return new ResponseEntity<>(hoatDongs, HttpStatus.OK);
    }

    @GetMapping("/find/{idHoatDong}")
    public ResponseEntity<HoatDong> findHoatDongByidHoatDong(@PathVariable("idHoatDong") Long idHoatDong){
        HoatDong hoatDong = hoatDongService.findHoatDongByidHoatDong(idHoatDong);
        return new ResponseEntity<>(hoatDong, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<HoatDong> addHoatDong(HoatDong hoatDong){
        HoatDong newHoatDong = hoatDongService.addHoatDong(hoatDong);
        return new ResponseEntity<>(newHoatDong, HttpStatus.CREATED);
    }

    @PutMapping("/add")
    public ResponseEntity<HoatDong> updateHoatDong(HoatDong hoatDong){
        HoatDong updateHoatDong = hoatDongService.updateHoatDong(hoatDong);
        return new ResponseEntity<>(updateHoatDong, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{idHoatDong}")
    public ResponseEntity<?> deleteHoatDongByidHoatDong(@PathVariable("idHoatDon") Long idHoatDong){
        hoatDongService.deleteHoatDongByIdHoatDong(idHoatDong);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
