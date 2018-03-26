import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { LoggingService } from '../../services/logging.service';

@Component({
  selector: 'app-failure',
  templateUrl: './failure.component.html',
  styleUrls: ['./failure.component.css'],
  providers: [LoggingService]
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
    this.logger.log('ok', 'failure component closes');

  }

  constructor(private logger: LoggingService) { }

  ngOnInit() {

    this.logger.log('info', 'failure component intiated');

  }

}
