import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-trang-chu',
  templateUrl: './trang-chu.component.html',
  styleUrls: ['./trang-chu.component.css']
})
export class TrangChuComponent implements OnInit {

  dichVus = [
    {name : 'Vệ sinh điều hoà' , caption : 'Dịch vụ bảo trì vệ sinh điều hoà chuyên nghiệp, uy tín hàng đầu Hà Nội' , imageUrl : './assets/static/images/bao_duong_dieu_hoa.jpg'},
    {name : 'Mua bán điều hoà' , caption : 'Dịch vụ bảo trì vệ sinh điều hoà chuyên nghiệp, uy tín hàng đầu Hà Nội' , imageUrl : './assets/static/images/lap_dieu_hoa.jpg'},
    {name : 'Tháo lắp điều hoà' , caption : 'Dịch vụ tháo lắp điều  hoà tại Hà Nội chuyên nghiệp – uy tín – giá rẻ, nhận di dời máy lạnh,..' , imageUrl : './assets/static/images/lap_dieu_hoa.jpg'}
  ]

  sanPhams = []
  constructor() { }

  ngOnInit(): void {
  }

}
