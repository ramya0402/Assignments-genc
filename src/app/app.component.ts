import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    <div>
      <my-base></my-base>
      <hr />
      <my-inherited></my-inherited>
    </div>
  `
})
export class AppComponent { }