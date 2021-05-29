import { Component, OnInit } from '@angular/core';
import {DichVuService} from "../bang-gia/dich-vu.service";
import {DichVu} from "../bang-gia/dich-vu";
import {HttpErrorResponse} from "@angular/common/http";

@Component({
  selector: 'app-dich-vu',
  templateUrl: './dich-vu.component.html',
  styleUrls: ['./dich-vu.component.css']
})
export class DichVuComponent implements OnInit {


  constructor() { }


  ngOnInit(): void {

  }

}
