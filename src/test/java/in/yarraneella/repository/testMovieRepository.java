//package in.yarraneella.repository;
//
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//
//import in.yarraneella.entity.Movie;
//// Use H2 DB
//
//@DataJpaTest
//public class testMovieRepository {
//	@Autowired
//	private MovieRepository movieRepository;
//
//	@Test
//	void bookTicket_Repo() {
//		Movie mv = new Movie();
//		mv.setId(1);
//		mv.setName("Hi");
//		mv.setAge(10);
//		Movie savedMovie = movieRepository.save(mv);
//		Assertions.assertThat(savedMovie).isNotNull();
//		Assertions.assertThat(savedMovie.getId()).isGreaterThan(0);
//	}
//}
