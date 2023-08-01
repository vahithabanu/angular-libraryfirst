import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateLibraryuserComponent } from './create-libraryuser.component';

describe('CreateLibraryuserComponent', () => {
  let component: CreateLibraryuserComponent;
  let fixture: ComponentFixture<CreateLibraryuserComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CreateLibraryuserComponent]
    });
    fixture = TestBed.createComponent(CreateLibraryuserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
