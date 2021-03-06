package com.rasheen.springbootmysql.resource;

import com.rasheen.springbootmysql.model.Movie;
import com.rasheen.springbootmysql.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/rest/movie")
public class MoviesResource {

    @Autowired
    MovieRepository movieRepository;

    @GetMapping(value = "/details")
    public List<Movie> getSpecific(){
        return movieRepository.findAll();
    };

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


    @GetMapping(value = "/view/{id}")
    public Optional<Movie> view(@PathVariable("id") int id){
        movieRepository.findById(id);
        return movieRepository.findById(id);
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Movie> update(@PathVariable("id") int id, @RequestBody Movie movie)

    {
        System.out.println(id);
        System.out.println(movie);
        return new ResponseEntity<Movie>(movie, HttpStatus.OK);
    }

}
