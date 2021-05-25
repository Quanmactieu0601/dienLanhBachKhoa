import { TestBed } from '@angular/core/testing';

import { NhanVienKyThuatService } from './nhan-vien-ky-thuat.service';

describe('NhanVienKyThuatService', () => {
  let service: NhanVienKyThuatService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NhanVienKyThuatService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
