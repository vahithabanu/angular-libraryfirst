import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Book} from './book';
@Injectable({
  providedIn: 'root'
})
export class BookService {
 private baseURL="http://localhost:8080/book/allbooks";
 private baseURL1="http://localhost:8080/book/createbook";
 private baseURL2="http://localhost:8080/book/updatebook";
 private baseURL3="http://localhost:8080/book/deletebook";
  constructor(private httpClient:HttpClient) { }

  getBookList():Observable<Book[]>{
    return this.httpClient.get<Book[]>(`${this.baseURL}`)
  }
  addBook(book:Book):Observable<Object>{
    return this.httpClient.post(`${this.baseURL1}`,book);
  }
  updateBook(book:Book):Observable<Object>{
    console.log(book);
    return this.httpClient.put(`${this.baseURL2}`,book);
  }
  deleteBook(id:number):Observable<Object>{
    return this.httpClient.delete(`${this.baseURL3}/${id}`);
  }
}
