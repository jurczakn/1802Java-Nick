import { Component, OnInit } from '@angular/core';
import { PokemonService } from '../../services/pokemon.service';
import { LoggingService } from '../../services/logging.service';
import { FormsModule } from '@angular/forms';
import { Pokemon } from '../../pokemon';

@Component({
  selector: 'app-pokemon',
  templateUrl: './pokemon.component.html',
  styleUrls: ['./pokemon.component.css'],
  providers: [PokemonService, LoggingService]
})
export class PokemonComponent implements OnInit {

  id: number;

  myPokemon: Pokemon;

  getPokemon() {

    this.pokeService.getPokemon(String(this.id)).subscribe(data => this.myPokemon = data);

  }

  constructor(private logger: LoggingService, private pokeService: PokemonService) { }

  ngOnInit() {
  }

}
