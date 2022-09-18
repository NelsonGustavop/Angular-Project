package com.Slayer.Angular.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Slayer.Angular.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{
	
}
