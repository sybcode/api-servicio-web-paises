package pe.edu.upn.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.model.Pais;
import pe.edu.upn.repository.IPaisDAO;
import pe.edu.upn.service.IPaisService;

@Service
public class PaisServiceImpl implements IPaisService {

	@Autowired
	private IPaisDAO dPais;

	@Override
	@Transactional
	public boolean insertar(Pais pais) {
		Pais objPais = dPais.save(pais);
		if (objPais == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	@Transactional
	public void eliminar(int idPais) {

		dPais.deleteById(idPais);

	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Pais> listarId(int idPais) {
		return dPais.findById(idPais);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Pais> buscarNombre(String namePais) {

		return dPais.buscarPais(namePais);

	}

	@Override
	@Transactional(readOnly = true)
	public List<Pais> listar() {
		return dPais.findAll();
	}

}
