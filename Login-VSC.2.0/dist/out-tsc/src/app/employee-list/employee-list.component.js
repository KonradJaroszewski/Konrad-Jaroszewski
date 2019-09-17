import * as tslib_1 from "tslib";
import { Component } from "@angular/core";
let EmployeeListComponent = class EmployeeListComponent {
    constructor(employeeService) {
        this.employeeService = employeeService;
    }
    ngOnInit() {
        this.reloadData();
    }
    reloadData() {
        this.employees = this.employeeService.getEmployeeList();
    }
    deleteEmployee(id) {
        this.employeeService.deleteEmployee(id)
            .subscribe(data => {
            console.log(data);
            this.reloadData();
        }, error => console.log(error));
    }
};
EmployeeListComponent = tslib_1.__decorate([
    Component({
        selector: "app-employee-list",
        templateUrl: "./employee-list.component.html",
        styleUrls: ["./employee-list.component.css"]
    })
], EmployeeListComponent);
export { EmployeeListComponent };
//# sourceMappingURL=employee-list.component.js.map