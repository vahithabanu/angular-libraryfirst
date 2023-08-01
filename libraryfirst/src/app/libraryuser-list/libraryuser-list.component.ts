
import { Component, OnInit } from '@angular/core';
import { Libraryuser } from '../libraryuser';
import { LibraryuserService } from '../libraryuser.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-libraryuser-list',
  templateUrl: './libraryuser-list.component.html',
  styleUrls: ['./libraryuser-list.component.css']
})
export class LibraryuserListComponent implements OnInit {
  public user =[] as any; 
  public selectedId: number=0;
  constructor(private libraryuserService:LibraryuserService,private router:Router) { }

  

  ngOnInit(): void {
    this.getUsers();
   
  }
  private getUsers(){
    this.libraryuserService.getUserList().subscribe(data=>{
      this.user=data;
    }

    );
  }
  public update(id:Libraryuser){
    this.router.navigate(['home/updateuser']);
}
  onDelete(userid:number){
    console.log(userid);
this.libraryuserService.deleteUser(userid).subscribe(data=>{
  this.getUsers();
 
}
);

  }

}

