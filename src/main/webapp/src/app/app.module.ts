import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TrangChuComponent } from './trang-chu/trang-chu.component';
import {NgbCarouselModule} from "@ng-bootstrap/ng-bootstrap";
import {FormsModule} from "@angular/forms";
import { NgImageSliderModule } from 'ng-image-slider';
import { GioiThieuComponent } from './gioi-thieu/gioi-thieu.component';
import { NhanVienKyThuatComponent } from './nhan-vien-ky-thuat/nhan-vien-ky-thuat.component';
import { DichVuComponent } from './dich-vu/dich-vu.component';
import { BangGiaComponent } from './bang-gia/bang-gia.component';
import { LenLichHenComponent } from './len-lich-hen/len-lich-hen.component';
import { LienHeComponent } from './lien-he/lien-he.component';
import { ChiTietBaiVietComponent } from './chi-tiet-bai-viet/chi-tiet-bai-viet.component';

import { ChiTietSanPhamComponent } from './chi-tiet-san-pham/chi-tiet-san-pham.component';
import { DanhSachSanPhamComponent } from './danh-sach-san-pham/danh-sach-san-pham.component';
import { LichHenComponent } from './lich-hen/lich-hen.component';
import {DanhSachSanPhamService} from "./danh-sach-san-pham/danh-sach-san-pham.service";
import {HttpClient, HttpClientModule} from "@angular/common/http";

@NgModule({
  declarations: [
    AppComponent,
    TrangChuComponent,
    GioiThieuComponent,
    NhanVienKyThuatComponent,
    DichVuComponent,
    BangGiaComponent,
    LenLichHenComponent,
    LienHeComponent,
    ChiTietBaiVietComponent,

    ChiTietSanPhamComponent,
    DanhSachSanPhamComponent,
    LichHenComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        NgbCarouselModule,
        FormsModule,
        NgImageSliderModule,
        HttpClientModule
    ],
  providers: [DanhSachSanPhamService],
  bootstrap: [AppComponent]
})
export class AppModule { }
