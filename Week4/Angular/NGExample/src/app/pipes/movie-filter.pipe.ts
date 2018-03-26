import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
    name: 'movieFilter'
})
export class MovieFilter implements PipeTransform {

    transform(item: string[], searchText: string): string[] {

        if (!item) {

            return [];

        }

        searchText = searchText.toLowerCase();

        return item.filter( movie => {

            let search: boolean;
            search = movie.toLowerCase().includes(searchText);
            return search;

        });

    }

}