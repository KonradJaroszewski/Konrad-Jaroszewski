import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {
  

  constructor(private router:Router ) {
    
   } //logowanie zabezpieczenie przed pustymi polami//
   

  ngOnInit() {

  }
  loginUser(e){//rozróżnienie na admina i uzytkownika//
    e.preventDefault();
    console.log(e);
    var username =e.target.elements[0].value;
    var password= e.target.elements[1].value;
    if(username==""||password=="")
    {
return;

    }
     else if(username=='admin'&& password=='admin'){
     this.router.navigate(['/dashboard']);
    }
   else{
     this.router.navigate(['/userPage']);
   }
  }

 }
    
  
  
  

