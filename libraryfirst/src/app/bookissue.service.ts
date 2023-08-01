import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IssueBook } from './issue-book';

@Injectable({
  providedIn: 'root'
})
export class BookissueService {
 

  private restUrl :string='http://localhost:8080';
  constructor(private http: HttpClient) { }
  httpOptions={
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
    }),
}

getBookIssueFromService(): Observable<IssueBook[]>{
  return this.http.get<IssueBook[]>(this.restUrl+'/allbookissue');
}

getBookFromService(issueId:number): Observable<IssueBook[]>{
  return this.http.get<IssueBook[]>(this.restUrl+'/bookissuebyuid/${issueId}');
}


createIssue(issue: any): Observable<IssueBook>{
  
  return this.http.post<IssueBook>(
    this.restUrl + '/addbookIssue',
    JSON.stringify(issue),
    this.httpOptions
  );
}

createreturn(issue: any): Observable<IssueBook>{
  
  return this.http.put<IssueBook>(
    this.restUrl + '/updatebookReturn',
    JSON.stringify(issue),
    this.httpOptions
  );
}

deleteIssue(issueNo: number){
 return this.http.delete<IssueBook>(
   this.restUrl + '/deletebookIssue/' + issueNo,
   this.httpOptions
 );
}

}