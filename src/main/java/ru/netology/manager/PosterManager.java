package ru.netology.manager;

import ru.netology.domain.Movie;

public class PosterManager {
    private Movie[] movieTape = new Movie[10];
    private int limit = 10;

    public PosterManager() {
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void add(Movie movie) {
        int length = movieTape.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movieTape, 0, tmp, 0, movieTape.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movieTape = tmp;
    }

    public Movie[] getLastMovies(int limit) {
        Movie[] last10 = new Movie[limit];
        int counter = 0;
        for (int i = movieTape.length - 1; counter < limit; i--) {
            last10[counter] = movieTape[i];
            counter++;
        }
        return last10;
    }

}
