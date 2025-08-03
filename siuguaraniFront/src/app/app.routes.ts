import { Routes } from '@angular/router';
import { Formlogin } from './formlogin/formlogin';
import { Inicioalumno } from './inicioalumno/inicioalumno';

export const routes: Routes = [

    {path: "acceso", component:Formlogin},
    {path: "inicio_alumno", component:Inicioalumno,
        children : [
            {path:"main"}
        ]
    }

];
