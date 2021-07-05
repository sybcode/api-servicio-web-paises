package pe.edu.upn.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upn.model.Ciudad;
import pe.edu.upn.repository.ICiudadDAO;
import pe.edu.upn.service.ICiudadService;

@RestController
public class CiudadServiceImpl implements ICiudadService {

	@Autowired
	private ICiudadDAO dCiudad;

	@Override
	@Transactional
	public boolean insertar(Ciudad ciudad) {
		Ciudad objCiudad = dCiudad.save(ciudad);
		if (objCiudad == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	@Transactional
	public void eliminar(int idCiudad) {

		dCiudad.deleteById(idCiudad);

	}

	@Override
	public Optional<Ciudad> listarId(int idCiudad) {

		return dCiudad.findById(idCiudad);
	}

	@Override
	public List<Ciudad> listar() {
		return dCiudad.findAll();
	}

	@Override
	public List<Ciudad> buscarPais(String namePais) {
		return dCiudad.buscarPais(namePais);
	}

	@Override
	public List<Ciudad> buscarCiudad(String nameCiudad) {
		return dCiudad.buscarCiudad(nameCiudad);
	}

	@Override
	public List<Ciudad> findBylengthCiudad(String lengthCiudad) {
		return dCiudad.findBylengthCiudad(lengthCiudad);
	}

}
