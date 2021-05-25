package com.company.dienLanhBachKhoa.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
public class BaiViet {

    @Id
    @Autowired
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long idBaiViet;
    private String theLoai;
    private String tieuDe;
    private String tomTat;
    private String noiDungUrl;



    public BaiViet(){}

    public BaiViet( Long idBaiviet,String tieuDe,String tomTat,String noiDungUrl){
        this.idBaiViet=idBaiviet;
        this.tieuDe = tieuDe;
        this.tomTat = tomTat;
        this.noiDungUrl = noiDungUrl;
    }

    public Long getIdBaiviet() {
        return idBaiViet;
    }

    public void setIdBaiviet(Long idBaiviet) {
        this.idBaiViet = idBaiviet;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTomTat() {
        return tomTat;
    }

    public void setTomTat(String tomTat) {
        this.tomTat = tomTat;
    }

    public String getNoiDungUrl() {
        return noiDungUrl;
    }

    public void setNoiDungUrl(String noiDungUrl) {
        this.noiDungUrl = noiDungUrl;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String toString(){
        return "baiViet{" +
                "maBaiViet='" + idBaiViet + '\''+
                "theLoai='" + theLoai +'\''+
                "tieuDe='"+ tieuDe + '\'' +
                "tomTat='" + tomTat +'\'' +
                "noiDungUrl='" + noiDungUrl +'\''+
                '}';
    }
}
