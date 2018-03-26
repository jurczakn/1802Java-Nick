import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

// Components
import { AppComponent } from './app.component';
import { HelloWorldComponent } from './components/helloworld/helloworld.component';
import { FailureComponent } from './components/failure/failure.component';
import { AlertsComponent } from './components/alerts/alerts.component';

// Routing
import { AppRoutingModule } from './app-routing.module';

// Services
import { LoggingService } from './services/logging.service';
import { PokemonService } from './services/pokemon.service';
import { PokemonComponent } from './components/pokemon/pokemon.component';

@NgModule({
  declarations: [
    AppComponent,
    HelloWorldComponent,
    FailureComponent,
    AlertsComponent,
    PokemonComponent
  ],
  imports: [
    BrowserModule,
    NgbModule.forRoot(),
    FormsModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [
    LoggingService,
    PokemonService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
