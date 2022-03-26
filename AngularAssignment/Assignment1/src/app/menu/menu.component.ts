import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  menus = [
    {"id": 1, "name": "Indian"},
    {"id": 2, "name": "Chineese"},
    {"id": 3, "name": "Korean"},
    {"id": 4, "name": "Latin"},
    {"id": 5, "name": "African"},
  ]

  constructor() { }

  ngOnInit(): void {
  }

}
