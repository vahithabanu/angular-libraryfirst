import { Component, OnInit,OnDestroy } from '@angular/core';
import { Book } from '../book';
import { BookService } from '../book.service';
import { Router } from '@angular/router';
import { NavbarService } from '../services/navbar.service';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-create-book',
  templateUrl: './create-book.component.html',
  styleUrls: ['./create-book.component.css']
})
export class CreateBookComponent implements OnInit,OnDestroy {
  showNavbar:boolean=true;
   subscription:Subscription;
  book:Book=new Book();
  myimage:string="assets/myimg/libimg.jpg";

  constructor(private bookService:BookService,private router:Router,private navbarService:NavbarService) { 

    this.subscription=this.navbarService.showNavbar.subscribe((value)=>{
      this.showNavbar=value;
      this.showNavbar=true;
      }
    );
  }
  ngOnDestroy():void{
    this.subscription.unsubscribe();
   }

   
  ngOnInit(): void {
    console.log(this.showNavbar);
    this.navbarService.hide();
  }
 
  addbook(){
       this.bookService.addBook(this.book).subscribe(data=>{
        console.log(data);
        this.goToBookList();
       },
       error=>console.log(error));
  }
  goToBookList(){
      this.router.navigate(['home/books']);
  }
  onSubmit(){
    console.log(this.book);
    this.addbook();
  }
}



