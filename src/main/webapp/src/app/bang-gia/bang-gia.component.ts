import { Component, OnInit } from '@angular/core';
import {DichVu} from "./dich-vu";
import {DichVuService} from "./dich-vu.service";
import {HttpErrorResponse} from "@angular/common/http";

@Component({
  selector: 'app-bang-gia',
  templateUrl: './bang-gia.component.html',
  styleUrls: ['./bang-gia.component.css']
})
export class BangGiaComponent implements OnInit {
  public dichVus : DichVu[];
  constructor(private dichVuService : DichVuService) { }

  public getAllDichVu() : void{
    this.dichVuService.getDichVus().subscribe(
      (respone: DichVu[]) => {
        this.dichVus = respone;
      },
      (error:HttpErrorResponse) => {
        alert(error.message);
      }

    )
  }
  ngOnInit(): void {
    this.getAllDichVu();
  }

}
