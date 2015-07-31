package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue(value = "serwis")
public class Serwis extends Usluga {

//	@OneToOne
//	@JoinColumn(name = "faktura_numer")
//	private Faktura faktura;

	@Enumerated(EnumType.STRING)
	private RodzajSerwisu rodzajSerwisu;

//	public Faktura getFaktura() {
//		return faktura;
//	}
//
//	public void setFaktura(Faktura faktura) {
//		this.faktura = faktura;
//	}

	public RodzajSerwisu getRodzajSerwisu() {
		return rodzajSerwisu;
	}

	public void setRodzajSerwisu(RodzajSerwisu rodzajSerwisu) {
		this.rodzajSerwisu = rodzajSerwisu;
	}

}
