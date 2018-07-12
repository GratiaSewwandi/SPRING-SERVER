package com.example.springbootmysql.Resource;

import com.example.springbootmysql.Repository.UserRepository;
import com.example.springbootmysql.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

/**
 * Created by gratia on 7/10/18.
 */
@RestController
@RequestMapping(value = "/rest/movie")
public class MovieResource {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/all")
    public List<Movie> getAll() {
        return userRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<Movie> persist(@RequestBody final Movie movie) {
        userRepository.save(movie);
        return userRepository.findAll();
    }

}
