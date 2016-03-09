package br.com.matosmelo.faceLitico.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Litico {
	@Id
	@GeneratedValue
	private Long id;
	private String cargo;
	private String nome;
	private String partido;
	private String localFisicoTabalho;
	private String estado;
	private String cidade;
	private String cargosAnteriores;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "noticias_id")
	private Collection<Noticias> noticias;

	public Collection<Noticias> getNoticias() {
		return noticias;
	}

	public void setNoticias(Collection<Noticias> noticias) {
		this.noticias = noticias;
	}

	public String getCargosAnteriores() {
		return cargosAnteriores;
	}

	public void setCargosAnteriores(String cargosAnteriores) {
		this.cargosAnteriores = cargosAnteriores;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPartido() {
		return this.partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String getLocalFisicoTabalho() {
		return this.localFisicoTabalho;
	}

	public void setLocalFisicoTabalho(String localFisicoTabalho) {
		this.localFisicoTabalho = localFisicoTabalho;
	}
}
