package com.company.dienLanhBachKhoa.service;

import com.company.dienLanhBachKhoa.exception.HoaDonNotFoundException;
import com.company.dienLanhBachKhoa.model.HoaDon;
import com.company.dienLanhBachKhoa.repo.HoaDonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoaDonService {
    public final HoaDonRepo hoaDonRepo;

    @Autowired
    public HoaDonService(HoaDonRepo hoaDonRepo) {
        this.hoaDonRepo = hoaDonRepo;
    }

    public List<HoaDon> findAllHoaDon(){
        return hoaDonRepo.findAll();
    }

    public List<HoaDon> findHoaDonByIdKhachHang(Long idKhachHang){
        return hoaDonRepo.findHoaDonByIdKhachHang(idKhachHang);
    }

    public List<HoaDon> findHoaDonByIdNhanVien(Long idNhanVien){
        return hoaDonRepo.findHoaDonByIdNhanVien(idNhanVien);
    }

    public List<HoaDon> findHoaDonByNgayLap(String ngayLap){
        return hoaDonRepo.findHoaDonByNgayLap(ngayLap);
    }

    public HoaDon findHoaDonByIdHoaDon(Long idHoaDon){
        return hoaDonRepo.findHoaDonByIdHoaDon(idHoaDon).orElseThrow(()-> new HoaDonNotFoundException("không tìm thấy hoá đơn"));
    }

    public List<HoaDon> findHoaDonByBiHuy(Boolean biHuy){
        return hoaDonRepo.findHoaDonByBiHuy(biHuy);
    }

    public HoaDon addHoaDon(HoaDon hoaDon){
        return hoaDonRepo.save(hoaDon);
    }

    public HoaDon updateHoaDon(HoaDon hoaDon){
        return hoaDonRepo.save(hoaDon);
    }

}
