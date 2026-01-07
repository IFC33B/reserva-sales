import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LlistaReserves } from './llista-reserves';

describe('LlistaReserves', () => {
  let component: LlistaReserves;
  let fixture: ComponentFixture<LlistaReserves>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [LlistaReserves]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LlistaReserves);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
