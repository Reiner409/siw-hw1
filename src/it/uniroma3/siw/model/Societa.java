package it.uniroma3.siw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Societa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String ragioneSociale;
	
	
	//IndirizzoSede
	private int numeroCivico;
	private int cap;
	private String via;
	private String comune;
	private String provincia;
	
	private int numeroTelefono;

	public Societa(String ragioneSociale, int numeroCivico, int cap, String via, String comune, String provincia,
			int numeroTelefono) {
		super();
		this.ragioneSociale = ragioneSociale;
		this.numeroCivico = numeroCivico;
		this.cap = cap;
		this.via = via;
		this.comune = comune;
		this.provincia = provincia;
		this.numeroTelefono = numeroTelefono;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public int getNumeroCivico() {
		return numeroCivico;
	}

	public void setNumeroCivico(int numeroCivico) {
		this.numeroCivico = numeroCivico;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public Long getId() {
		return id;
	}
	
	
}
