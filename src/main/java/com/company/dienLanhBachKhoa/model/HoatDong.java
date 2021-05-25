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
    private Long idHoaDon;
    private Long idDichVu;
    private Long soLuong;
    private Long thanhTien;

    public HoatDong(){}

    public HoatDong(Long idHoatDong, Long idHoaDon, Long idDichVu, Long soLuong) {
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

    public Long getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(Long idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public Long getIdDichVu() {
        return idDichVu;
    }

    public void setIdDichVu(Long idDichVu) {
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
