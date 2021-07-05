package pe.edu.upn.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upn.model.Pais;

public interface IPaisService {

	public boolean insertar(Pais pais);

	public void eliminar(int idPais);

	public Optional<Pais> listarId(int idPais);

	List<Pais> listar();

	List<Pais> buscarNombre(String namePais);

}
