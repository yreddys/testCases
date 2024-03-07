package in.yarraneella.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import in.yarraneella.entity.Movie;
import in.yarraneella.model.MovieRequest;
import in.yarraneella.model.MovieResponse;
import in.yarraneella.repository.MovieRepository;
import in.yarraneella.service.MovieServiceImpl;

@ExtendWith(MockitoExtension.class)
public class testMovie {
	@Mock
	private MovieRepository movieRepository;
	@InjectMocks
	private MovieServiceImpl movieService;

	@Test
	void bookTicket_ValidRequest_ReturnsMovieResponse() {
		// Create a movie request
		MovieRequest movieRequest = new MovieRequest();
		movieRequest.setAge(25);
		movieRequest.setName("Test Movie");

		// Create a movie instance with ID 1 (mocking the behavior of save method)
		Movie savedMovie = new Movie();
		savedMovie.setId(1);
		savedMovie.setAge(movieRequest.getAge());
		savedMovie.setName(movieRequest.getName());

		// Stub the behavior of the repository save method
		when(movieRepository.save(Mockito.any(Movie.class))).thenReturn(savedMovie);

		// Call the method being tested
		MovieResponse movieResponse = movieService.bookTicket(movieRequest);

		// Verify the response
		assertEquals(movieRequest.getAge(), movieResponse.getAge());
		assertEquals(movieRequest.getName(), movieResponse.getName());
		assertEquals(savedMovie.getId(), movieResponse.getId());
	}

}