import { Injectable } from '@angular/core';
import { Authservice } from '../authservice/authservice';
import { AlumnoModel } from '../models/alumnomodel';

@Injectable({
  providedIn: 'root'
})
export class Localstorageservice {
  
  constructor(authservice : Authservice){}

  saveLocalStorage(alumno : AlumnoModel):void{
      localStorage.clear()
      localStorage.setItem('alumno', JSON.stringify(alumno))
  }

  getLocalStorage(): AlumnoModel | null{
    let localdata = localStorage.getItem('alumno')

      if(localdata){
        let resp : AlumnoModel = JSON.parse(localdata)
        return resp

      }else{ 
        console.log("No se guardo en el local storage")
        return null
      }
  }
}
