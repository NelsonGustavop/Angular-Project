package com.Slayer.Angular.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Slayer.Angular.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{
	
}
