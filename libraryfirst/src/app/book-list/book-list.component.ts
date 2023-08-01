import { Component, OnInit ,OnDestroy} from '@angular/core';
import {Book} from '../book';
import { BookService } from '../book.service';
import { UpdateBookComponent } from '../update-book/update-book.component';
import { Router } from '@angular/router';
import { NavbarService } from '../services/navbar.service';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {
  book:Book[];
  showNavbar:boolean=true;
   subscription:Subscription;
  constructor(private bookService:BookService,private router:Router,private navbarService:NavbarService) {
    this.subscription=this.navbarService.showNavbar.subscribe((value)=>{
      this.showNavbar=value;
      this.showNavbar=true;
      });
   }
   ngOnDestroy():void{
    this.subscription.unsubscribe();
   }

  ngOnInit(): void {
    this.getBooks();
    this.navbarService.display();
  }
  private getBooks(){
    this.bookService.getBookList().subscribe(data=>{
      this.book=data;
    }

    );
  }
   public updateBook(id:number){
        this.router.navigate(['/update-book',id]);
    }
  public deleteBook(id:number){
    this.bookService.deleteBook(id).subscribe(data=>{
      this.getBooks();
      console.log(data);
    }
 ); }
 
}
