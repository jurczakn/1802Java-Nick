import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-failure',
  templateUrl: './failure.component.html',
  styleUrls: ['./failure.component.css']
})
export class FailureComponent implements OnInit {

  message = 'FATALITY';
  detailedText = 'FLAWLESS VICTORY';

  @Input()
  closed = false;

  @Output()
  notify: EventEmitter<boolean> = new EventEmitter<boolean>();

  closeMessage(): void {

    this.closed = true;
    this.notify.emit(true);

  }

  constructor() { }

  ngOnInit() {
  }

}
