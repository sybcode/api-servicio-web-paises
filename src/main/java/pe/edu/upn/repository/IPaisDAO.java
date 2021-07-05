package pe.edu.upn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upn.model.Pais;

@Repository
public interface IPaisDAO extends JpaRepository<Pais, Integer> {

	@Query("from Pais p where p.namePais like %:namePais%")
	List<Pais> buscarPais(@Param("namePais") String namePais);

}
