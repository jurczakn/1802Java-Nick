import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

// Components
import { AlertsComponent } from './components/alerts/alerts.component';
import { HelloWorldComponent } from './components/helloworld/helloworld.component';
import { PokemonComponent } from './components/pokemon/pokemon.component';

export const routes: Routes = [
    { path: 'alerts', component: AlertsComponent },
    { path: 'hello', component: HelloWorldComponent },
    { path: 'poke', component: PokemonComponent }
];

@NgModule({
    imports: [ RouterModule.forRoot(routes) ],
    exports: [ RouterModule ]
})
export class AppRoutingModule {}
