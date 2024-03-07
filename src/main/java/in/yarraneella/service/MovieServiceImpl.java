package in.yarraneella.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.yarraneella.entity.Movie;
import in.yarraneella.model.MovieRequest;
import in.yarraneella.model.MovieResponse;
import in.yarraneella.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieRepository movieRepository;

	@Override
	public MovieResponse bookTicket(MovieRequest movierequest) {
		Movie movie = new Movie();
		movie.setAge(movierequest.getAge());
		movie.setName(movierequest.getName());
		movie = movieRepository.save(movie);
		MovieResponse movieResponse = new MovieResponse();
		movieResponse.setAge(movie.getAge());
		movieResponse.setName(movie.getName());
		movieResponse.setId(movie.getId());
		return movieResponse;
	}
}
