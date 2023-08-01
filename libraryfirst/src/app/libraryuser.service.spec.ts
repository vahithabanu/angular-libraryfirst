import { TestBed } from '@angular/core/testing';

import { LibraryuserService } from './libraryuser.service';

describe('LibraryuserService', () => {
  let service: LibraryuserService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LibraryuserService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
