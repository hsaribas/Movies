package dev.huz.movies.controller;

import dev.huz.movies.model.Movie;
import dev.huz.movies.service.MovieService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return ResponseEntity.ok(movieService.allMovies());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Movie>> getMovie(@PathVariable ObjectId id) {
        return ResponseEntity.ok((movieService.singeMovie(id)));
    }
}
