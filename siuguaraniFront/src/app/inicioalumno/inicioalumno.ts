import { Component } from '@angular/core';
import { AlumnoModel } from '../models/alumnomodel';
import { Localstorageservice } from '../localstorageservice/localstorageservice';

@Component({
  selector: 'app-inicioalumno',
  imports: [],
  templateUrl: './inicioalumno.html',
  styleUrl: './inicioalumno.css'
})
export class Inicioalumno {
  constructor(private localstorage: Localstorageservice){}

  alumno : AlumnoModel | null = null
  emptyalumno = false

  ngOnInit(): void{
    const data = this.localstorage.getLocalStorage()
    
    if(data){
      this.alumno = data
      this.emptyalumno = true
    }
  }
  
  


}
