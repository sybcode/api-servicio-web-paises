package pe.edu.upn.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Ciudad")
public class Ciudad implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCiudad;

	@NotEmpty(message = "No puede estar vacío")
	@NotBlank(message = "No puede estar en blanco")
	@Column(name = "namePais", length = 60, nullable = false)
	private String nameCiudad;

	@NotNull
	@Column(name = "lengthCiudad")
	private String lengthCiudad;

	@ManyToOne
	@JoinColumn(name = "idPais", nullable = false)
	private Pais pais;

	public Ciudad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ciudad(int idCiudad,
			@NotEmpty(message = "No puede estar vacío") @NotBlank(message = "No puede estar en blanco") String nameCiudad,
			@NotNull String lengthCiudad, Pais pais) {
		super();
		this.idCiudad = idCiudad;
		this.nameCiudad = nameCiudad;
		this.lengthCiudad = lengthCiudad;
		this.pais = pais;
	}

	public int getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}

	public String getNameCiudad() {
		return nameCiudad;
	}

	public void setNameCiudad(String nameCiudad) {
		this.nameCiudad = nameCiudad;
	}

	public String getLengthCiudad() {
		return lengthCiudad;
	}

	public void setLengthCiudad(String lengthCiudad) {
		this.lengthCiudad = lengthCiudad;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
