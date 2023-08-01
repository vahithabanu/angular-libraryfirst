import { Component, OnInit ,OnDestroy} from '@angular/core';
import {FormGroup,FormBuilder} from "@angular/forms";
import {HttpClient} from '@angular/common/http';
import { Router } from '@angular/router';
import { NavbarService } from '../services/navbar.service';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit ,OnDestroy{

  public registerForm !:FormGroup;
  constructor(private formBuilder:FormBuilder,private http:HttpClient,private router:Router,private navbarService:NavbarService) { }


  ngOnInit(): void {
    this.navbarService.hide();

    this.registerForm=this.formBuilder.group({
      fullname:[''],
      email:[''],
      password:[''],
      mobile:['']

    })
  }
  ngOnDestroy():void{
    this.navbarService.display();
  }
  signUp(){
    this.http.post<any>("http://localhost:3000/SignUpAdmin",this.registerForm.value)
    .subscribe(res=>{
      alert("SignUp Successfull");
      this.registerForm.reset();
      this.router.navigate(['login']);
    },err=>{
      alert("Something went wrong")
    });
  }

}



