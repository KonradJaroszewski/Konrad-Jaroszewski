import { Injectable } from '@angular/core';
import {CanActivate,ActivatedRouteSnapshot,RouterStateSnapshot,Router}from '@angular/router';
import{AuthenticateService} from './authenticate.service';
@Injectable({
  providedIn: 'root'
})
export class AuthGaurdService implements CanActivate {

  constructor(private router:Router,
    private authService:AuthenticateService) { }
    canActivate(route:ActivatedRouteSnapshot,state: RouterStateSnapshot){
      if(this.authService.isUserLoggedIn(), this.authService)
      return true;
      this.router.navigate(['']);
      return false;
    }
}
