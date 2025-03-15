import { Component } from '@angular/core';
import {FormBuilder, FormGroup, ReactiveFormsModule} from '@angular/forms';


@Component({
  selector: 'app-auth',
  imports: [
    ReactiveFormsModule
  ],
  templateUrl: './regsiter.component.html',
  styleUrl: './register.component.css'
})
export class RegsiterComponent {
  regsiterForm: FormGroup;

  constructor(private fb: FormBuilder) {
    this.regsiterForm = this.fb.group({
      user: [''],
      email: [''],
      pass : ['']
    });
  }

  getFormValue(){
    console.log(this.regsiterForm.value)
  }
}
