package com.guedesit.cidadesspring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.guedesit.cidadesspring.model.Pais;
import com.guedesit.cidadesspring.service.PaisService;

import javassist.NotFoundException;

@RestController
@RequestMapping("/paises")
public class PaisController {

	@Autowired
	private PaisService paisService;

	@GetMapping()
	public List<Pais> index() throws NotFoundException {
		return paisService.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity pais(@PathVariable Long id) {
		return paisService.findByID(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}
}
