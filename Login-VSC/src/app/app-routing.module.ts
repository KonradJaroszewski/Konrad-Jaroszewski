import {NgModule} from'@angular/core';
import{Routes,RouterModule} from '@angular/router';
import { LoginFormComponent } from './login-form/login-form.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { UserPageComponent } from './user-page/user-page.component';
import { OffersComponent } from './offers/offers.component';
import { AccountComponent } from './account/account.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { LogoutComponent } from './logout/logout.component';
import { AuthGaurdService } from './auth-gaurd.service';
 const routes:Routes=[
     {path:'logout',component:LogoutComponent,canActivate:[AuthGaurdService]},
     {path:'' ,component:LoginFormComponent},
     {path:'dashboard',component:DashboardComponent},
     {path:'userPage',component:UserPageComponent},  //umozliwia podrozowanie miedzy stronami//
     {path:'Offers',component:OffersComponent},
     {path:'accout',component:AccountComponent},
     {path:'EmployeeList', component:EmployeeListComponent}
 ];

 @NgModule({
     imports:[RouterModule.forRoot(routes)],
     exports:[RouterModule]
 })
 export class AppRoutingModule{}
export const routingComponents=[LoginFormComponent]

