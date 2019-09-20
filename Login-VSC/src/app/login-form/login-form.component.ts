import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
  import { from } from 'rxjs';
import { AuthenticateService } from '../authenticate.service';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {
  username=''
  password=''
  invalidLogin=false

  constructor(private router:Router, private loginservice:AuthenticateService) {
    
   } //logowanie zabezpieczenie przed pustymi polami//
   

  ngOnInit() {

  }
  checkLogin(){
    (this.loginservice.authenticate(this.username,this.password).subscribe(
      data=>{
        this.router.navigate([''])
        this.invalidLogin=false
      },
      error=>{
this.invalidLogin=true
      }
      
    )
    );
  }
 }
    
  
  
  

