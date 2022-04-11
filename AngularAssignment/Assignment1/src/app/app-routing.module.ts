import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddComponent } from './add/add.component';
import { AdminComponent } from './admin/admin.component';
import { AppComponent } from './app.component';
import { DeleteComponent } from './delete/delete.component';
import { EditComponent } from './edit/edit.component';
import { MenuComponent } from './menu/menu.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { RestaurantComponent } from './restaurant/restaurant.component';
import { UserComponent } from './user/user.component';

const routes: Routes = [
  {path: 'admin', component: AdminComponent  },
  {
    path: 'admin/', component: AdminComponent,
    children: [
      {path: 'menu', component: MenuComponent  },
      {path: 'restaurant', component: RestaurantComponent}
    ]
  },
  {path: 'menu', component: MenuComponent  },
  {path: 'restaurant', component: RestaurantComponent},
  {path: 'user', component: UserComponent},
  {path: 'add', component: AddComponent},
  {path: 'edit', component: EditComponent},
  {path: 'delete', component: DeleteComponent},
  {path: "**", component: PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponent = [
  AdminComponent
]