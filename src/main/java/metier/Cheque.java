package metier;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe représentant un chèque. Elle a en attributs une id, une date d'envoi
 * et une date de reception.
 * 
 * @author Adminl
 *
 */
@Entity
@Table
public class Cheque {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;

	@Column
	private String sendDate;

	@Column
	private LocalDate receptionDate;

	/**
	 * Constructeur d'initialisation par défaut.
	 */
	public Cheque() {
		super();
	}

	/**Constructeur d'initialisation avec attributs.
	 * @param id
	 * @param sendDate
	 * @param receptionDate
	 */
	public Cheque(Integer id, String sendDate, LocalDate receptionDate) {
		super();
		this.id = id;
		this.sendDate = sendDate;
		this.receptionDate = receptionDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSendDate() {
		return sendDate;
	}

	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}

	public LocalDate getReceptionDate() {
		return receptionDate;
	}

	public void setReceptionDate(LocalDate receptionDate) {
		this.receptionDate = receptionDate;
	}

}
