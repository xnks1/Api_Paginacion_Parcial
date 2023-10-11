package com.utn.parcialDs.repositories;

import com.utn.parcialDs.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
    //metodo de query
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    //Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);
   // boolean existsByDni(String dni);

    //anotacion JPQL con parametros indexados
       // @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %?1% OR p.apellido LIKE %?1%")
//        List<Persona> serach(String filtro);





     //@Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %?filtro% OR p.apellido LIKE %?filtro%" )
     //List<Persona> search(@Param("filtro")String filtro);


   // @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %?filtro% OR p.apellido LIKE %?filtro%" )
    //Page<Persona> search(@Param("filtro")String filtro , Pageable pageable);


        @Query(value = "SELECT * FROM persona WHERE persona.nombre LIKE %?1% OR persona.apellido LIKE %?1%" ,  nativeQuery = true)
        List<Persona> searchNativo(@Param("filtro")String filtro);

    @Query(value = "SELECT * FROM persona WHERE persona.nombre LIKE %?1% OR persona.apellido LIKE %?1%" ,

            nativeQuery = true, countQuery = "SELECT COUNT(*) FROM persona" )


    Page<Persona>searchNativo(@Param("filtro")String filtro , Pageable pageable);








}
