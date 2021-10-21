package br.unicesumar.adsis4s2021.meu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.unicesumar.adsis4s2021.meu.lucas.produto.MeuProduto;
import br.unicesumar.adsis4s2021.meu.lucas.produto.MeuProdutoRepository;

@SpringBootTest
@AutoConfigureMockMvc
public class MeuExemploTestes {
	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private ObjectMapper jacksonObjectMapper;
	
	@MockBean
	private MeuProdutoRepository produtoRepository;
	


	@Test
	void testarUmMaisUm() {
		assertEquals(2, 1+1);
	}

	@Test
	void testarDoisMaisDois() {
		assertEquals(4, 2+2);
	}
	
	@Test
	void getAllProdutosRetornaAlgumProduto() throws Exception {
		List<MeuProduto> retorno = Arrays.asList(
				new MeuProduto("1","1",1), 
				new MeuProduto("2","2",2), 
				new MeuProduto("3","3",3));		
		Mockito
			.when(produtoRepository.findAll())
			.thenReturn(retorno); 
		
		String jsonDosProdutosRetornados = mockMvc
				.perform(get("/meus-produtos"))
				.andReturn()
				.getResponse()
				.getContentAsString();
		
		MeuProduto[] produtos = jacksonObjectMapper.readValue(jsonDosProdutosRetornados, MeuProduto[].class);
		
		assertEquals(3, produtos.length);

	}
	
	@Test
	void getAllProdutosRetornaStatus200() throws Exception {
		mockMvc
			.perform(get("/meus-produtos"))
			.andExpect(status().is(200));		
	}
	
	@Test
	void getAllLivrosRetornaStatus200() throws Exception {
		mockMvc
			.perform(get("/meus-livros"))
			.andExpect(status().is(200));		
	}
	
}

