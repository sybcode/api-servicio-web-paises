package pe.edu.upn.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upn.model.Ciudad;

public interface ICiudadService {

	public boolean insertar(Ciudad ciudad);

	public void eliminar(int idCiudad);

	Optional<Ciudad> listarId(int idCiudad);

	List<Ciudad> listar();

	List<Ciudad> buscarPais(String namePais);

	List<Ciudad> buscarCiudad(String nameCiudad);

	List<Ciudad> findBylengthCiudad(String lengthCiudad);
}
