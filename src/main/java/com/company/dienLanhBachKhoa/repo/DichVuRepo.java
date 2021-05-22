package com.company.dienLanhBachKhoa.repo;

import com.company.dienLanhBachKhoa.model.DichVu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DichVuRepo extends JpaRepository< DichVu, String> {
    List<DichVu> findDichVuByTheLoai(String theLoai);



}
