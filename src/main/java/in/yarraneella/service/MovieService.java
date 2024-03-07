package in.yarraneella.service;

import in.yarraneella.model.MovieRequest;
import in.yarraneella.model.MovieResponse;

public interface MovieService {

	MovieResponse bookTicket(MovieRequest movierequest);

}
