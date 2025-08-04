import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Mismaterias } from './mismaterias';

describe('Mismaterias', () => {
  let component: Mismaterias;
  let fixture: ComponentFixture<Mismaterias>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Mismaterias]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Mismaterias);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
