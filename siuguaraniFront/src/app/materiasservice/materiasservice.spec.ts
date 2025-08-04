import { TestBed } from '@angular/core/testing';

import { Materiasservice } from './materiasservice';

describe('Materiasservice', () => {
  let service: Materiasservice;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Materiasservice);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
