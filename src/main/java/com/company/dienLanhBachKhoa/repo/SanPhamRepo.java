package com.company.dienLanhBachKhoa.repo;

import com.company.dienLanhBachKhoa.model.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SanPhamRepo extends JpaRepository<SanPham,String> {
    List<SanPham> findSanPhamByCongSuat(String congSuat);

    List<SanPham> findSanPhamByLoaiMay(String loaiMay);

    List<SanPham> findSanPhamByKieuMay(String kieuMay);

    List<SanPham> findSanPhamByLoaiGas(String loaiGas);

    List<SanPham> findSanPhamByXuatXu(String xuatXu);

    Optional<SanPham> findSanPhamByIdSanPham(String idSanPham);
}
