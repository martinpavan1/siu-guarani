import { HttpEvent, HttpHandler, HttpInterceptorFn, HttpRequest } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { Localstorageservice } from '../localstorageservice/localstorageservice';
import { Observable } from 'rxjs';

// @Injectable()
// export class Interceptor implements HttpInterceptor {
//   constructor(private lsservice: Localstorageservice) {}
//   intercept(
//     request: HttpRequest<any>,
//     next: HttpHandler
//   ): Observable<HttpEvent<any>> {
//     // add authorization header with jwt token if available
//     let currentUser = this.lsservice.getLocalStorage();
//     console.log(currentUser?.token)
//     console.log("LLEGUEEEEEEEE")
//     if (currentUser && currentUser.token) {
//       request = request.clone({
//         setHeaders: {
//           Authorization: `Bearer ${currentUser.token}`,
//         },
//       });
//     }
//     return next.handle(request);
//   }
// }

export const interceptor: HttpInterceptorFn = (req, next) => {
  const lsservice = inject(Localstorageservice);
  const token = lsservice.getLocalStorage()?.token

  if (token) {
    const cloned = req.clone({
      setHeaders: {
        Authorization: `Bearer ${token}`,
      },
    });
    return next(cloned);
  }
  
  return next(req);
};