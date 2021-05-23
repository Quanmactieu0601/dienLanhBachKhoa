package com.company.dienLanhBachKhoa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SanPham {
    @Id
    @GeneratedValue
    @Column(nullable = false,updatable = false)
    private String idSanPham;
    private String tenSanPham;
    private String model;
    private String loaiMay;
    private String kieuMay;
    private String congSuat;
    private String loaiGas;
    private String xuatXu;
    private int baoHanh;
    private Long giaTien;

    public SanPham(){}

    public SanPham(String idSanPham, String tenSanPham,String model, String loaiMay, String kieuMay, String congSuat, String loaiGas, String xuatXu, int baoHanh, Long giaTien) {
        this.idSanPham = idSanPham;
        this.tenSanPham = tenSanPham;
        this.model = model;
        this.loaiMay = loaiMay;
        this.kieuMay = kieuMay;
        this.congSuat = congSuat;
        this.loaiGas = loaiGas;
        this.xuatXu = xuatXu;
        this.baoHanh = baoHanh;
        this.giaTien = giaTien;
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getLoaiMay() {
        return loaiMay;
    }

    public void setLoaiMay(String loaiMay) {
        this.loaiMay = loaiMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    public String getLoaiGas() {
        return loaiGas;
    }

    public void setLoaiGas(String loaiGas) {
        this.loaiGas = loaiGas;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public int getBaoHanh() {
        return baoHanh;
    }

    public void setBaoHanh(int baoHanh) {
        this.baoHanh = baoHanh;
    }

    public Long getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(Long giaTien) {
        this.giaTien = giaTien;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString(){
        return "SanPham{" +
                "idSanPham='" + idSanPham +'\'' +
                "tenSanPham='" + tenSanPham +'\'' +
                "model='" + model +'\''+
                "loaiMay='" + loaiMay + '\'' +
                "kieuMay='" + kieuMay +'\'' +
                "congSuat='" + congSuat +'\'' +
                "loaiGas='" + loaiGas + '\'' +
                "xuatXu='" + xuatXu + '\'' +
                "baoHanh='" + baoHanh + '\'' +
                "giaTien='" + giaTien +'\'' +
                '}';
    }
}
