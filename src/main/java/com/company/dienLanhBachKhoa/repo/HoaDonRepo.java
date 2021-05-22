package com.company.dienLanhBachKhoa.repo;

import com.company.dienLanhBachKhoa.model.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HoaDonRepo extends JpaRepository<HoaDon,String> {
    List<HoaDon> findHoaDonByIdKhachHang(Long idKhachHang);

    List<HoaDon> findHoaDonByIdNhanVien(String idNhanVien);

    List<HoaDon> findHoaDonByNgayLap(String ngayLap);

    HoaDon findHoaDonByIdHoaDon(String idHoaDon);

    List<HoaDon> findHoaDonByBiHuy(Boolean biHuy);


}
