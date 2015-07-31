package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "faktura", schema = "uslugi_samochodowe")
public class Faktura {

	@Id
	@SequenceGenerator(name = "faktura_numer_seq", sequenceName = "uslugi_samochodowe.faktura_numer_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "faktura_numer_seq")
	@Column(name = "faktura_numer")
	private long numer;

	@OneToOne
	@JoinColumn(name = "serwisant_id")
	private Serwisant serwisant;

	@OneToOne(mappedBy = "faktura")
	private Serwis serwis;

	@OneToMany(mappedBy = "faktura")
	private List<Usluga> lista_uslug;

	public long getNumer() {
		return numer;
	}

	public void setNumer(long numer) {
		this.numer = numer;
	}

	public Serwisant getSerwisant() {
		return serwisant;
	}

	public void setSerwisant(Serwisant serwisant) {
		this.serwisant = serwisant;
	}

	public Serwis getSerwis() {
		return serwis;
	}

	public void setSerwis(Serwis serwis) {
		this.serwis = serwis;
	}

	public List<Usluga> getLista_uslug() {
		return lista_uslug;
	}

	public void setLista_uslug(List<Usluga> lista_uslug) {
		this.lista_uslug = lista_uslug;
	}

}
