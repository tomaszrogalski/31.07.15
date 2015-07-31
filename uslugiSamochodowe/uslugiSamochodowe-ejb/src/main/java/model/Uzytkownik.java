package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "uzytkownik", schema = "uslugi_samochodowe")
public class Uzytkownik {

	@Id
	@SequenceGenerator(name = "uzytkownik_id_seq", sequenceName = "uslugi_samochodowe.uzytkownik_id_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "uzytkownik_id_seq")
	@Column(name = "uzytkownik_id")
	private long id;

	@Column(name = "login")
	private String login;

	@Column(name = "haslo")
	private String haslo;

	@OneToOne(mappedBy = "uzytkownik")
	private Serwisant serwisant;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getHaslo() {
		return haslo;
	}

	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}

	public Serwisant getSerwisant() {
		return serwisant;
	}

	public void setSerwisant(Serwisant serwisant) {
		this.serwisant = serwisant;
	}

}
