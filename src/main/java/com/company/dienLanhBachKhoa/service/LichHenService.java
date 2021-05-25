package com.company.dienLanhBachKhoa.service;


import com.company.dienLanhBachKhoa.exception.LichHenNotFoundException;
import com.company.dienLanhBachKhoa.exception.UserNotfoundException;
import com.company.dienLanhBachKhoa.model.LichHen;
import com.company.dienLanhBachKhoa.repo.LichHenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    public List<LichHen> findLichHenByIdDichVu(Long idDichVu){
        return lichHenRepo.findLichHenByIdDichVu(idDichVu);
    }

    public List<LichHen> findLichHenByHoanThanh(boolean hoanThanh){
        return lichHenRepo.findLichHenByHoanThanh(hoanThanh);
    }

    public LichHen findLichHenByIdLichHen(Long idLichHen){
        return lichHenRepo.findLichHenByIdLichHen(idLichHen).orElseThrow(() -> new LichHenNotFoundException("Lich hen không tồn tại"));
    }


    public LichHen updateLichHen(LichHen lichHen) {
        return lichHenRepo.save(lichHen);
    }
    @Transactional
    public void deleteLichHenByIdLichHen(String idLichHen){
        lichHenRepo.deleteLichHenByIdLichHen(idLichHen);
    }
}


