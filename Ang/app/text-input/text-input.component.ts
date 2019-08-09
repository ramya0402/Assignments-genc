import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-text-input',
  templateUrl: './text-input.component.html',
  styleUrls: ['./text-input.component.css']
})
export class TextInputComponent implements OnInit {
  tableData = [];
  typeInput: string;

  constructor() { }

  ngOnInit() {
  }

  create(item) {
    this.tableData.push(
      {
        'text': item
      });
  }

}
