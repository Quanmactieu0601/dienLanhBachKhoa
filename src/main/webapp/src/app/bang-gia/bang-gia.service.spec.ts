import { TestBed } from '@angular/core/testing';

import { BangGiaService } from './bang-gia.service';

describe('BangGiaService', () => {
  let service: BangGiaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BangGiaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
