package com.dhbtecnologia.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhbtecnologia.domain.Contatos;
import com.dhbtecnologia.service.ContatosService;

@RestController
@RequestMapping(value = "/contatos")
public class ContatosRest {
	
	@Autowired
	private ContatosService service;
	
	@GetMapping
	public ResponseEntity<List<Contatos>> findAll() {
		List<Contatos> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Contatos> findById(@PathVariable Long id) {
		Contatos obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
