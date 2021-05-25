package com.company.dienLanhBachKhoa.service;



import com.company.dienLanhBachKhoa.model.SanPhamDaBan;
import com.company.dienLanhBachKhoa.repo.SanPhamDaBanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamDaBanService {
    public final SanPhamDaBanRepo sanPhamDaBanRepo;

    @Autowired
    public SanPhamDaBanService(SanPhamDaBanRepo sanPhamDaBanRepo) {
        this.sanPhamDaBanRepo = sanPhamDaBanRepo;
    }

    public List<SanPhamDaBan> findAllSanPhamDaBan(){
        return sanPhamDaBanRepo.findAll();
    }

    public List<SanPhamDaBan> findSanPhamDaBanByIdHoaDon(Long idHoaDon){
        return sanPhamDaBanRepo.findSanPhamDaBanByIdHoaDon(idHoaDon);
    }

    public SanPhamDaBan addSanPhamDaBan(SanPhamDaBan sanPhamDaBan){
        return sanPhamDaBanRepo.save(sanPhamDaBan);
    }
}
