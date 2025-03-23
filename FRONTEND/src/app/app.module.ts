import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { UsuarioService } from './Service/Usuarios.service';
@NgModule({
  declarations: [

  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule ,
    AppComponent,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [UsuarioService]
})
export class AppModule { }
