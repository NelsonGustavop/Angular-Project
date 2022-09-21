package com.Slayer.Angular.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Slayer.Angular.domain.Tecnico;
import com.Slayer.Angular.repositories.TecnicoRepository;
import com.Slayer.Angular.services.exceptions.ObjectNotFoundException;

@Service
public class TecnicoService {

	@Autowired
	private TecnicoRepository repository;

	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("object not found: "+id));
	}

	public List<Tecnico> findAll() {
		
		return repository.findAll();
	}
}
