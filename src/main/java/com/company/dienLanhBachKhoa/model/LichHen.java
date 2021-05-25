package com.company.dienLanhBachKhoa.model;

import javax.persistence.*;

@Entity
public class LichHen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long idLichHen;
    private String idDichVu;
    private Long idKhachHang;
    private String fromTime;
    private String toTime;
    private String tinhTrangMay;
    @Column(nullable = false, updatable = false)
    private String idNhanVien;
    private boolean hoanThanh;
    private String idHoaDon;
    private String ghiChu;

    public LichHen(){}

    public LichHen(Long idLichHen, String idDichVu, Long idKhachHang, String fromTime, String toTime,String tinhTrangMay){
        this.idLichHen = idLichHen;
        this.idDichVu = idDichVu;
        this.idKhachHang = idKhachHang;
        this.fromTime = fromTime;
        this.toTime = toTime;
        this.tinhTrangMay = tinhTrangMay;
        this.idNhanVien = null;
        this.hoanThanh = false;
        this.idHoaDon = null;
        this.ghiChu = null;
    }
    public LichHen(Long idLichHen, String idDichVu, Long idKhachHang, String fromTime, String toTime,String tinhTrangMay, String idNhanVien){
        this.idLichHen = idLichHen;
        this.idDichVu = idDichVu;
        this.idKhachHang = idKhachHang;
        this.fromTime = fromTime;
        this.toTime = toTime;
        this.tinhTrangMay = tinhTrangMay;
        this.idNhanVien = idNhanVien;
        this.hoanThanh = false;
        this.idHoaDon = null;
        this.ghiChu = null;
    }

    public LichHen(Long idLichHen, String idDichVu, Long idKhachHang, String fromTime, String toTime,String tinhTrangMay, String idNhanVien,boolean hoanThanh,String idHoaDon, String ghiChu){
        this.idLichHen = idLichHen;
        this.idDichVu = idDichVu;
        this.idKhachHang = idKhachHang;
        this.fromTime = fromTime;
        this.toTime = toTime;
        this.tinhTrangMay = tinhTrangMay;
        this.idNhanVien = idNhanVien;
        this.hoanThanh = hoanThanh;
        this.idHoaDon = idHoaDon;
        this.ghiChu = ghiChu;
    }


    public Long getIdLichHen() {
        return idLichHen;
    }

    public void setIdLichHen(Long idLichHen) {
        this.idLichHen = idLichHen;
    }

    public String getIDDichVu() {
        return idDichVu;
    }

    public void setTenDichVu(String idDichVu) {
        this.idDichVu = idDichVu;
    }

    public Long getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(Long idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getFromTime() {
        return fromTime;
    }

    public void setFromTime(String fromTime) {
        this.fromTime = fromTime;
    }

    public String getToTime() {
        return toTime;
    }

    public void setToTime(String toTime) {
        this.toTime = toTime;
    }

    public String getTinhTrangMay() {
        return tinhTrangMay;
    }

    public void setTinhTrangMay(String tinhTrangMay) {
        this.tinhTrangMay = tinhTrangMay;
    }

    public String toString(){
        return "lichHen{" +
                "idLichHen='" + idLichHen +'\''+
                "idDichVu='" + idDichVu + '\'' +
                "idKhachHang='" + idKhachHang +'\''+
                "fromTime='" + fromTime + '\''+
                "toTime='" + toTime +'\''+
                "tinhTrangMay" + tinhTrangMay + '\''+
                '}';
    }
}
