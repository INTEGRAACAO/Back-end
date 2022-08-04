package com.gen.ProjetoIntegrador.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.gen.ProjetoIntegrador.model.Comentario;
import com.gen.ProjetoIntegrador.repository.ComentarioRepository;

@RestController
@RequestMapping ("/comentarios")
@CrossOrigin (origins = "*", allowedHeaders = "*")
public class ComentarioController {

	@Autowired
	private ComentarioRepository comentarioRepository;
	
	@GetMapping
	public ResponseEntity<List<Comentario>> getAll(){
		return ResponseEntity.ok(comentarioRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Comentario> getById(@PathVariable Long id){
		return comentarioRepository.findById(id).map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	
	@GetMapping("/comentario/{comentario}")
	public ResponseEntity <List<Comentario>> getByComentario(@PathVariable String comentario){
		return ResponseEntity.ok(comentarioRepository.findAllByComentarioContainingIgnoreCase(comentario));
	}
	
	@PostMapping
	public ResponseEntity<Comentario> post (@Valid @RequestBody Comentario comentario){
		return ResponseEntity.status(HttpStatus.CREATED).body(comentarioRepository.save(comentario));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Comentario> put (@PathVariable Long id, @Valid @RequestBody Comentario comentario){
		return comentarioRepository.findById(id).map(resposta -> ResponseEntity.status(HttpStatus.OK).body(comentarioRepository.save(comentario)))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		Optional<Comentario> comentario = comentarioRepository.findById(id);
		
		if(comentario.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		comentarioRepository.deleteById(id);
	}
}
