package br.com.rotaract.secretaria.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reuniao")
@Entity

public class Reuniao{

	@Id
	@Column(name = "id_reuniao")
	private Long id;

	@Column(name = "data_reuniao")
	private LocalDateTime dataReuniao;

	@Column(name = "assunto")
	private String assunto;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "local")
	private String local;
	
	
	/*//ainda não possui projeto e convidado
	@OneToOne
	@JoinColumn(name = "id_projeto", nullable = false)
	private Projeto projeto;
 
	@OneToOne
	@JoinColumn(name = "id_convidado", nullable = false)
	private Convidado convidado;*/
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public LocalDateTime getDataReuniao() {
		return dataReuniao;
	}

	public void setDataReuniao(LocalDateTime dataReuniao) {
		this.dataReuniao = dataReuniao;
	}
	
	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
    
	/*public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	
	public Convidado getConvidado() {
		return convidado;
	}

	public void setConvidado(Convidado convidado) {
		this.convidado = convidado;
	}*/

	
}


     