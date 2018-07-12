package com.rasheen.springbootmysql.resource;

import com.rasheen.springbootmysql.model.Movie;
import com.rasheen.springbootmysql.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/movie")
public class MoviesResource {

    @Autowired
    MovieRepository movieRepository;

    @GetMapping(value = "/all")
    public List<Movie> getAll(){
        return movieRepository.findAll();
    };

    @PostMapping(value = "/load")
    public List<Movie> persist(@RequestBody final Movie movie){
        movieRepository.save(movie);
        return movieRepository.findAll();
    }

    @DeleteMapping(value = "/delete/{id}")
    public List<Movie> delete(@PathVariable("id") int id){
        movieRepository.deleteById(id);
        return movieRepository.findAll();
    }
}
