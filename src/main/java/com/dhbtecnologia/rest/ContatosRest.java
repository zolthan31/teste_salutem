package com.dhbtecnologia.rest;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhbtecnologia.domain.Contatos;

@RestController
@RequestMapping(value = "/contatos")
public class ContatosRest {
	
	@GetMapping
	public ResponseEntity<Contatos> findAll() {
		Contatos c = new Contatos(1l, "Fernanda", "98487-4876", "fernanda@gmail.com");
		return ResponseEntity.ok().body(c);
	}

}
