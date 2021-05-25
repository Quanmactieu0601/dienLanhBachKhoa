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
    private Long idSanPham;
    private String tenSanPham;
    private String loaiSanPham; //điều hoà , tủ lạnh , máy giặt
    private String model;
    private String loaiMay;     //Đh : treo tường, cây điều hoà, âm trần,..| máy giặt : cửa đứng , cửa ngang  | tủ lạnh: tủ trực tiếp , bình thường,
    private boolean isInverter; //    inverter(có | không)
    private String kieuMay;     //(Đh : 1 chiều , 2 chiều | còn lại null)
    private String congSuat;    //ĐH : 9000btu , 12000btu,..| MG : 7kg,10kg ,.. | tủ lạnh :(dung tích) 216 lít,..
    private String loaiGas;     //ĐH : R32, R22 , R410 | còn lại null
    private String xuatXu;
    private int baoHanh;
    private Long giaTien;

    public SanPham(){}

    public SanPham(Long idSanPham, String tenSanPham, String loaiSanPham,String model, String loaiMay, String kieuMay,boolean isInverter, String congSuat, String loaiGas, String xuatXu, int baoHanh, Long giaTien) {
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
        this.isInverter = isInverter;
        this.loaiSanPham = loaiSanPham;
    }

    public Long getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(Long idSanPham) {
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

    public String getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public boolean isInverter() {
        return isInverter;
    }

    public void setInverter(boolean inverter) {
        isInverter = inverter;
    }

    public String toString(){
        return "SanPham{" +
                "idSanPham='" + idSanPham +'\'' +
                "tenSanPham='" + tenSanPham +'\'' +
                "loaiSanPham='" + loaiSanPham + '\''+
                "model='" + model +'\''+
                "loaiMay='" + loaiMay + '\'' +
                "kieuMay='" + kieuMay +'\'' +
                "isInverter='" + isInverter + '\''+
                "congSuat='" + congSuat +'\'' +
                "loaiGas='" + loaiGas + '\'' +
                "xuatXu='" + xuatXu + '\'' +
                "baoHanh='" + baoHanh + '\'' +
                "giaTien='" + giaTien +'\'' +
                '}';
    }
}
