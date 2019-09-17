import * as tslib_1 from "tslib";
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { LoginFormComponent } from './login-form/login-form.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { UserPageComponent } from './user-page/user-page.component';
import { OffersComponent } from './offers/offers.component';
import { AccountComponent } from './account/account.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
const routes = [
    { path: '', component: LoginFormComponent },
    { path: 'dashboard', component: DashboardComponent },
    { path: 'userPage', component: UserPageComponent },
    { path: 'Offers', component: OffersComponent },
    { path: 'accout', component: AccountComponent },
    { path: 'EmployeeList', component: EmployeeListComponent }
];
let AppRoutingModule = class AppRoutingModule {
};
AppRoutingModule = tslib_1.__decorate([
    NgModule({
        imports: [RouterModule.forRoot(routes)],
        exports: [RouterModule]
    })
], AppRoutingModule);
export { AppRoutingModule };
export const routingComponents = [LoginFormComponent];
//# sourceMappingURL=app-routing.module.js.map