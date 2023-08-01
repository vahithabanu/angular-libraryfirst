
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LibraryuserService } from '../libraryuser.service';
@Component({
  selector: 'app-create-libraryuser',
  templateUrl: './create-libraryuser.component.html',
  styleUrls: ['./create-libraryuser.component.css']
})
export class CreateLibraryuserComponent implements OnInit {

  public userDetails ={name: '',gender: '',email: '',phno: ''}
  constructor(private restApi: LibraryuserService, public router: Router) { }
  
 

  ngOnInit(): void {
  }
  adduser(){
this.restApi.createUser(this.userDetails)
.subscribe();
this.router.navigate(['home/userlist']);
  }
}