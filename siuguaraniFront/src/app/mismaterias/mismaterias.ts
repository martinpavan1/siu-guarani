import { Component } from '@angular/core';
import { Materiasservice } from '../materiasservice/materiasservice';
import { Localstorageservice } from '../localstorageservice/localstorageservice';
import { Inscripcionmateriamodel } from '../models/inscripcionmateriamodel';
import { NgFor } from '@angular/common';
import { Estado } from '../models/estadomodel';
import { MateriaModel } from '../models/materiamodel';

@Component({
  selector: 'app-mismaterias',
  imports: [NgFor],
  templateUrl: './mismaterias.html',
  styleUrl: './mismaterias.css'
})
export class Mismaterias {
  listaInscripciones! : Inscripcionmateriamodel []
  listaMaterias! : MateriaModel []
  listaFinal : Inscripcionmateriamodel [] = []
  estado = Estado

  constructor(private materiaservice: Materiasservice, private localstorage: Localstorageservice){}
  
  materias():void{
    this.materiaservice.getAllMaterias().subscribe({
      next: list =>{
        this.listaMaterias = list
        
      },
      error : err =>{
        console.error("Error al obetener todas las materias")
      }

    })
  }

  materiasPorAlumno():void{
    const studentID = this.localstorage.getLocalStorage()?.studentID
    
    if(studentID){
      this.materiaservice.getMateriasPorAlumno(studentID).subscribe({
        next: list => {
          this.listaInscripciones = list
        },
        error : err =>{
          console.error("Error al obtener materias de alumno.")
        }
        
      })
    }else{
      console.error("Error al obtener el studentID).")
    }
    
  }

  mergeMaterias(){
    for(let materia of this.listaMaterias){
      let exist = this.listaInscripciones.find(mat=> materia.id == mat.materia.id) // devuelve objeto o undefined

      let aux = {
        materia:materia,
        nota: (exist) ? exist.nota : 0,         // si es undefined inicializa en 0
        estado: (exist) ? exist.estado : null   
      }
      this.listaFinal.push(aux);
    }

  }
  inscribirse(materiaID : number){
    const studentID = this.localstorage.getLocalStorage()?.studentID
    if(studentID){
      this.materiaservice.inscripcion(studentID,materiaID).subscribe({
        next: resp =>{
          
          let exist = this.listaFinal.find(mat=> resp.materia.id == mat.materia.id)
          if(exist){
            exist.nota = resp.nota
            exist.estado = resp.estado
          }                             

        },
        error : err =>
          alert("No cumples con las correlativas")
      })
    }
  }


  ngOnInit():void{
    this.materias()
    this.materiasPorAlumno()
    setTimeout(()=>this.mergeMaterias(), 750) 
    // solucion a que se me inicializaba el merge en paralelo.. mejor hacerlo con una promesa
  }
  
}
