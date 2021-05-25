import { TestBed } from '@angular/core/testing';

import { GioiThieuService } from './gioi-thieu.service';

describe('GioiThieuService', () => {
  let service: GioiThieuService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GioiThieuService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
