import { Component, EventEmitter, OnInit,Output,ViewChild } from '@angular/core';
import { Router } from '@angular/router';
import { MatTable } from '@angular/material/table';
import { MatDialog } from '@angular/material/dialog';
import { adsModel } from '../adsModel';

@Component({
  selector: 'app-advertisement-form',
  templateUrl: './advertisement-form.component.html',
  styleUrls: ['./advertisement-form.component.css']
})
export class AdvertisementFormComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  category = ['Furniture', 'Hardware', 'Mobile'];
  name = "sanjay";

  onSubmitDeatil(){
    
  }
  @ViewChild(MatTable, { static: true })
  table!: MatTable<any>;

  public Myname="Neeraj";
  public categoryList =['Furniture', 'Hardware' , 'Mobile']
  
  ads = new adsModel("","","","");
  
  adsList: any=[];

  dataSource: any=[];
  displayedColumns: string[] = ['title', 'name', 'category', 'discription'];
  
  
  // parent communication 
  @Output() public childEvent = new EventEmitter();
  
  isSubmitted=false;
  onSubmit(){

    this.adsList.push(this.ads);
    let obj ={
      title:this.ads.title,
      name:this.ads.name,
      category:this.ads.category,
      discription:this.ads.discription
    }
    this.dataSource.push(obj);
    this.isSubmitted=true;

    this.childEvent.emit(this.dataSource);
    //this.router.navigate(["advertisementTable"]);

  }

}
