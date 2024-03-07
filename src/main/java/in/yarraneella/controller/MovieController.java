package in.yarraneella.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.yarraneella.model.MovieRequest;
import in.yarraneella.model.MovieResponse;
import in.yarraneella.service.MovieService;

@RestController
public class MovieController {
	@Autowired
	private MovieService movieService;

	@PostMapping("/save")
	ResponseEntity<MovieResponse> bookTicket(@RequestBody MovieRequest movierequest) {
		MovieResponse response = movieService.bookTicket(movierequest);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
}
