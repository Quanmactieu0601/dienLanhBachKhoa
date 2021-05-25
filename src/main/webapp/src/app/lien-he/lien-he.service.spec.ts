import { TestBed } from '@angular/core/testing';

import { LienHeService } from './lien-he.service';

describe('LienHeService', () => {
  let service: LienHeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LienHeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
