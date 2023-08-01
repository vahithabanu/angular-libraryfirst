import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import { Libraryuser } from '../libraryuser';
import { LibraryuserService } from '../libraryuser.service';

@Component({
  selector: 'app-searchuser',
  templateUrl: './searchuser.component.html',
  styleUrls: ['./searchuser.component.css']
})
export class SearchuserComponent implements OnInit {

  
  public user =[] as any;
  // user:Libraryuser=new Libraryuser();
  public name : any = this.aroute.snapshot.params['name']
    constructor(private uservice: LibraryuserService, private router: Router,private aroute: ActivatedRoute) { }

  ngOnInit(): void {
    this.uservice.getUserByName(this.name).subscribe(
      (data)=> {
        this.user=data; });


  }

}

