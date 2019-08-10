import { Component } from '@angular/core';
import { BaseComponent } from './base.component';

@Component({
  selector : 'my-inherited',
  template: `
  <div style='background-color: #abcdef'>
  {{start}}
  <div *ngFor="let v of val">
  {{val[v]}}
  </div>
     
  </div>
`
})
export class DerivedComponent extends BaseComponent {}