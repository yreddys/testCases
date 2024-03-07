package in.yarraneella.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.yarraneella.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer> {

}
