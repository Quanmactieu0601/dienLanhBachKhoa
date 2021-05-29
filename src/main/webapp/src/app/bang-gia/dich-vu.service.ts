import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {DichVu} from "./dich-vu";
import {environment} from "../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class DichVuService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private  http :HttpClient) { }

  public getDichVus() : Observable<DichVu[]>{
    return this.http.get<DichVu[]>(`${this.apiServerUrl}/dichVu/all`);

  }
  public getDichVuByTheLoai(theLoai:String) : Observable<DichVu[]> {
    return this.http.get<DichVu[]>(`${this.apiServerUrl}/dichVu/find/theLoai/${theLoai}`);
  }
}
