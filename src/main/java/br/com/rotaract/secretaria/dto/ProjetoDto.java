package br.com.rotaract.secretaria.dto;

import java.time.LocalDateTime;
import java.util.List;

import br.com.rotaract.secretaria.constant.AreaEnfoque;
import br.com.rotaract.secretaria.constant.Categoria;
import br.com.rotaract.secretaria.model.Instituicao;

public class ProjetoDto {

	private String nome;
	private String descricao;
	private Categoria categoria;
	private AreaEnfoque areaEnfoque;
	private LocalDateTime dataInicio;
	private LocalDateTime dataFinal;
	private List<PatrocinadorDto> patrocinadores;
	private List<Instituicao> instituicoes;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public AreaEnfoque getAreaEnfoque() {
		return areaEnfoque;
	}

	public void setAreaEnfoque(AreaEnfoque areaEnfoque) {
		this.areaEnfoque = areaEnfoque;
	}

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDateTime getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(LocalDateTime dataFinal) {
		this.dataFinal = dataFinal;
	}

	public List<PatrocinadorDto> getPatrocinadores() {
		return patrocinadores;
	}

	public void setPatrocinadores(List<PatrocinadorDto> patrocinadores) {
		this.patrocinadores = patrocinadores;
	}

	public List<Instituicao> getInstituicoes() {
		return instituicoes;
	}

	public void setInstituicoes(List<Instituicao> instituicoes) {
		this.instituicoes = instituicoes;
	}

}
