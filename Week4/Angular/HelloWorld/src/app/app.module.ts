import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';

// Components
import { AppComponent } from './app.component';
import { HelloWorldComponent } from './components/helloworld/helloworld.component';
import { FailureComponent } from './components/failure/failure.component';
import { AlertsComponent } from './components/alerts/alerts.component';

@NgModule({
  declarations: [
    AppComponent,
    HelloWorldComponent,
    FailureComponent,
    AlertsComponent
  ],
  imports: [
    BrowserModule,
    NgbModule.forRoot(),
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
