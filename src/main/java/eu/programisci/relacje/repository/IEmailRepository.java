package eu.programisci.relacje.repository;


import eu.programisci.relacje.ob.EmailOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmailRepository extends JpaRepository<EmailOB,Long> {

}
