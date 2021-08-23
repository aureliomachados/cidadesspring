package com.guedesit.cidadesspring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guedesit.cidadesspring.model.Pais;
import com.guedesit.cidadesspring.repository.PaisRepository;

import javassist.NotFoundException;

@Service
public class PaisService {

	@Autowired
	private PaisRepository paisRepository;

	public List<Pais> findAll() throws NotFoundException {
		return (List<Pais>) paisRepository.findAll();
	}

	public Optional<Pais> findByID(Long id) {
		return paisRepository.findById(id);
	}

	public void save(Pais pais) throws IllegalArgumentException {
		paisRepository.save(pais);
	}

	public void update(Pais pais) {
		paisRepository.save(pais);
	}

	public void delete(Pais pais) throws IllegalArgumentException {
		paisRepository.delete(pais);
	}
}
