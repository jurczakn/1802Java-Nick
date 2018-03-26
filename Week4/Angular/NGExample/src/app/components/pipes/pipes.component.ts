import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
    selector: 'app-pipes',
    templateUrl: './pipes.component.html'

})
export class PipesComponent {

    terminatorMovies: Array<string> = ['The Terminator', 'Terminator 2: Judgement Day', 'Terminator Salvation'];

    searchTerm = '';

}
