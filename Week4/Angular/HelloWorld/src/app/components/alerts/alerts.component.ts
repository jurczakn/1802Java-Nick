import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { LoggingService } from '../../services/logging.service';

@Component({
  selector: 'app-alerts',
  templateUrl: './alerts.component.html',
  styleUrls: ['./alerts.component.css'],
  providers: [LoggingService]
})
export class AlertsComponent implements OnInit {

  closed = false;

  onNotify(message: boolean) {

    this.closed = message;
    this.logger.log('ok', 'updated closed property');

  }

  constructor(private logger: LoggingService) { }

  ngOnInit() {
    this.logger.log('info', 'alerts component initiated');
  }

}
