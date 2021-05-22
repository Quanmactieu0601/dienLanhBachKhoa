package com.cpmpany.dienLanhBachKhoa.repo;

import com.cpmpany.dienLanhBachKhoa.model.LichHen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LichHenRepo extends JpaRepository<LichHen,String> {


    List<LichHen> findLichHenByIdKhachHang(Long id);

    void deleteLichHenByIdLichHen(String idLichHen);

    List<LichHen> findLichHenByIdDichVu(String idDichVu);

    List<LichHen> findLichHenByHoanThanh(boolean hoanThanh);
}
