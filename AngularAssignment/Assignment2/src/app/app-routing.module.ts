import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdvertisementFormComponent } from './advertisement-form/advertisement-form.component';

const routes: Routes = [
  {path: 'advertisement', component: AdvertisementFormComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
