import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {SanPham} from "../model/sanPham";
import {environment} from "../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class DanhSachSanPhamService {

  private  apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getSanPhams() : Observable<SanPham[]> {
    return this.http.get<SanPham[]>(`${this.apiServerUrl}/sanPham/all`)
  }
}
