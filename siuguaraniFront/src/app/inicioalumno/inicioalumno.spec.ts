import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Inicioalumno } from './inicioalumno';

describe('Inicioalumno', () => {
  let component: Inicioalumno;
  let fixture: ComponentFixture<Inicioalumno>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Inicioalumno]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Inicioalumno);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
