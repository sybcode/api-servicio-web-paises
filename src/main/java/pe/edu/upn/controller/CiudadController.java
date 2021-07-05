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

import pe.edu.upn.model.Ciudad;
import pe.edu.upn.service.ICiudadService;

@RestController
@RequestMapping("/ciudades")
public class CiudadController {

	@Autowired
	private ICiudadService cService;

	@PostMapping
	public void registrar(@RequestBody Ciudad c) {
		cService.insertar(c);
	}

	@PutMapping
	public void modificar(@RequestBody Ciudad c) {
		cService.insertar(c);
	}

	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		cService.eliminar(id);
	}

	@GetMapping
	public List<Ciudad> listar() {
		return cService.listar();

	}

	@PostMapping("/buscar")
	public List<Ciudad> buscar(@RequestBody Ciudad c) throws ParseException {

		List<Ciudad> listaCiudades;
		listaCiudades = cService.buscarCiudad(c.getNameCiudad());
		if (listaCiudades.isEmpty()) {

			listaCiudades = cService.buscarPais(c.getPais().getNamePais());
		}
		return listaCiudades;

	}

}
