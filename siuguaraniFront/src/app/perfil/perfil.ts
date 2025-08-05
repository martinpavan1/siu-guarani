import { Component } from '@angular/core';
import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { Perfilservice } from '../perfilservice/perfilservice';
import { Localstorageservice } from '../localstorageservice/localstorageservice';
import { Router } from '@angular/router';

@Component({
  selector: 'app-perfil',
  imports: [ReactiveFormsModule, FormsModule],
  templateUrl: './perfil.html',
  styleUrl: './perfil.css'
})
export class Perfil {
  perfilForm! : FormGroup

  constructor(private perfilservice:Perfilservice, private formbuilder: FormBuilder,
                private lsservice : Localstorageservice, private router:Router){}

  actualizarAlumno(){
    // console.log(this.perfilForm.value.nombre)
    // console.log(this.perfilForm.value.apellido)
    // console.log(this.perfilForm.value.email)
    // console.log(this.perfilForm.value.fechaNacimiento)
     const studentID = this.lsservice.getLocalStorage()?.studentID
     if(studentID){

       this.perfilservice.actualizar(studentID, this.perfilForm.value.nombre, this.perfilForm.value.apellido,
                                     this.perfilForm.value.email, this.perfilForm.value.fechaNacimiento).subscribe({
                                       next: resp =>{
                                           this.lsservice.saveLocalStorage(resp)
                                           console.log("Alumno actualizado correctamente")
                                       },
                                       error: err =>{
                                         console.error("Error al actualizar el alumno")
                                       }
                                     })

     } else{
       console.error("Error al obetener el studentID")
     }

 }


  ngOnInit():void{

    this.perfilForm = this.formbuilder.group({
      nombre: ['', [Validators.required]],
      apellido: ['', [Validators.required]],
      email: ['', [Validators.required, Validators.email]],
      fechaNacimiento: ['', [Validators.required]],
    })

    const alumno = this.lsservice.getLocalStorage()
    if(alumno){
      this.perfilForm.patchValue({
        nombre: alumno.nombre,
        apellido: alumno.apellido,
        email: alumno.email,
        fechaNacimiento: alumno.fechaNacimiento
      })

    }

  }
}
