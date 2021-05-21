package com.cpmpany.dienLanhBachKhoa.repo;

import com.cpmpany.dienLanhBachKhoa.model.BaiViet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BaiVietRepo  extends JpaRepository<BaiViet,String> {

     Optional<BaiViet> findBaiVietByIdBaiViet(String idBaiViet);

    void deleteBaiVietByIdBaiViet(String idBaiViet);

    List<BaiViet> findBaiVietByTheLoai(String theLoai);
}
