import { Observable  } from "rxjs";
import { CommonModule } from '@angular/common';
import { Employee } from "./../employee";
import { Component, OnInit } from "@angular/core";
import { EmployeeService } from '../service/employee.service';


@Component({
  selector: "app-employee-list",
  templateUrl: "./employee-list.component.html",
  styleUrls: ["./employee-list.component.css"]
})
export class EmployeeListComponent implements OnInit {
  employees: Observable<Employee[]>;

  constructor(private employeeService: EmployeeService) {}
  Employees: any =[];
  ngOnInit() {
    this.reloadData();
   
  }

 
  deleteEmployee(id: number) {
    this.employeeService.deleteEmployee(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }
   reloadData() {
    this.employees = this.employeeService.getEmployeeList()
    
  }

}
