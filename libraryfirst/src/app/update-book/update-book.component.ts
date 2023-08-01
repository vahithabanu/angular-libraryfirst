import { Component, OnInit } from '@angular/core';
import { Book } from '../book';
import { Router,ActivatedRoute } from '@angular/router';

import { BookService } from '../book.service';
@Component({
  selector: 'app-update-book',
  templateUrl: './update-book.component.html',
  styleUrls: ['./update-book.component.css']
})
export class UpdateBookComponent implements OnInit {
  book:Book=new Book();
  
  constructor(private bookService:BookService,private router:Router
    ,private route: ActivatedRoute) { }
  updateBook(book:Book){
    console.log(book.bookId);
    this.bookService.updateBook(book).subscribe(data=>{
      
      console.log(data);
      this.goToBookList();
     },
     error=>console.log(error));
  }
  goToBookList(){
    this.router.navigate(['/books']);
}
  ngOnInit(): void {
    this.book.bookId = this.route.snapshot.params['id'];
  }
  onSubmit(id:number){
     console.log(this.book);
     this.updateBook(this.book);
  }

}