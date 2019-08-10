import { Component, Input  } from '@angular/core';

@Component({
  selector : 'my-base',
  template: `
    <div style='background-color: #ff0000'>
    {{start}}
    <div *ngFor="let v of val">
       {{val[v]}}
       </div>
    </div>
  `
})
export class BaseComponent {
  
  val: number[]=[1,2,3,4,5];
  start:number=this.val[0];
}