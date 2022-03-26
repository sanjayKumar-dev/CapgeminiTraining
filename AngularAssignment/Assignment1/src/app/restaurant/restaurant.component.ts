import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-restaurant',
  templateUrl: './restaurant.component.html',
  styleUrls: ['./restaurant.component.css']
})
export class RestaurantComponent implements OnInit {

  restaurants = [
    {"id": 1, "name": "Restaurant 1"},
    {"id": 2, "name": "Restaurant 2"},
    {"id": 3, "name": "Restaurant 3"},
    {"id": 4, "name": "Restaurant 4"},
    {"id": 5, "name": "Restaurant 5"}
  ]

  constructor() { }

  ngOnInit(): void {
  }

}
