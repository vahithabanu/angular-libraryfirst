import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BookissueService } from '../bookissue.service';

@Component({
  selector: 'app-createbookreturn',
  templateUrl: './createbookreturn.component.html',
  styleUrls: ['./createbookreturn.component.css']
})
export class CreatebookreturnComponent implements OnInit {

  public bookissueDetails = { issueId:'',status:'',issueDate:'',returnWithinDate:'', actualReturnedDate:'', book:{bookId:''},libuser:{id:''}}
  constructor(private restApi: BookissueService,public router: Router) { }

  ngOnInit(): void {
  }

  addreturn(){
    console.log("---");
    console.log(this.bookissueDetails);
    this.restApi.createreturn(this.bookissueDetails)
    .subscribe();
    this.router.navigate(['/userrecord']);
      }
}
