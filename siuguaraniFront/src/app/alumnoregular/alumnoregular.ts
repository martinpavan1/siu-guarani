import { Component } from '@angular/core';
import { Localstorageservice } from '../localstorageservice/localstorageservice';
import jsPDF from 'jspdf';


@Component({
  selector: 'app-alumnoregular',
  imports: [],
  templateUrl: './alumnoregular.html',
  styleUrl: './alumnoregular.css'
})
export class Alumnoregular {
  constructor(private lsservice: Localstorageservice){}

  generarPDF() {
    const alumno = this.lsservice.getLocalStorage()
    if(alumno){
      const doc = new jsPDF();

      const texto = `Se deja constancia que el/la alumno/a ${alumno.nombre} ${alumno.apellido}, ` +
                  `DNI ${alumno.studentID}, se encuentra actualmente inscripto/a como alumno/a regular ` +
                  `de la carrera Analista Universitario en Sistemas del Instituto Politécnico Superior.`;

    const pie = `La presente constancia se emite a solicitud del interesado/a con fecha:___________.`;

    doc.setFontSize(16);
    doc.text("CONSTANCIA DE ALUMNO REGULAR", 105, 20, { align: "center" });

    doc.setFontSize(12);
    doc.text(texto, 20, 40, { maxWidth: 170, align: "justify" });
    doc.text(pie, 20, 80, { maxWidth: 170, align: "justify" });

    doc.setFontSize(10);
    doc.text("Instituto Politécnico Superior", 20, 130);
    doc.text("Firma: _______________________", 20, 140);

    doc.save("constancia_alumno_regular.pdf");
  } else {
    alert("No se encontró información del alumno en el LocalStorage.");
  }
}
  }

