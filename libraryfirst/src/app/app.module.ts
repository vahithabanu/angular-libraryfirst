import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';


import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { BookListComponent } from './book-list/book-list.component';
import { CreateBookComponent } from './create-book/create-book.component';
import { CreateLibraryuserComponent } from './create-libraryuser/create-libraryuser.component';
import { LibraryuserListComponent } from './libraryuser-list/libraryuser-list.component';
import { RegisterComponent } from './register/register.component';
import { SearchuserComponent } from './searchuser/searchuser.component';

import { UpdateBookComponent } from './update-book/update-book.component';
import { UpdateuserComponent } from './updateuser/updateuser.component';
import { UserComponent } from './user/user.component';
import { SearchbookComponent } from './searchbook/searchbook.component';
import { UserrecordComponent } from './userrecord/userrecord.component';
import { CreatebookissueComponent } from './createbookissue/createbookissue.component';
import { CreatebookreturnComponent } from './createbookreturn/createbookreturn.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,

   BookListComponent,
   CreateBookComponent,
   CreateLibraryuserComponent,
   LibraryuserListComponent,
   RegisterComponent,
   SearchuserComponent,
   
   UpdateBookComponent,
   UpdateuserComponent,
   UserComponent,
   SearchbookComponent,
   UserrecordComponent,
   CreatebookissueComponent,
   CreatebookreturnComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
