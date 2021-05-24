import {Component} from '@angular/core';
import { NgImageSliderModule } from 'ng-image-slider';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],

})
export class AppComponent {
  images = [
    {image : '../assets/static/images/daikin.png' , thumbImage: '../assets/static/images/daikin.png',  title : 'daikin'},
    {image : '../assets/static/images/funiki.png' , thumbImage: '../assets/static/images/funiki.png' , title : 'funiki'},
    {image : '../assets/static/images/LG.png' , thumbImage: '../assets/static/images/LG.png',title : 'LG'},
    {image : '../assets/static/images/media.png' , thumbImage: '../assets/static/images/media.png',title : 'media'},
    {image : '../assets/static/images/mitsubishi.png' , thumbImage:'../assets/static/images/mitsubishi.png' , title : 'mitsubishi'},
    {image : '../assets/static/images/nagakawa.png' , thumbImage:'../assets/static/images/nagakawa.png' ,title : 'nagakawa'},
    {image : '../assets/static/images/panasonic.png' ,thumbImage: '../assets/static/images/panasonic.png', title : 'panasonic'},
    {image : '../assets/static/images/samsung.png' , thumbImage:'../assets/static/images/samsung.png' ,title : 'samsung'},
    {image : '../assets/static/images/sanyo.png' , thumbImage:'../assets/static/images/sanyo.png' ,title : 'sanyo'},
    {image : '../assets/static/images/sharp.png' , thumbImage: '../assets/static/images/sharp.png',title : 'sharp'},
    {image : '../assets/static/images/toshiba.png' , thumbImage: '../assets/static/images/toshiba.png',title : 'toshiba'},
  ]

  camKets =[
    {text : 'ĐÚNG GIÁ - ĐÚNG LỖI'},
    {text : 'LẤY CHỮ TÍN LÀM ĐẦU'},
    {text : 'THAM NIÊN LÂU NĂM'},
    {text : 'LÀM VIỆC NGHIÊM TÚC'},
    {text : 'THIẾT BỊ HIỆN ĐẠI'},
    {text : 'BẢO HÀNH CHU ĐÁO'}
  ]



}
