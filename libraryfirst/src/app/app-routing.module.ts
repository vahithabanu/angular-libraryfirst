import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookListComponent } from './book-list/book-list.component';
import { CreateBookComponent } from './create-book/create-book.component';
import { UpdateBookComponent } from './update-book/update-book.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { AppComponent } from './app.component';
import { Libraryuser } from './libraryuser';
import { LibraryuserListComponent } from './libraryuser-list/libraryuser-list.component';
import { UpdateuserComponent } from './updateuser/updateuser.component';
import { SearchuserComponent } from './searchuser/searchuser.component';
import { UserrecordComponent } from './userrecord/userrecord.component';

import { CreateLibraryuserComponent } from './create-libraryuser/create-libraryuser.component';
import { CreatebookissueComponent } from './createbookissue/createbookissue.component';
import { CreatebookreturnComponent } from './createbookreturn/createbookreturn.component';

const routes: Routes = [
  {
    path:'home',component:HomeComponent,
    children: [

      {
          path: "home/books",
         
          component: BookListComponent
      }]

    
  },
  {
    path:'home/books',component:BookListComponent
  },{
    path:'',redirectTo:'login',pathMatch:'full'
  },{
    path:'home/create-book',component:CreateBookComponent
  }
  ,{
    path:'update-book/:id',component:UpdateBookComponent
  }
  ,
  {
    path:'login',component:LoginComponent
  }
  ,{
    path:'register',component:RegisterComponent
  },
  {
    path:'home/userlist',component:LibraryuserListComponent
  },{
    path:'home/updateuser/:id',component:UpdateuserComponent
  },
  {
    path: 'searchuser/:name',component:SearchuserComponent
},{
  path:'userrecord',component:UserrecordComponent
},{
  path:'createissue',component:CreatebookissueComponent
},{
  path:'returnbook',component:CreatebookreturnComponent
},{
  path:'home/create-libraryuser',component:CreateLibraryuserComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }