package com.company.dienLanhBachKhoa.repo;

import com.company.dienLanhBachKhoa.model.SanPhamDaBan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SanPhamDaBanRepo extends JpaRepository<SanPhamDaBan,Long> {
    List<SanPhamDaBan> findSanPhamDaBanByIdHoaDon(String idHoaDon);
}
