import { TestBed } from '@angular/core/testing';

import { DanhSachSanPhamService } from './danh-sach-san-pham.service';

describe('DanhSachSanPhamService', () => {
  let service: DanhSachSanPhamService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DanhSachSanPhamService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
