package dev.huz.movies.service;

import dev.huz.movies.model.Movie;
import dev.huz.movies.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> singeMovie(ObjectId id) {
        return movieRepository.findById(id);
    }
}
