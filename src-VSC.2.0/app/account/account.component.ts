import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { IfStmt } from '@angular/compiler';
@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css']
})
export class AccountComponent implements OnInit {

  constructor(private router:Router) { }//strona zarzadzania konetem//

  ngOnInit() {
  }
  AddUser(e){
    e.preventDefault();
    console.log(e);
    var Nrtele=e.target.elements[0].value //blokowanie wpisywania niepoprawniego Nr.tele//
    
  }
}
