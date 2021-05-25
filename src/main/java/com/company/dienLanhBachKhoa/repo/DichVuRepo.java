package com.company.dienLanhBachKhoa.repo;

import com.company.dienLanhBachKhoa.model.DichVu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DichVuRepo extends JpaRepository< DichVu, String> {
    List<DichVu> findDichVuByTheLoai(String theLoai);


    Optional<DichVu> findDichVuByIdDichVu(Long idDichVu);
}
