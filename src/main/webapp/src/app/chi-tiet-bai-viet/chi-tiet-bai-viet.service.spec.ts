import { TestBed } from '@angular/core/testing';

import { ChiTietBaiVietService } from './chi-tiet-bai-viet.service';

describe('ChiTietBaiVietService', () => {
  let service: ChiTietBaiVietService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ChiTietBaiVietService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
