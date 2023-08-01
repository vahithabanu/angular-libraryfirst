import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BookissueService } from '../bookissue.service';

@Component({
  selector: 'app-createbookissue',
  templateUrl: './createbookissue.component.html',
  styleUrls: ['./createbookissue.component.css']
})
export class CreatebookissueComponent implements OnInit {

  public bookissueDetails = { issueNo:'',status:'',issueDate:'',returnWithinDate:'', actualReturnedDate:'', book:{bookId:''},libuser:{id:''}}
  constructor(private restApi: BookissueService,public router: Router) { }

  ngOnInit(): void {
  }

  addissue(){
    this.restApi.createIssue(this.bookissueDetails)
    .subscribe();
    this.router.navigate(['/userrecord']);
      }


  
}
