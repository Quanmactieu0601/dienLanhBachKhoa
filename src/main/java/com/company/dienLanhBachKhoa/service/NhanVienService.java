package com.company.dienLanhBachKhoa.service;

import com.company.dienLanhBachKhoa.exception.NhanVienNotFoundException;
import com.company.dienLanhBachKhoa.model.NhanVien;
import com.company.dienLanhBachKhoa.repo.NhanVienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NhanVienService {
    public final NhanVienRepo nhanVienRepo;

    @Autowired
    public NhanVienService(NhanVienRepo nhanVienRepo) {
        this.nhanVienRepo = nhanVienRepo;
    }

    public List<NhanVien> findAllNhanVien(){
        return nhanVienRepo.findAll();
    }

    public NhanVien findNhanVienByIdNhanVien(Long idNhanVien){
        return nhanVienRepo.findNhanVienByIdNhanVien(idNhanVien).orElseThrow( () -> new NhanVienNotFoundException("Not found nhanVien with id "+idNhanVien));
    }

    public NhanVien addNhanVien(NhanVien nhanVien){
        return nhanVienRepo.save(nhanVien);
    }

    public NhanVien updateNhanVien(NhanVien nhanVien){
        return nhanVienRepo.save(nhanVien);
    }

    @Transactional
    public void deleteNhanVienByIdNhanVien(Long idNhanVien){
        nhanVienRepo.deleteNhanVienByIdNhanVien(idNhanVien);
    }



}
