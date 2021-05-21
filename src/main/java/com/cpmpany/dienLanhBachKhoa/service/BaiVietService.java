package com.cpmpany.dienLanhBachKhoa.service;

import com.cpmpany.dienLanhBachKhoa.exception.BaiVietNotFoundException;
import com.cpmpany.dienLanhBachKhoa.model.BaiViet;
import com.cpmpany.dienLanhBachKhoa.repo.BaiVietRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaiVietService {
    public BaiVietRepo baiVietRepo;

    @Autowired
    public BaiVietService( BaiVietRepo baiVietRepo ){
        this.baiVietRepo = baiVietRepo;
    }

    public BaiViet addBaiViet(BaiViet baiViet){
        return baiVietRepo.save(baiViet);
    }

    public List<BaiViet> findAllBaiViet(){
        return baiVietRepo.findAll();
    }

    public BaiViet findBaiVietByIdBaiViet(String idBaiViet){
        return baiVietRepo.findBaiVietByIdBaiViet(idBaiViet).orElseThrow(() -> new BaiVietNotFoundException("Bài viết không tồn tại"));
    }
    public List<BaiViet> findBaiVietByTheLoai(String theLoai){
        return baiVietRepo.findBaiVietByTheLoai(theLoai);
    }

    public BaiViet updateBaiViet(BaiViet baiViet){
        return baiVietRepo.save(baiViet);
    }

    public void deleteBaiViet(String idBaiViet){
        baiVietRepo.deleteBaiVietByIdBaiViet(idBaiViet);
    }
}
