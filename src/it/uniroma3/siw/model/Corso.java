package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Corso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	private LocalDate dataInizio;
	private float durataMesi;
	
	//Tipo di Fetch LAZY in quanto gli studenti iscritti ad un corso potrebbero essere parecchi
	//e non è detto che io voglia accedere agli studenti nel momento in cui viene accesso un corso.
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Allievo> allievi;
	
	@ManyToOne()
	private Docente docente;
	
	public Corso(String nome, LocalDate dataInizio, float durataMesi, Docente docente) {
		super();
		this.nome = nome;
		this.dataInizio = dataInizio;
		this.durataMesi = durataMesi;
		this.docente = docente;
		this.allievi = new LinkedList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}

	public float getDurataMesi() {
		return durataMesi;
	}

	public void setDurataMesi(float durataMesi) {
		this.durataMesi = durataMesi;
	}

	public List<Allievo> getAllievi() {
		return allievi;
	}

	public void setAllievi(List<Allievo> allievi) {
		this.allievi = allievi;
	}
	
	

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Long getId() {
		return id;
	}	
}
