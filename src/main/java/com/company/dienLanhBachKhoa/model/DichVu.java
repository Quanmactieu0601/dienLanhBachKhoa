package com.company.dienLanhBachKhoa.model;

import javax.persistence.*;

@Entity
public class DichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long idDichVu;
    private String tenDichVu;
    private String theLoai;
    private String donViTinh;
    private String donGia;

    public DichVu(){

    }

    public DichVu(Long idDichVu, String tenDichVu,String theLoai, String donViTinh , String donGia){
        this.idDichVu = idDichVu;
        this.tenDichVu = tenDichVu;
        this.theLoai = theLoai;
        this.donViTinh = donViTinh;
        this.donGia = donGia;
    }

    public Long getIdDichVu() {
        return idDichVu;
    }

    public void setIdDichVu(Long idDichVu) {
        this.idDichVu = idDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String toString(){
        return "dichVu{" +
                "idDichVu='"+ idDichVu +'\'' +
                "tenDichVu='" + tenDichVu +'\''+
                "theLoai='" +theLoai +'\''+
                "donViTinh='" + donViTinh +'\''+
                "donGia='" + donGia +'\''+
                '}';
    }
}
