import { Component, OnInit ,OnDestroy} from '@angular/core';
import { NavbarService } from '../services/navbar.service';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit ,OnDestroy{

  showNavbar:boolean=true;
   subscription:Subscription;
  constructor(private navbarService:NavbarService) {
    
    this.subscription=this.navbarService.showNavbar.subscribe((value)=>{
    this.showNavbar=value;
    this.showNavbar=true;
    });
   }
   ngOnDestroy():void{
    this.subscription.unsubscribe();
   }

   
  ngOnInit(): void {
    console.log(this.showNavbar);
    this.navbarService.hide();
  }

}



