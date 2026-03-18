package com.github.osvaldo.outsera.pioresFilmesAPI;

import com.github.osvaldo.outsera.pioresFilmesAPI.dto.ResultadoDTO;
import com.github.osvaldo.outsera.pioresFilmesAPI.service.FilmeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


@SpringBootTest
class PioresFilmesApiApplicationTests {

	@Autowired
	private FilmeService service;

	@Test
	void deveRetornarIntervalos() {

		ResultadoDTO resultado = service.calculaIntervalo();

		assertNotNull(resultado);
		assertFalse(resultado.getMin().isEmpty());
		assertFalse(resultado.getMax().isEmpty());

		//Menor intervalo
		assertEquals(1, resultado.getMin().get(0).getInterval());
		assertEquals("Joel Silver", resultado.getMin().get(0).getProducer());
		assertEquals(1990, resultado.getMin().get(0).getPreviousWin());
		assertEquals(1991, resultado.getMin().get(0).getFollowingWin());

		//Maior intervalo
		assertEquals(13, resultado.getMax().get(0).getInterval());
		assertEquals("Matthew Vaughn", resultado.getMax().get(0).getProducer());
		assertEquals(2002, resultado.getMax().get(0).getPreviousWin());
		assertEquals(2015, resultado.getMax().get(0).getFollowingWin());
	}

}
