import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-attribute',
  templateUrl: './attribute.component.html',
  styleUrls: ['./attribute.component.css']
})
export class AttributeComponent implements OnInit {

  dates: Array<Date> = new Array<Date>();
  readonly backgroundColor = `white`;
  readonly laterBackgroundColor = 'blue';

  constructor() { console.log('inside attribute constructor'); }

  ngOnInit() {
    console.log('inside attribute onInit');
  }

  addDate(): void {

    this.dates.push(new Date());

  }

  getBackgroundColor(i): string {

    let color = i < 4 ? this.backgroundColor : this.laterBackgroundColor;

    return color;

  }

}
