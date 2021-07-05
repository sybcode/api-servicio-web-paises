package pe.edu.upn.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Pais")
public class Pais implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPais;

	@NotEmpty(message = "No puede estar vacío")
	@NotBlank(message = "No puede estar en blanco")
	@Column(name = "namePais", length = 60, nullable = false)
	private String namePais;

	public Pais(int idPais,
			@NotEmpty(message = "No puede estar vacío") @NotBlank(message = "No puede estar en blanco") String namePais) {
		super();
		this.idPais = idPais;
		this.namePais = namePais;
	}

	public Pais() {
		super();
	}

	public int getIdPais() {
		return idPais;
	}

	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	public String getNamePais() {
		return namePais;
	}

	public void setNamePais(String namePais) {
		this.namePais = namePais;
	}

}
