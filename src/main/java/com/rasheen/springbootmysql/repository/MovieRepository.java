package com.rasheen.springbootmysql.repository;

import com.rasheen.springbootmysql.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer>{
}
