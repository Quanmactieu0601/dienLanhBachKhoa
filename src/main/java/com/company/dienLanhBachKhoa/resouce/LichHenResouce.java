package com.company.dienLanhBachKhoa.resouce;

import com.company.dienLanhBachKhoa.model.LichHen;
import com.company.dienLanhBachKhoa.service.LichHenService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/lichHen")
public class LichHenResouce {
    private final LichHenService lichHenService;


    public LichHenResouce(LichHenService lichHenService) {
        this.lichHenService = lichHenService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<LichHen>> getAllLichHen(){
        List<LichHen> lichHens = lichHenService.findAllLichHen();
        return  new ResponseEntity<>(lichHens, HttpStatus.OK);
    }

    @GetMapping("/find/{idKhachHang}")
    public ResponseEntity<List<LichHen>> findLichHenByIdKhachHang(@PathVariable("idKhachHang") Long idKhachHang){
        List<LichHen> lichHens = lichHenService.findLichHenByIdKhachHang(idKhachHang);
        return  new ResponseEntity<>(lichHens, HttpStatus.OK);
    }

    @GetMapping("/find/{idDichVu}")
    public ResponseEntity<List<LichHen>> findLichHenByIdDichVu(@PathVariable("idKhachHang") String idDichVu){
        List<LichHen> lichHens = lichHenService.findLichHenByIdDichVu(idDichVu);
        return  new ResponseEntity<>(lichHens, HttpStatus.OK);
    }

    @GetMapping("/find/{hoanThanh}")
    public ResponseEntity<List<LichHen>> findLichHenByIdDichVu(@PathVariable("hoanThanh") boolean hoanThanh){
        List<LichHen> lichHens = lichHenService.findLichHenByHoanThanh(hoanThanh);
        return  new ResponseEntity<>(lichHens, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<LichHen> addLichHen(@RequestBody LichHen lichHen){
        LichHen newLichHen = lichHenService.addLichHen(lichHen);
        return new ResponseEntity<>(newLichHen , HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<LichHen> updateLichHen(@RequestBody LichHen lichHen){
        LichHen updateLichHen = lichHenService.addLichHen(lichHen);
        return new ResponseEntity<>(updateLichHen , HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{idLichHen}")
    public ResponseEntity<?> DeleteLichHen(@PathVariable("idLichHen") String idLichHen){
        lichHenService.deleteLichHenByIdLichHen(idLichHen);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
