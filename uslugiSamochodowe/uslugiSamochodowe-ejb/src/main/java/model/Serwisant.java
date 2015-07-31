package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue(value = "serwisant")
public class Serwisant extends Osoba{

	@OneToOne
	@JoinColumn(name = "uzytkownik_id")
	private Uzytkownik uzytkownik;

	@OneToOne(mappedBy = "serwisant")
	private Faktura faktura;

	public Uzytkownik getUzytkownik() {
		return uzytkownik;
	}

	public void setUzytkownik(Uzytkownik uzytkownik) {
		this.uzytkownik = uzytkownik;
	}

	public Faktura getFaktura() {
		return faktura;
	}

	public void setFaktura(Faktura faktura) {
		this.faktura = faktura;
	}
}
