import { Component, OnInit } from '@angular/core';
import {SanPham} from "../model/sanPham";
import {DanhSachSanPhamService} from "./danh-sach-san-pham.service";
import {HttpErrorResponse} from "@angular/common/http";

@Component({
  selector: 'app-danh-sach-san-pham',
  templateUrl: './danh-sach-san-pham.component.html',
  styleUrls: ['./danh-sach-san-pham.component.css']
})
export class DanhSachSanPhamComponent implements OnInit {

  public danhSachSanPham : SanPham[];

  constructor(private danhSachSanPhamService: DanhSachSanPhamService ) { }

  public getDanhSachSanPham(): void {
    this.danhSachSanPhamService.getSanPhams().subscribe(
      (response:SanPham[]) => {
        this.danhSachSanPham = response;
      },
      (error: HttpErrorResponse )=> {
        alert(error.message);
      }
    );
  }

  ngOnInit(): void {
    this.getDanhSachSanPham();
  }

}
