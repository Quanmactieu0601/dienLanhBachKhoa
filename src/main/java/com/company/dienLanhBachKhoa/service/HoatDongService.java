package com.company.dienLanhBachKhoa.service;

import com.company.dienLanhBachKhoa.exception.HoatDongNotFoundException;
import com.company.dienLanhBachKhoa.model.HoatDong;
import com.company.dienLanhBachKhoa.repo.HoatDongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HoatDongService {
    public final HoatDongRepo hoatDongRepo;

    @Autowired
    public HoatDongService(HoatDongRepo hoatDongRepo){
        this.hoatDongRepo = hoatDongRepo;
    }

    public List<HoatDong> findAllHoatDong(){
        return hoatDongRepo.findAll();
    }

    public List<HoatDong> findHoatDongByIdHoaDon(String idHoaDon){
        return hoatDongRepo.findHoatDongByIdHoaDon(idHoaDon);
    }

    public List<HoatDong> findHoatDongByIdDichVu(String idDichvu){
        return hoatDongRepo.findHoatDongByIdDichVu(idDichvu);
    }

    public HoatDong findHoatDongByidHoatDong(Long idHoatDong){
        return hoatDongRepo.findHoatDongByIdHoatDong(idHoatDong).orElseThrow(()-> new HoatDongNotFoundException("Not Found hoatDong with id "+ idHoatDong));
    }

    public HoatDong addHoatDong(HoatDong hoatDong){
        return hoatDongRepo.save(hoatDong);
    }

    public HoatDong updateHoatDong(HoatDong hoatDong){
        return hoatDongRepo.save(hoatDong);
    }

    @Transactional
    public void deleteHoatDongByIdHoatDong(Long idHoatDong){
        hoatDongRepo.deleteByIdHoatDong(idHoatDong);
    }

}
