import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot } from '@angular/router';
import { Localstorageservice } from '../localstorageservice/localstorageservice';

@Injectable({ providedIn: 'root' })
export class Authguard implements CanActivate {
  constructor(
    private router: Router,
    private lsservice: Localstorageservice
  ) {}
  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
    const currentUser = this.lsservice.getLocalStorage()?.studentID;
    if (currentUser) {
      // El usuario esta logeado
      return true;
    }
    // No logeado, por lo tanto es redirigido a la pagina de login
    this.router.navigate(['/acceso'], { queryParams: { returnUrl: state.url } });
    return false;
  }
}
