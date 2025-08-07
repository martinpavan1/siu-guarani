import { Component } from '@angular/core';
import { Materiasservice } from '../materiasservice/materiasservice';
import { Localstorageservice } from '../localstorageservice/localstorageservice';
import { Estado } from '../models/estadomodel';

@Component({
  selector: 'app-avancecarrera',
  imports: [],
  templateUrl: './avancecarrera.html',
  styleUrl: './avancecarrera.css'
})
export class Avancecarrera {
  avance = 0
  constructor(private materiaservice: Materiasservice, private lsservice: Localstorageservice){}

  avanceCarrera(){
    const studentID = this.lsservice.getLocalStorage()?.studentID
  
    if(studentID){
      this.materiaservice.getMateriasPorAlumno(studentID).subscribe({
        next: list=> {
            const aprobadas = list.filter(it => it.estado == Estado.APROBADO).length
            const totalMaterias = 30
            this.avance = Math.round((aprobadas/totalMaterias)*100) // mathround para que no aparezcan los decimales

        },
        error: err=>{
          console.error("Error al obetener el avance de carrera")
        }
      })
    }

  }


  ngOnInit(){
    this.avanceCarrera()
  }
}
