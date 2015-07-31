package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue(value = "naprawa")
public class Naprawa extends Usluga {

	@Enumerated(EnumType.STRING)
	private RodzajNaprawy rodzajNaprawy;

	public RodzajNaprawy getRodzajNaprawy() {
		return rodzajNaprawy;
	}

	public void setRodzajNaprawy(RodzajNaprawy rodzajNaprawy) {
		this.rodzajNaprawy = rodzajNaprawy;
	}

}
