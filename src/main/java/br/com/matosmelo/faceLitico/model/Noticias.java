package br.com.matosmelo.faceLitico.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Noticias {
	@Id
	@GeneratedValue
	private Long id;
	private String tituloNoticia;
	@OneToOne
	private Litico litico;
	private String texto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Litico getLitico() {
		return litico;
	}

	public void setLitico(Litico litico) {
		this.litico = litico;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getTituloNoticia() {
		return tituloNoticia;
	}

	public void setTituloNoticia(String tituloNoticia) {
		this.tituloNoticia = tituloNoticia;
	}

}
