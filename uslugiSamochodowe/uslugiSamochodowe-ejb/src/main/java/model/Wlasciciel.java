package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue(value = "wlasciciel")
public class Wlasciciel extends Osoba {

	@OneToOne(mappedBy = "wlasciciel")
	private Samochod samochod;

	public Samochod getSamochod() {
		return samochod;
	}

	public void setSamochod(Samochod samochod) {
		this.samochod = samochod;
	}

}
