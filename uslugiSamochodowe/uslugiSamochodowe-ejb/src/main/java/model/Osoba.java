package model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typ_osoby")
@Table(name = "osoba", schema = "uslugi_samochodowe")
public class Osoba {

	@Id
	@SequenceGenerator(name = "osoba_id_seq", sequenceName = "uslugi_samochodowe.osoba_id_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "osoba_id_seq")
	@Column(name = "osoba_id")
	private long id;

	@Column(name = "imie")
	private String imie;

	@Column(name = "nazwisko")
	private String nazwisko;

	@Column(name = "pesel")
	private String pesel;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
}
