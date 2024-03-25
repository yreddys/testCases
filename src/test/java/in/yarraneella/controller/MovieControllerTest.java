package in.yarraneella.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.yarraneella.model.MovieRequest;
import in.yarraneella.model.MovieResponse;
import in.yarraneella.service.MovieService;

@WebMvcTest(MovieController.class)
public class MovieControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private MovieService movieService;

	@Test
	public void testBookTicket() throws Exception {
		// Mock service response
		MovieResponse mockResponse = new MovieResponse();
		mockResponse.setId(1);
		mockResponse.setName("Test Movie");
		mockResponse.setAge(18);
		when(movieService.bookTicket(Mockito.any(MovieRequest.class))).thenReturn(mockResponse);

		// Create request body
		MovieRequest request = new MovieRequest();
		request.setName("Test Movie");
		request.setAge(18);

		// Perform POST request and verify response
		mockMvc.perform(post("/save").contentType(MediaType.APPLICATION_JSON)
				.content(new ObjectMapper().writeValueAsString(request))).andExpect(status().isCreated());
	}
}
