import { Component, OnInit,OnDestroy } from '@angular/core';
import {FormGroup,FormBuilder} from "@angular/forms";
import {HttpClient} from '@angular/common/http';
import { Router } from '@angular/router';
import { NavbarService } from '../services/navbar.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit ,OnDestroy {
  public loginForm !:FormGroup;
  constructor(private formBuilder:FormBuilder,private http:HttpClient,private router:Router,private navbarService:NavbarService) { }

  ngOnInit(): void {
    this.navbarService.hide();
    this.loginForm=this.formBuilder.group({
      
      email:[''],
      password:['']
     

    })

    
  }
  ngOnDestroy():void{
    this.navbarService.display();
  }

  login(){
    this.http.get<any>("http://localhost:3000/SignUpAdmin")
    .subscribe(res=>{
      const user=res.find((a:any)=>{
        return a.email===this.loginForm.value.email && a.password===this.loginForm.value.password
      });
      if(user){
        alert("Login successful");
        this.loginForm.reset();
        this.router.navigate(['/home']);
      }
      else{
        alert("user not found");
      }
      
    },err=>{
      alert("Something went wrong")
    });
  }
}

