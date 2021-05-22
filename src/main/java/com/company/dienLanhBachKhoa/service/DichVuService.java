package com.company.dienLanhBachKhoa.service;

import com.company.dienLanhBachKhoa.model.DichVu;
import com.company.dienLanhBachKhoa.repo.DichVuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DichVuService {
    public final DichVuRepo dichVuRepo;

    @Autowired
    public DichVuService(DichVuRepo dichVuRepo) {
        this.dichVuRepo = dichVuRepo;
    }

    public List<DichVu> findAllDichVu(){return dichVuRepo.findAll();}

    public List<DichVu> findDichVuByTheLoai(String theLoai){
        return dichVuRepo.findDichVuByTheLoai(theLoai);
    }

    public DichVu addDichVu(DichVu dichVu){
        return dichVuRepo.save(dichVu);
    }

    public DichVu updateDichVu(DichVu dichVu){
        return dichVuRepo.save(dichVu);
    }


}
