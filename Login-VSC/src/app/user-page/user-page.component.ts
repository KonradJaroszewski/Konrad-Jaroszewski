import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-page',
  templateUrl: './user-page.component.html',
  styleUrls: ['./user-page.component.css']
})
export class UserPageComponent implements OnInit {

  constructor( private router:Router) { } //strona uzytkownika//

  ngOnInit() {
    

  }
  PickCategory(e){
    console.log(e)
    var Category=e.target.elements[0].value;
    if(Category==""){
      return "pusta Kategoria"
    }
    else if(Category=="Developer"){
      return "Developer"
    }
    else if(Category=="Engine"){
      return "Engine"
    } else if(Category=="Game type"){
      return "Game type"
    } else if(Category=="Price"){
      return "Price"
    } else if(Category=="Release Date"){
      return "Release Date"
    }
  }
  
}
