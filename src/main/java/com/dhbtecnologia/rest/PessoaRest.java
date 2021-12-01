package com.dhbtecnologia.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhbtecnologia.domain.Pessoa;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaRest {
	
	@GetMapping
	public ResponseEntity<Pessoa> findAll() {
		Pessoa p = new Pessoa(1l, "Romulo", "28904604010","08/07/1978");
		return ResponseEntity.ok().body(p);
	}

}
