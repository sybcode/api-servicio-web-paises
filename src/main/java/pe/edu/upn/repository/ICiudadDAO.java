package pe.edu.upn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upn.model.Ciudad;

@Repository
public interface ICiudadDAO extends JpaRepository<Ciudad, Integer> {

	@Query("from Ciudad c where c.pais.namePais like %:namePais%")
	List<Ciudad> buscarPais(@Param("namePais") String namePais);

	@Query("from Ciudad c where c.nameCiudad like %:nameCiudad%")
	List<Ciudad> buscarCiudad(@Param("nameCiudad") String nameCiudad);

	List<Ciudad> findBylengthCiudad(String lengthCiudad);
}
