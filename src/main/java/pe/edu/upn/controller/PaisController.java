package pe.edu.upn.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upn.model.Pais;
import pe.edu.upn.service.IPaisService;

@RestController
@RequestMapping("/paises")
public class PaisController {

	@Autowired
	private IPaisService pService;

	@PostMapping
	public void registrar(@RequestBody Pais p) {
		pService.insertar(p);
	}

	@PutMapping
	public void modificar(@RequestBody Pais p) {
		pService.insertar(p);
	}

	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		pService.eliminar(id);
	}

	@GetMapping
	public List<Pais> listar() {
		return pService.listar();

	}

	@PostMapping("/buscar")
	public List<Pais> buscar(@RequestBody Pais pa) throws ParseException {

		List<Pais> listaPaises;
		pa.setNamePais(pa.getNamePais());
		listaPaises = pService.buscarNombre(pa.getNamePais());
		return listaPaises;

	}

}
