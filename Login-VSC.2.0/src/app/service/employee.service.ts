import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})

export class EmployeeService {
  private employeeUrl:string;
private baseUrl='http://localhost:8082/employee';
  constructor(private http: HttpClient) { 

  }

  getEmployee(id:number): Observable<Object>{
    return this.http.get(`${this.baseUrl}/${id}`);
  }
  createEmployee(employee:Object): Observable<Object>{
    return this.http.post(`${this.baseUrl}`+`/create`,employee);
  }
  updateEmployee(id:number):Observable<any>{
    return this.http.get(`${this.baseUrl}` + `/update` + `/${id}`);
  }
  deleteEmployee(id:number):Observable<any>{
    return this.http.delete(`${this.baseUrl}`+ `/delete` + `/${id}`,{ responseType:'text'});

  }
  getEmployeeList():Observable<any>{
     return this.http.get(`${this.baseUrl}`+`/all`);
     
  }
}