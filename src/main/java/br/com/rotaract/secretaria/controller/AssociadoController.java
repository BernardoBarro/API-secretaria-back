package br.com.rotaract.secretaria.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rotaract.secretaria.dto.AssociadoDto;
import br.com.rotaract.secretaria.dto.AssociadoEditDto;
import br.com.rotaract.secretaria.model.Associado;
import br.com.rotaract.secretaria.service.AssociadoService;

@RestController
@RequestMapping("/associado")
public class AssociadoController {
	
	@Autowired
	private AssociadoService service;

	@PostMapping
	public Associado createAssociado(@RequestBody @Valid AssociadoDto associadoDto) {
		
		return service.createAssociado(associadoDto);
	}
	
	@GetMapping
	public List<Associado> listAssociado() {
		
		return service.findAssociado();
		
	}
	
	@GetMapping("/{ri}")
	public Associado getAssociado(@PathVariable Long ri) {
		
		return service.findAssociado(ri);
		
	}
	
	@PutMapping("/{ri}")
	public Associado editAssociado(@PathVariable Long ri, 
			@RequestBody AssociadoEditDto associadoEditDto) {
		
		return service.updateAssociado(ri, associadoEditDto);
		
	}
	
}
