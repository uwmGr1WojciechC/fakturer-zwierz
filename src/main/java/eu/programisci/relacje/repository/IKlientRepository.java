package eu.programisci.relacje.repository;


import eu.programisci.relacje.dto.ResponseDTO;
import eu.programisci.relacje.ob.KlientOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IKlientRepository extends JpaRepository<KlientOB,Long> {

    @Query("SELECT new eu.programisci.relacje.dto.ResponseDTO(k.id, k.imie, k.nazwisko, a.id, a.pelnyAdres) " +
            " FROM KlientOB k " +
            "LEFT JOIN k.adresy a " +
            "WHERE upper(a.pelnyAdres) LIKE upper(:partialAdres)")
    List<ResponseDTO> findKlientAndAdresByAdresContaining(@Param("partialAdres") String apartialAdres);
}
