import { Injectable } from '@angular/core';
import { Authservice } from '../authservice/authservice';
import { AlumnoModel } from '../models/alumnomodel';

@Injectable({
  providedIn: 'root'
})
export class Localstorageservice {
  
  constructor(authservice : Authservice){}

  saveLocalStorage(alumno : AlumnoModel):void{
    if(alumno.token == null){
      const {token} = {...this.getLocalStorage()} // {token} desestructuracion  // {...} copia en memoria, no puntero
      if(token){
        alumno.token = token
      }else{  
        console.log("Error al obtener el token")
      }

    }
      
      //localStorage.clear()
      localStorage.setItem('alumno', JSON.stringify(alumno))
  }

  getLocalStorage(): AlumnoModel | null{
    let localdata = localStorage.getItem('alumno')

      if(localdata){
        let resp : AlumnoModel = JSON.parse(localdata)
        return resp

      }else{ 
        console.log("No hay info en el localstorage")
        return null
      }
  }
}
