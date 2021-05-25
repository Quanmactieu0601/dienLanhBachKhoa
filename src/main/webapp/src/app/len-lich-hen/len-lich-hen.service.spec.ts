import { TestBed } from '@angular/core/testing';

import { LenLichHenService } from './len-lich-hen.service';

describe('LenLichHenService', () => {
  let service: LenLichHenService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LenLichHenService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
