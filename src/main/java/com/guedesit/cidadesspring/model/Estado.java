package com.guedesit.cidadesspring.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Estado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String uf;

	@ManyToOne
	@JoinColumn(name = "pais")
	private Pais pais;

	public Estado(String nome, String uf, Pais pais) {
		super();
		this.nome = nome;
		this.uf = uf;
		this.pais = pais;
	}

	public Estado() {
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

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, pais, uf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome) && Objects.equals(pais, other.pais)
				&& Objects.equals(uf, other.uf);
	}

	@Override
	public String toString() {
		return "Estado [id=" + id + ", nome=" + nome + ", uf=" + uf + ", pais=" + pais + "]";
	}

}
