package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "samochod", schema = "uslugi_samochodowe")
public class Samochod {

	@Id
	@SequenceGenerator(name = "samochod_id_seq", sequenceName = "uslugi_samochodowe.samochod_id_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "samochod_id_seq")
	@Column(name = "samochod_id")
	private long Id;

	@Column(name = "nazwa")
	private String nazwa;

	@Column(name = "nrRejestarcyjny")
	private String nrRejestarcyjny;

	@Column(name = "pojemnosc")
	private double pojemnosc;

	@OneToOne
	@JoinColumn(name = "wlasciciel_id")
	private Wlasciciel wlasciciel;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getNrRejestarcyjny() {
		return nrRejestarcyjny;
	}

	public void setNrRejestarcyjny(String nrRejestarcyjny) {
		this.nrRejestarcyjny = nrRejestarcyjny;
	}

	public double getPojemnosc() {
		return pojemnosc;
	}

	public void setPojemnosc(double pojemnosc) {
		this.pojemnosc = pojemnosc;
	}

	public Wlasciciel getWlasciciel() {
		return wlasciciel;
	}

	public void setWlasciciel(Wlasciciel wlasciciel) {
		this.wlasciciel = wlasciciel;
	}

}
