import { TestBed } from '@angular/core/testing';

import { ChiTietSanPhamService } from './chi-tiet-san-pham.service';

describe('ChiTietSanPhamService', () => {
  let service: ChiTietSanPhamService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ChiTietSanPhamService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
