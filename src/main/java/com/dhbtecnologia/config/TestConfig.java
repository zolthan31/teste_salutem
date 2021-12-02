package com.dhbtecnologia.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.dhbtecnologia.domain.Contatos;
import com.dhbtecnologia.domain.Pessoa;
import com.dhbtecnologia.repository.ContatosRepository;
import com.dhbtecnologia.repository.PessoaRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private ContatosRepository contatosRepository;

	@Override
	public void run(String... args) throws Exception {
		
		
		Pessoa p1 = new Pessoa(null, "Romulo", "28904604010", "08/07/1978");
		Pessoa p2 = new Pessoa(null, "Maria", "51925055000", "10/08/1961");
		
		Contatos c1 = new Contatos(null, "Fernanda", "98487-4876", "fernanda@gmail.com");
		Contatos c2 = new Contatos(null, "Cristiane", "98807-4549", "cris@gmail.com");
		
		pessoaRepository.saveAll(Arrays.asList(p1, p2));
		contatosRepository.saveAll(Arrays.asList(c1, c2));
		
	}

}
