import { Routes } from '@angular/router';
import { LoginComponent } from './login/login.component'
import { CriarComponent } from './criar/criar.component';

export const routes: Routes = [
  {path: 'login', component: LoginComponent},
  {path: 'criar', component: CriarComponent}

];
