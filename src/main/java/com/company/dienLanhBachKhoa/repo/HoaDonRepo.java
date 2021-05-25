package com.company.dienLanhBachKhoa.repo;

import com.company.dienLanhBachKhoa.model.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface HoaDonRepo extends JpaRepository<HoaDon,String> {
    List<HoaDon> findHoaDonByIdKhachHang(Long idKhachHang);

    List<HoaDon> findHoaDonByIdNhanVien(Long idNhanVien);

    List<HoaDon> findHoaDonByNgayLap(String ngayLap);

    Optional<HoaDon> findHoaDonByIdHoaDon(Long idHoaDon);

    List<HoaDon> findHoaDonByBiHuy(Boolean biHuy);


}
