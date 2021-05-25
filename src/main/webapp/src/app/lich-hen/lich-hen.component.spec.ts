import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LichHenComponent } from './lich-hen.component';

describe('LichHenComponent', () => {
  let component: LichHenComponent;
  let fixture: ComponentFixture<LichHenComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LichHenComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LichHenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
