package it.euschi.challengeordermanage.repositories;

import it.euschi.challengeordermanage.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, String> {

}
