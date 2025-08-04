import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Avancecarrera } from './avancecarrera';

describe('Avancecarrera', () => {
  let component: Avancecarrera;
  let fixture: ComponentFixture<Avancecarrera>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Avancecarrera]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Avancecarrera);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
