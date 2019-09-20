import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable  } from "rxjs";
import { Employee } from "./../employee";
import { EmployeeService } from '../service/employee.service';

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css']
})
export class AccountComponent implements OnInit {

  employee:Employee=new Employee();
  submitted=false;
  constructor(private router:Router, private employeeService: EmployeeService) { }//strona zarzadzania konetem//

  ngOnInit() {
  }
  newEmployee(): void{
    this.submitted=false;
    this.employee=new Employee();
  }
  save(){
    this.employeeService.createEmployee(this.employee)
    .subscribe(data=> console.log(data),error=>console.log(error));
    this.employee=new Employee();
  }   
  onSubmit(){
    this.submitted=true;
    this.save();
  }
    
  }
  
  

