package com.cpmpany.dienLanhBachKhoa.model;

import javax.persistence.*;

@Entity
public class DichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private String idDichVu;
    private String tenDichVu;
    private String donViTinh;
    private String donGia;

    public DichVu(){

    }

    public DichVu(String idDichVu, String tenDichVu, String donViTinh , String donGia){
        this.idDichVu = idDichVu;
        this.tenDichVu = tenDichVu;
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

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    public String toString(){
        return "dichVu{" +
                "idDichVu='"+ idDichVu +'\'' +
                "tenDichVu='" + tenDichVu +'\''+
                "donViTinh='" + donViTinh +'\''+
                "donGia='" + donGia +'\''+
                '}';
    }
}
