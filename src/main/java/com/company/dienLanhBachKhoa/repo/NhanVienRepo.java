package com.company.dienLanhBachKhoa.repo;

import com.company.dienLanhBachKhoa.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NhanVienRepo extends JpaRepository<NhanVien,String> {
    Optional<NhanVien> findNhanVienByIdNhanVien(Long id);

    void deleteNhanVienByIdNhanVien(Long id);
}
