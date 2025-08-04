import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { MateriaModel } from '../models/materiamodel';
import { Inscripcionmateriamodel } from '../models/inscripcionmateriamodel';

@Injectable({
  providedIn: 'root'
})
export class Materiasservice {
  private apiUrl = 'http://localhost:8080';

  constructor(private httpclient: HttpClient){}

  getAllMaterias():Observable<MateriaModel[]>{
    return this.httpclient.get<any>(`${this.apiUrl}/materias`,
      {
        headers: new HttpHeaders({'Content-Type': 'application/json'})
      });
  }

  getMateriasPorAlumno(studentID:number): Observable<Inscripcionmateriamodel[]>{
    return this.httpclient.get<any>(`${this.apiUrl}/mis_materias`,
      {
        params: {studentID},
        headers: new HttpHeaders({'Content-Type': 'application/json'})
      });
  }

  inscripcion(studentID: number, materiaID: number): Observable<any>{
    return this.httpclient.post<any>(`${this.apiUrl}/inscripcion/${studentID}/${materiaID}`,
      {
        observe: 'response', 
        headers: new HttpHeaders({'Content-Type': 'application/json'})
      });
  }
}

