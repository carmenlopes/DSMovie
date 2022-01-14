package com.devsuperior.dsmovie.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
