import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

// Components
import { AlertsComponent } from './components/alerts/alerts.component';
import { HelloWorldComponent } from './components/helloworld/helloworld.component';


export const routes: Routes = [
    { path: 'alerts', component: AlertsComponent },
    { path: 'hello', component: HelloWorldComponent }
];

@NgModule({
    imports: [ RouterModule.forRoot(routes) ],
    exports: [ RouterModule ]
})
export class AppRoutingModule {}
