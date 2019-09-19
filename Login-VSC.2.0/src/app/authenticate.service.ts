import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders}from '@angular/common/http';
import { map } from 'rxjs/operators';
import { from } from 'rxjs';
export class Employee{
  constructor(
    public status:string,
  ){}
}
@Injectable({
  providedIn: 'root'
})
export class AuthenticateService {

  constructor(
    private httpClient:HttpClient
  ) { }
  authenticate(username,password){
    console.log(username);
    console.log(password);
    const headers=new HttpHeaders({Authorization:'Basic'+ btoa(username + ':' + password)});
 return this.httpClient.get<Employee>('http:localhost:8082/employee') 
  
  }
}
