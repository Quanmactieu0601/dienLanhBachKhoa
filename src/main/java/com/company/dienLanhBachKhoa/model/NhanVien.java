package com.company.dienLanhBachKhoa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class NhanVien {
    @Id
    @GeneratedValue
    @Column(nullable = false,updatable = false)
    private Long idNhanVien;
    private String tenNhanVien;
    private String ngaySinh;
    private boolean gioiTinh;
    private Long kinhNghiem;
    private String soThich;


    public NhanVien(){

    }

    public NhanVien(Long idNhanVien, String tenNhanVien, String ngaySinh, boolean gioiTinh, Long kinhNghiem, String soThich){
        this.idNhanVien = idNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.kinhNghiem = kinhNghiem;
        this.soThich = soThich;
    }

    public Long getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(Long idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Long getKinhNghiem() {
        return kinhNghiem;
    }

    public void setKinhNghiem(Long kinhNghiem) {
        this.kinhNghiem = kinhNghiem;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    public String toString(){
        return "nhanVien{" +
                "idNhanVien='" + idNhanVien + '\'' +
                "tenNhanVien='" + tenNhanVien +'\''+
                "ngaySinh='" +ngaySinh + '\''+
                "gioiTinh='" + gioiTinh + '\''+
                "kinhNghiem='" + kinhNghiem +'\'' +
                "soThich='" + soThich + '\'' +
                '}';

    }
}

