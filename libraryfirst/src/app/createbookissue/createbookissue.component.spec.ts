import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreatebookissueComponent } from './createbookissue.component';

describe('CreatebookissueComponent', () => {
  let component: CreatebookissueComponent;
  let fixture: ComponentFixture<CreatebookissueComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CreatebookissueComponent]
    });
    fixture = TestBed.createComponent(CreatebookissueComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
