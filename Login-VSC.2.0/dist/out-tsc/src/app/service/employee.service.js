import * as tslib_1 from "tslib";
import { Injectable } from '@angular/core';
let EmployeeService = class EmployeeService {
    constructor(http) {
        this.http = http;
        this.baseUrl = '/employees';
    }
    getEmployee(id) {
        return this.http.get(`${this.baseUrl}/${id}`);
    }
    createEmployee(employee) {
        return this.http.post(`${this.baseUrl}`, employee);
    }
    updateEmployee(id) {
        return this.http.get(`${this.baseUrl}`);
    }
    deleteEmployee(id) {
        return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
    }
    getEmployeeList() {
        return this.http.get(`${this.baseUrl}`);
    }
};
EmployeeService = tslib_1.__decorate([
    Injectable({
        providedIn: 'root'
    })
], EmployeeService);
export { EmployeeService };
//# sourceMappingURL=employee.service.js.map