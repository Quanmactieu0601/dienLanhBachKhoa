package com.company.dienLanhBachKhoa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SanPhamDaBan {
    @Id
    @GeneratedValue
    @Column(nullable = false,updatable = false)
    private Long id;
    private String idHoaDon;
    private String idSanPham;
    private int soLuong;
    private Long thanhTien;

    public SanPhamDaBan(){}

    public SanPhamDaBan(String idHoaDon, String idSanPham, int soLuong, Long thanhTien) {
        this.idHoaDon = idHoaDon;
        this.idSanPham = idSanPham;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(String idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Long getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Long thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String toString(){
        return "SanPhamDaBan{" +
                "id='" + id + '\'' +
                "idHoaDon='" + idHoaDon + '\''+
                "idSanPham='" + idSanPham + '\'' +
                "soLuong='" + soLuong + '\'' +
                "thanhTien='" + thanhTien + '\''+
                '}';
    }
}
