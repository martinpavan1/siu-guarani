import { Component } from '@angular/core';
import { Authservice } from '../authservice/authservice';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators, FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-formlogin',
  imports: [ReactiveFormsModule, FormsModule],
  templateUrl: './formlogin.html',
  styleUrl: './formlogin.css'
})
export class Formlogin {
  loginForm! : FormGroup
  formError = false

  constructor(private authservice : Authservice, private formbuilder: FormBuilder, private router: Router){}

  login():any{
    this.authservice.login(this.loginForm.value.studentID, this.loginForm.value.password).subscribe({
      next : resp => {
        console.log(resp)
        this.router.navigate(['/inicio_alumno'])
      },
      error : err => {
        console.error(err)
        this.formError = true
      }
    })
  }

  ngOnInit(): void{
    this.loginForm = this.formbuilder.group({
      studentID: ['', [Validators.required]],
      password: ['', [Validators.required]]
    })
  }
}
