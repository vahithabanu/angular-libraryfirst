import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BookService } from '../book.service';

@Component({
  selector: 'app-searchbook',
  templateUrl: './searchbook.component.html',
  styleUrls: ['./searchbook.component.css']
})
export class SearchbookComponent implements OnInit {

  public book =[] as any;
  public title : any = this.aroute.snapshot.params['title']
    constructor(private bservice: BookService, private router: Router,private aroute: ActivatedRoute) { }

    ngOnInit(): void {
      
    }
  /*ngOnInit(): void {
    this.bservice.searchBook(this.title).subscribe((data)=> {this.book=data; })

}*/
}