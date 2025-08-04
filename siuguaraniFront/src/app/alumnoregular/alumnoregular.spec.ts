import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Alumnoregular } from './alumnoregular';

describe('Alumnoregular', () => {
  let component: Alumnoregular;
  let fixture: ComponentFixture<Alumnoregular>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Alumnoregular]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Alumnoregular);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
