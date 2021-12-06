package com.dhbtecnologia.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhbtecnologia.domain.Pessoa;
import com.dhbtecnologia.repository.PessoaRepository;
import com.dhbtecnologia.service.exceptions.ResourceNotFoundException;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repository;
	
	public List<Pessoa> findAll() {
		return repository.findAll();
	}
	
	public Pessoa findById(Long id) {
		Optional<Pessoa> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ResourceNotFoundException(id));
	}
	
	public Pessoa insert(Pessoa obj) {
		return repository.save(obj);
	}
	
	public Pessoa update(Long id, Pessoa obj) {
		if (!repository.existsById(id)) throw new EntityNotFoundException(
				"Pessoa não encontrada"
				);
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		Pessoa obj = this.findById(id);
		repository.delete(obj);
	}

}
