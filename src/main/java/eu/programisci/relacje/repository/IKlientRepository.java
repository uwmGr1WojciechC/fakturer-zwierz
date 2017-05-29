package eu.programisci.relacje.repository;


import eu.programisci.relacje.ob.KlientOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IKlientRepository extends JpaRepository<KlientOB,Long> {

}
