package com.dhbtecnologia.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhbtecnologia.domain.Contatos;
import com.dhbtecnologia.repository.ContatosRepository;
import com.dhbtecnologia.service.exceptions.ResourceNotFoundException;

@Service
public class ContatosService {
	
	@Autowired
	private ContatosRepository repository;
	
	public List<Contatos> findAll() {
		return repository.findAll();	
	}
	
	public Contatos findById(Long id) {
		Optional<Contatos> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ResourceNotFoundException(id));
	}
	
	public Contatos insert(Contatos obj) {
		return repository.save(obj);
	}
	
	public Contatos update(Long id, Contatos obj) {
		if(!repository.existsById(id)) throw new EntityNotFoundException(
				"Contato não encontrado"
				);
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		Contatos obj = this.findById(id);
		repository.delete(obj);
	}

}
