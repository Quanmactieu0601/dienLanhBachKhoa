package com.company.dienLanhBachKhoa.repo;

import com.company.dienLanhBachKhoa.model.HoatDong;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface HoatDongRepo extends JpaRepository<HoatDong,Long> {
    List<HoatDong> findHoatDongByIdHoaDon(Long idHoaDon);

    List<HoatDong> findHoatDongByIdDichVu(Long idDichvu);

    Optional<HoatDong> findHoatDongByIdHoatDong(Long idHoatDong);

    void deleteByIdHoatDong(Long idHoatDong);
}
