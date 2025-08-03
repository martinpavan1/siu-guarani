import { Component } from '@angular/core';
import { Authservice } from '../authservice/authservice';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators, FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { Localstorageservice } from '../localstorageservice/localstorageservice';
import { AlumnoModel } from '../models/alumnomodel';

@Component({
  selector: 'app-formlogin',
  imports: [ReactiveFormsModule, FormsModule],
  templateUrl: './formlogin.html',
  styleUrl: './formlogin.css'
})
export class Formlogin {
  loginForm! : FormGroup
  formError = false

  constructor(private authservice : Authservice, private formbuilder: FormBuilder, 
                private router: Router, private lsservice : Localstorageservice){}

  login():void{
    this.authservice.login(this.loginForm.value.studentID, this.loginForm.value.password).subscribe({
      next : resp => {
        console.log(resp)

        const alumno : AlumnoModel = resp.body // casteo body al modelo de alumno
        
        this.lsservice.saveLocalStorage(alumno) // save in local storage

        if(this.lsservice.getLocalStorage()){
          this.router.navigate(['/inicio_alumno']) // si guardo en el localstorage, redirecciona
        }
        
      },
      error : err => {
        console.error(err)
        this.formError = true
      }
    })
  }

  ngOnInit(): void{ // LIFECYCLE HOOK
    this.loginForm = this.formbuilder.group({
      studentID: ['', [Validators.required]],
      password: ['', [Validators.required]]
    })
  }
}
