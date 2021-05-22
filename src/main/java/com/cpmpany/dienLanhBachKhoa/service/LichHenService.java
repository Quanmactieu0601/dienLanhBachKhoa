package com.cpmpany.dienLanhBachKhoa.service;


import com.cpmpany.dienLanhBachKhoa.model.LichHen;
import com.cpmpany.dienLanhBachKhoa.repo.LichHenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LichHenService {
    private final LichHenRepo lichHenRepo;

    @Autowired
    public LichHenService(LichHenRepo lichHenRepo){
        this.lichHenRepo = lichHenRepo;
    }

    public LichHen addLichHen(LichHen lichHen){
        return lichHenRepo.save(lichHen);
    }

    public List<LichHen> findAllLichHen(){
        return lichHenRepo.findAll();
    }

    public List<LichHen> findLichHenByIdKhachHang(Long id){
        return lichHenRepo.findLichHenByIdKhachHang(id);
    }

    public List<LichHen> findLichHenByIdDichVu(String idDichVu){
        return lichHenRepo.findLichHenByIdDichVu(idDichVu);
    }

    public List<LichHen> findLichHenByHoanThanh(boolean hoanThanh){
        return lichHenRepo.findLichHenByHoanThanh(hoanThanh);
    }


    public LichHen updateLichHen(LichHen lichHen) {
        return lichHenRepo.save(lichHen);
    }

    public void deleteLichHenByIdLichHen(String idLichHen){
        lichHenRepo.deleteLichHenByIdLichHen(idLichHen);
    }
}


