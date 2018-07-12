package com.example.springbootmysql.Repository;

import com.example.springbootmysql.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by gratia on 7/10/18.
 */
public interface UserRepository extends JpaRepository<Movie,Integer > {


}
