import { Routes } from '@angular/router';
import { Formlogin } from './formlogin/formlogin';
import { Inicioalumno } from './inicioalumno/inicioalumno';

export const routes: Routes = [

    {path: "acceso", component:Formlogin}, // ruta al Formlogin
    {path: "inicio_alumno", component:Inicioalumno}

];
