package it.euschi.challengeordermanage.repositories;

import it.euschi.challengeordermanage.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, String> {

    List<Order> findAllByClient_IdOrderByConfirmation(String id);

}
