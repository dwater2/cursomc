package com.dw.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw.cursomc.domain.Categoria;
import com.dw.cursomc.repositories.CategoriaRepository;
import com.dw.cursomc.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		}
}
