package com.example.springbootmysql.model;


import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by gratia on 7/10/18.
 */

@Entity
public class Movie {

    @Id
    @Column(name = "ID")
    private int movieId;
    @Column(name = "name")
    private String movieName;
    @Column(name = "year")
    private int movieYear;
    @Column(name = "runtime")
    private String runtime;
    @Column(name = "release_date")
    private Date releaseDate;

    public Movie() {

    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(int movieYear) {
        this.movieYear = movieYear;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
