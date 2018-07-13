package com.rasheen.springbootmysql.resource;

import com.rasheen.springbootmysql.model.Movie;
import com.rasheen.springbootmysql.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

<<<<<<< HEAD
=======
//   @PostMapping(value = "/update/{id}")
//   public List<Movie> persist(@PathVariable ("id") int id){
//       movieRepository.deleteById(id);
//       return movieRepository.findAll();
//   }

>>>>>>> 3f8ed827492d23d4f7777d53162347d43607e878
    @DeleteMapping(value = "/delete/{id}")
    public List<Movie> delete(@PathVariable("id") int id){
        movieRepository.deleteById(id);
        return movieRepository.findAll();
    }

<<<<<<< HEAD

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Movie> updateEmployee(@PathVariable("id") int id, @RequestBody Movie movie)
=======
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Movie> update(@PathVariable("id") int id, @RequestBody Movie movie)
>>>>>>> 3f8ed827492d23d4f7777d53162347d43607e878
    {
        System.out.println(id);
        System.out.println(movie);
        return new ResponseEntity<Movie>(movie, HttpStatus.OK);
    }
<<<<<<< HEAD
=======

//   @PutMapping(value = "/edit/{id}")
//    public List<Movie>

>>>>>>> 3f8ed827492d23d4f7777d53162347d43607e878
}
