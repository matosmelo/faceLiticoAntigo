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
	private Long positivo;
	private Long neutro;
	private Long negativo;
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	private String url;
	
	public Long getPositivo() {
		return positivo;
	}

	public void setPositivo(Long positivo) {
		this.positivo = positivo;
	}

	public Long getNeutro() {
		return neutro;
	}

	public void setNeutro(Long neutro) {
		this.neutro = neutro;
	}

	public Long getNegativo() {
		return negativo;
	}

	public void setNegativo(Long negativo) {
		this.negativo = negativo;
	}


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
