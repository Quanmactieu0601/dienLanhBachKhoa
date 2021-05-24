import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TrangChuComponent } from './trang-chu/trang-chu.component';
import {NgbCarouselModule} from "@ng-bootstrap/ng-bootstrap";
import {FormsModule} from "@angular/forms";
import { NgImageSliderModule } from 'ng-image-slider';

@NgModule({
  declarations: [
    AppComponent,
    TrangChuComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        NgbCarouselModule,
        FormsModule,
        NgImageSliderModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
