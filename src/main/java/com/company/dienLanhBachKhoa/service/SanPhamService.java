package com.company.dienLanhBachKhoa.service;

import com.company.dienLanhBachKhoa.exception.SanPhamNotFoundException;
import com.company.dienLanhBachKhoa.model.SanPham;
import com.company.dienLanhBachKhoa.repo.SanPhamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamService {
    public final SanPhamRepo sanPhamRepo;
    @Autowired
    public SanPhamService(SanPhamRepo sanPhamRepo) {
        this.sanPhamRepo = sanPhamRepo;
    }

    public List<SanPham> findAllSanPham(){
        return sanPhamRepo.findAll();
    }

    public List<SanPham> findSanPhamByCongSuat(String congSuat){
        return sanPhamRepo.findSanPhamByCongSuat(congSuat);
    }

    public List<SanPham> findSanPhamByLoaiMay(String loaiMay){
        return sanPhamRepo.findSanPhamByLoaiMay(loaiMay);
    }

    public List<SanPham> findSanPhamByKieuMay(String kieuMay){
        return sanPhamRepo.findSanPhamByKieuMay(kieuMay);
    }
    public List<SanPham> findSanPhamByLoaiGas(String loaiGas){
        return sanPhamRepo.findSanPhamByLoaiGas(loaiGas);
    }
    public List<SanPham> findSanPhamByXuatXu(String xuatXu){
        return sanPhamRepo.findSanPhamByXuatXu(xuatXu);
    }
    public SanPham findSanPhamByIdSanPham(String idSanPham){
        return sanPhamRepo.findSanPhamByIdSanPham(idSanPham).orElseThrow(()-> new SanPhamNotFoundException("Khong tim thay san pham"));
    }

    public SanPham addSanPham(SanPham sanPham){
        return sanPhamRepo.save(sanPham);
    }
}
