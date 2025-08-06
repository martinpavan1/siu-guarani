import { Routes } from '@angular/router';
import { Formlogin } from './formlogin/formlogin';
import { Inicioalumno } from './inicioalumno/inicioalumno';
import { Layout } from './layout/layout';
import { Mismaterias } from './mismaterias/mismaterias';
import { Alumnoregular } from './alumnoregular/alumnoregular';
import { Avancecarrera } from './avancecarrera/avancecarrera';
import { Perfil } from './perfil/perfil';
import { Authguard } from './authguardservice/authguard';

export const routes: Routes = [

    {path: "acceso", component:Formlogin},
    {path: "", component: Layout,
        children:[
            {path: "inicio_alumno", component:Inicioalumno, canActivate: [Authguard]},
            {path: "mis_materias", component:Mismaterias, canActivate: [Authguard]},
            {path: "alumnoregular", component:Alumnoregular, canActivate: [Authguard]},
            {path: "avance_carrera", component:Avancecarrera, canActivate: [Authguard]},
            {path: "perfil", component:Perfil, canActivate: [Authguard]}
        ]
    },
    {path:"**",redirectTo:"acceso"}

];
