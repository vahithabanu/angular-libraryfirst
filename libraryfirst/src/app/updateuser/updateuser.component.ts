import { Component, OnInit } from '@angular/core';
import { Libraryuser } from '../libraryuser';
import { LibraryuserService } from '../libraryuser.service';
import { Router,ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-updateuser',
  templateUrl: './updateuser.component.html',
  styleUrls: ['./updateuser.component.css']
})
export class UpdateuserComponent implements OnInit {

  user :Libraryuser=new Libraryuser();
  constructor(private restApi: LibraryuserService,
    private router: Router,
    private aroute: ActivatedRoute) { }
  ngOnInit(): void {
    console.log(this.user);
   this.user.id= this.aroute.snapshot.params['id'];
   console.log(this.user.id);
   
  }
  updateuser(userid:number){
   
    console.log('employee data ---' + this.user);
    this.restApi
      .update(this.user)
      .subscribe(); 
      this.router.navigate(['home/userlist']);
   }
 
  
   }


