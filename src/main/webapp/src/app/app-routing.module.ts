import { NgModule } from '@angular/core';
import {RouterModule, ROUTES, Routes} from '@angular/router';
import {TrangChuComponent} from "./trang-chu/trang-chu.component";
import {GioiThieuComponent} from "./gioi-thieu/gioi-thieu.component";
import {DanhSachSanPhamComponent} from "./danh-sach-san-pham/danh-sach-san-pham.component";
import {BangGiaComponent} from "./bang-gia/bang-gia.component";
import {NhanVienKyThuatComponent} from "./nhan-vien-ky-thuat/nhan-vien-ky-thuat.component";
import {LichHenComponent} from "./lich-hen/lich-hen.component";
import {LienHeComponent} from "./lien-he/lien-he.component";
import {ChiTietSanPhamComponent} from "./chi-tiet-san-pham/chi-tiet-san-pham.component";
import {ChiTietBaiVietComponent} from "./chi-tiet-bai-viet/chi-tiet-bai-viet.component";
import {LenLichHenComponent} from "./len-lich-hen/len-lich-hen.component";
import {DichVuComponent} from "./dich-vu/dich-vu.component";




const routes: Routes = [
  {path : '',  component : TrangChuComponent},
  {path : 'trang-chu',  component : TrangChuComponent},
  {path : 'gioi-thieu',  component : GioiThieuComponent},
  {path : 'san-pham',  component : DanhSachSanPhamComponent},
  {path : 'dich-vu',  component : DichVuComponent},
  {path : 'bang-gia',  component : BangGiaComponent},
  {path : 'nhan-vien-ky-thuat',  component : NhanVienKyThuatComponent},
  {path : 'lich-hen',  component : LichHenComponent},
  {path : 'chi-tiet-san-pham',  component : ChiTietSanPhamComponent},
  {path : 'chi-tiet-bai-viet',  component : ChiTietBaiVietComponent},
  {path : 'len-lich-hen',  component : LenLichHenComponent},
  {path : 'lien-he',  component : LienHeComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
