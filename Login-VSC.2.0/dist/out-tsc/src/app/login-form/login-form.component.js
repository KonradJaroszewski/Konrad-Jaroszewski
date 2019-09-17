import * as tslib_1 from "tslib";
import { Component } from '@angular/core';
let LoginFormComponent = class LoginFormComponent {
    constructor(router) {
        this.router = router;
    } //logowanie zabezpieczenie przed pustymi polami//
    ngOnInit() {
    }
    loginUser(e) {
        e.preventDefault();
        console.log(e);
        var username = e.target.elements[0].value;
        var password = e.target.elements[1].value;
        if (username == "" || password == "") {
            return;
        }
        else if (username == 'admin' && password == 'admin') {
            this.router.navigate(['/dashboard']);
        }
        else {
            this.router.navigate(['/userPage']);
        }
    }
};
LoginFormComponent = tslib_1.__decorate([
    Component({
        selector: 'app-login-form',
        templateUrl: './login-form.component.html',
        styleUrls: ['./login-form.component.css']
    })
], LoginFormComponent);
export { LoginFormComponent };
//# sourceMappingURL=login-form.component.js.map