import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Libraryuser } from './libraryuser';

import {Observable} from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class LibraryuserService {
 private baseURL="http://localhost:8080/allusers";
 private baseURL1="http://localhost:8080/deleteUser";
 private baseURL2=  "http://localhost:8080/userById";
 private baseURL3=  "http://localhost:8080/updateUser";
 private baseURL4="http://localhost:8080/userByName";
 private baseURL5="http://localhost:8080/addusers";
  constructor(private httpClient:HttpClient) { }
  getUserList():Observable<Libraryuser[]>{
    return this.httpClient.get<Libraryuser[]>(`${this.baseURL}`)
  }
  deleteUser(userid:number):Observable<Object[]>{
     return this.httpClient.delete<Libraryuser[]>(`${this.baseURL1}/${userid}`);
  }
  getUserByid(userid:number):Observable<Libraryuser[]>{
    return this.httpClient.get<Libraryuser[]>(`${this.baseURL2}/${userid}`);
  }
  
  update(user:Libraryuser):Observable<Object>{
    return this.httpClient.put<Libraryuser[]>(`${this.baseURL3}`,user);
  }
  getUserByName(name:String):Observable<Libraryuser[]>{
    return this.httpClient.get<Libraryuser[]>(`${this.baseURL4}/${name}`);
  }
  createUser(user: any): Observable<Libraryuser[]>{
    return this.httpClient.post<Libraryuser[]>(`${this.baseURL5}`,user);
      
    
  }
  
}