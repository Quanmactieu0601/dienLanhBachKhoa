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
    private Long idHoaDon;
    private Long idKhachHang;
    private Long idNhanVien;
    private Long idLichHen;
    private String ngayLap;
    private Long tongTien;
    private boolean biHuy;

    public HoaDon(){}

    public HoaDon(Long idHoaDon, Long idKhachHang, Long idNhanVien, Long idLichHen, String ngayLap, Long tongTien) {
        this.idHoaDon = idHoaDon;
        this.idKhachHang = idKhachHang;
        this.idNhanVien = idNhanVien;
        this.idLichHen = idLichHen;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
        this.biHuy = false;
    }

    public HoaDon(Long idHoaDon, Long idKhachHang, Long idNhanVien, Long idLichHen, String ngayLap, Long tongTien , boolean biHuy) {
        this.idHoaDon = idHoaDon;
        this.idKhachHang = idKhachHang;
        this.idNhanVien = idNhanVien;
        this.idLichHen = idLichHen;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
        this.biHuy = biHuy;
    }

    public Long getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(Long idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public Long getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(Long idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public Long getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(Long idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public Long getIdLichHen() {
        return idLichHen;
    }

    public void setIdLichHen(Long idLichHen) {
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
