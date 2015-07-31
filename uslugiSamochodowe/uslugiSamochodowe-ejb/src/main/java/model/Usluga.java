package model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typ_uslugi")
@Table(name = "usluga", schema = "uslugi_samochodowe")
public class Usluga {

	@Id
	@SequenceGenerator(name = "usluga_id_seq", sequenceName = "uslugi_samochodowe.usluga_id_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usluga_id_seq")
	@Column(name = "usluga_id")
	private long id;

	@Column(name = "nazwa")
	private String nazwa;

	@Column(name = "cena")
	private double cena;

	@ManyToOne
	@JoinColumn(name = "faktura_numer")
	private Faktura faktura;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public Faktura getFaktura() {
		return faktura;
	}

	public void setFaktura(Faktura faktura) {
		this.faktura = faktura;
	}

}
