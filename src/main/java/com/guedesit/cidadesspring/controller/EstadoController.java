package com.guedesit.cidadesspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guedesit.cidadesspring.model.Estado;
import com.guedesit.cidadesspring.repository.EstadoRepository;

@RestController
@RequestMapping("estados")
public class EstadoController {

	@Autowired
	private EstadoRepository estadoRepository;
	
	@GetMapping
	public List<Estado> index() {
		return (List<Estado>) estadoRepository.findAll();
	}
}
