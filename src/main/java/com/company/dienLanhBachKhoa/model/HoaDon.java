package com.company.dienLanhBachKhoa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class HoaDon {
    @Id
    @GeneratedValue
    @Column(nullable = false,updatable = false)
    private String idHoaDon;
    private String idKhachHang;
    private String idNhanVien;
    private String idLichHen;
    private String ngayLap;
    private Long tongTien;
    private boolean biHuy;

    public HoaDon(){}

    public HoaDon(String idHoaDon, String idKhachHang, String idNhanVien, String idLichHen, String ngayLap, Long tongTien) {
        this.idHoaDon = idHoaDon;
        this.idKhachHang = idKhachHang;
        this.idNhanVien = idNhanVien;
        this.idLichHen = idLichHen;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
        this.biHuy = false;
    }

    public HoaDon(String idHoaDon, String idKhachHang, String idNhanVien, String idLichHen, String ngayLap, Long tongTien , boolean biHuy) {
        this.idHoaDon = idHoaDon;
        this.idKhachHang = idKhachHang;
        this.idNhanVien = idNhanVien;
        this.idLichHen = idLichHen;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
        this.biHuy = biHuy;
    }

    public String getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(String idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public String getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getIdLichHen() {
        return idLichHen;
    }

    public void setIdLichHen(String idLichHen) {
        this.idLichHen = idLichHen;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public Long getTongTien() {
        return tongTien;
    }

    public void setTongTien(Long tongTien) {
        this.tongTien = tongTien;

    }

    public boolean isBiHuy() {
        return biHuy;
    }

    public void setBiHuy(boolean biHuy) {
        this.biHuy = biHuy;
    }

    public String toString(){
        return "HoaDon{" +
                "idHoaDon='" + idHoaDon + '\'' +
                "idKhachHang='" + idKhachHang + '\''+
                "idNhanVien='" + idNhanVien + '\'' +
                "idLichHen='" + idLichHen + '\'' +
                "ngayLap='" + ngayLap + '\'' +
                "tongTien='" + tongTien + '\'' +
                "biHuy='" + biHuy + '\''+
                '}';

    }
}
