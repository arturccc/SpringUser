import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule } from '@angular/forms'; // Importação necessária
import { AppComponent } from './app.component'; // Seu componente principal
import { RegsiterComponent } from './auth/regsiter.component'; // Seu componente do formulário

@NgModule({
  declarations: [

  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule ,
    AppComponent,
    RegsiterComponent
  ],
  providers: [],
  bootstrap: []
})
export class AppModule { }
