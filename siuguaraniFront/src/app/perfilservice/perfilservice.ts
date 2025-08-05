import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class Perfilservice {
  private apiUrl = 'http://localhost:8080';

  constructor(private httpclient : HttpClient){}

  actualizar(studentID:number, nombre:string, apellido:string, email:string, fechaNacimiento:Date){
    return this.httpclient.post<any>(
      `${this.apiUrl}/actualizar/${studentID}/${nombre}/${apellido}/${email}/${fechaNacimiento}`, 
      {
        observe: 'response', 
        headers: new HttpHeaders({'Content-Type': 'application/json'})
      });

  }
}