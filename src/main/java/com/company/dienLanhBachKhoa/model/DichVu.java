package com.company.dienLanhBachKhoa.model;

import javax.persistence.*;

@Entity
public class DichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private String idDichVu;
    private String tenDichVu;
    private String theLoai;
    private String donViTinh;
    private Long donGia;

    public DichVu(){

    }

    public DichVu(String idDichVu, String tenDichVu,String theLoai, String donViTinh , Long donGia){
        this.idDichVu = idDichVu;
        this.tenDichVu = tenDichVu;
        this.theLoai = theLoai;
        this.donViTinh = donViTinh;
        this.donGia = donGia;
    }

    public String getIdDichVu() {
        return idDichVu;
    }

    public void setIdDichVu(String idDichVu) {
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

    public Long getDonGia() {
        return donGia;
    }

    public void setDonGia(Long donGia) {
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
