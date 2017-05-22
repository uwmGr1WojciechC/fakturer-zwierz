package eu.programisci.app.towary.repository;


import eu.programisci.app.towary.ob.TowarOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITowarRepository extends JpaRepository<TowarOB,Long> {

}
