package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Allievo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String cognome;
	
	@Column(nullable = false)
	private LocalDate dataNascita;
	@Column(nullable = false)
	private String luogoNascita;
	
	@Column(nullable = false)
	private int matricola;
	@Column(nullable = false)
	private String email;
	
	//Fetch type impostato su Eager in quanto è solo un'associazione per quanto 
	//non vogliamo sempre accedere la società, il caricamento di essa non risulta pesante per il sistema.
	@OneToOne(fetch = FetchType.EAGER)
	private Societa societa;
	
	//Il fetch e' impostato su LAZY in quanto non è detto che nel momento in cui accedo un allievo io voglia conoscere a priori i suoi corsi.
	//Cascade di nessun tipo in quanto i corsi non sono direttamente creati o modificati dagli studenti.
	@ManyToMany(mappedBy = "allievi", fetch = FetchType.LAZY)
	@Column(nullable = false)
	private List<Corso> corsi;

	public Allievo(String nome, String cognome, LocalDate dataNascita, String luogoNascita, int matricola, String email,
			Societa societa) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
		this.matricola = matricola;
		this.email = email;
		this.societa = societa;
		this.corsi = new LinkedList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Societa getSocieta() {
		return societa;
	}

	public void setSocieta(Societa societa) {
		this.societa = societa;
	}

	public List<Corso> getCorsi() {
		return corsi;
	}

	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}

	public Long getId() {
		return id;
	}
	
	
	
	
}
