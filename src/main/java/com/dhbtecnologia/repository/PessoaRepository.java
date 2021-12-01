package com.dhbtecnologia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhbtecnologia.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
