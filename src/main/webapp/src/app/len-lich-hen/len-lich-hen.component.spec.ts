import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LenLichHenComponent } from './len-lich-hen.component';

describe('LenLichHenComponent', () => {
  let component: LenLichHenComponent;
  let fixture: ComponentFixture<LenLichHenComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LenLichHenComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LenLichHenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
