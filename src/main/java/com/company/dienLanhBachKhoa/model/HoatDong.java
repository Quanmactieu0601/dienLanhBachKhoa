package com.company.dienLanhBachKhoa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class HoatDong {
    @Id
    @GeneratedValue
    @Column(nullable = false,updatable = false)
    private Long idHoatDong;
    private String idHoaDon;
    private String idDichVu;
    private Long soLuong;
    private Long thanhTien;

    public HoatDong(){}

    public HoatDong(Long idHoatDong, String idHoaDon, String idDichVu, Long soLuong) {
        this.idHoatDong = idHoatDong;
        this.idHoaDon = idHoaDon;
        this.idDichVu = idDichVu;
        this.soLuong = soLuong;
    }

    public Long getIdHoatDong() {
        return idHoatDong;
    }

    public void setIdHoatDong(Long idHoatDong) {
        this.idHoatDong = idHoatDong;
    }

    public String getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(String idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public String getIdDichVu() {
        return idDichVu;
    }

    public void setIdDichVu(String idDichVu) {
        this.idDichVu = idDichVu;
    }

    public Long getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Long soLuong) {
        this.soLuong = soLuong;
    }

    public Long getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Long thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String toString(){
        return "hoatDong{" +
                "idHoatDong='" + idHoatDong +'\'' +
                "idHoaDon='" + idHoaDon + '\'' +
                "idDichVu='" + idDichVu + '\''+
                "soLuong='" + soLuong + '\'' +
                "thanhTien='" + thanhTien + '\'' +
                '}';
    }
}
