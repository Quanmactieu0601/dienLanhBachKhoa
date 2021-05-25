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
    private Long idHoaDon;
    private Long idSanPham;
    private int soLuong;
    private Long thanhTien;

    public SanPhamDaBan(){}

    public SanPhamDaBan(Long idHoaDon, Long idSanPham, int soLuong, Long thanhTien) {
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

    public Long getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(Long idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public Long getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(Long idSanPham) {
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
