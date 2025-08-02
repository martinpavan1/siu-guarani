import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class Authservice {
  private apiUrl = 'http://localhost:8080';

  constructor(private httpclient: HttpClient){}

  login(studentID: number, password: string): Observable<any>{
    console.log(studentID)
    console.log(password)
    return this.httpclient.post<any>(`${this.apiUrl}/acceso`, 
      {studentID, password}, 
      {
        observe: 'response', 
        headers: new HttpHeaders({'Content-Type': 'application/json'})
      });
  }
}
