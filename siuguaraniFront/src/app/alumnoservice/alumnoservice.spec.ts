import { TestBed } from '@angular/core/testing';

import { Alumnoservice } from './alumnoservice';

describe('Alumnoservice', () => {
  let service: Alumnoservice;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Alumnoservice);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
