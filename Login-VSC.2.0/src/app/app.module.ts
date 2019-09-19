import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import {AppRoutingModule, routingComponents} from './app-routing.module';
import {HttpClientModule} from '@angular/common/http'
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';

import { FooterComponent } from './footer/footer.component';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { UserPageComponent } from './user-page/user-page.component';
import { OffersComponent } from './offers/offers.component';
import { AccountComponent } from './account/account.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { EmployeeService } from './service/employee.service';
import { CommonModule } from '@angular/common';
import { FormsModule }from '@angular/forms';

const appRoutes: Routes = [
   
]

@NgModule({
  declarations: [
    
    AppComponent,
    HeaderComponent,
    routingComponents,
    FooterComponent,
    DashboardComponent,
    UserPageComponent,
    OffersComponent,
    AccountComponent,
    EmployeeListComponent
  ],
  imports: [
    FormsModule,
    CommonModule,
    HttpClientModule,
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
