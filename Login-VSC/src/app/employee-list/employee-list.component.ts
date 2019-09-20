import { Observable  } from "rxjs";
import { CommonModule } from '@angular/common';
import { Employee } from "./../employee";
import { Component, OnInit, Input } from "@angular/core";
import { EmployeeService } from '../service/employee.service';


@Component({
  selector: "app-employee-list",
  templateUrl: "./employee-list.component.html",
  styleUrls: ["./employee-list.component.css"]
})
export class EmployeeListComponent implements OnInit {
  employees: Employee[];
@Input() employee:Employee;
  constructor(private employeeService: EmployeeService) {}
  Employees: any =[];
  ngOnInit() {
    this.reloadData();
   
  }

 
  deleteEmployee() {
    this.employeeService.deleteEmployee(this.employee.id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
      }
        reloadData() {
          this.employeeService.getEmployeeList().subscribe( e => {
            this.employees = e;
            
          } );
        }

}
