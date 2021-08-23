package com.guedesit.cidadesspring.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public  class Pais {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nome_pt")
	private String nome;
	
	private String sigla;
	
	@OneToMany(fetch = FetchType.EAGER)
	private List<Estado> estados;
	
	

	public Pais(String nome, String sigla) {
		super();
		this.nome = nome;
		this.sigla = sigla;
	}

	public Pais() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, sigla);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome) && Objects.equals(sigla, other.sigla);
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nome=" + nome + ", sigla=" + sigla + "]";
	}
	
	
	
}
