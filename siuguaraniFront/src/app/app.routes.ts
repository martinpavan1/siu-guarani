import { Routes } from '@angular/router';
import { Formlogin } from './formlogin/formlogin';
import { Inicioalumno } from './inicioalumno/inicioalumno';
import { Layout } from './layout/layout';
import { Mismaterias } from './mismaterias/mismaterias';
import { Alumnoregular } from './alumnoregular/alumnoregular';
import { Avancecarrera } from './avancecarrera/avancecarrera';
import { Perfil } from './perfil/perfil';

export const routes: Routes = [

    {path: "acceso", component:Formlogin},
    {path: "", component: Layout,
        children:[
            {path: "inicio_alumno", component:Inicioalumno},
            {path: "mis_materias", component:Mismaterias},
            {path: "alumnoregular", component:Alumnoregular},
            {path: "avance_carrera", component:Avancecarrera},
            {path: "perfil", component:Perfil}
        ]
    },

];
