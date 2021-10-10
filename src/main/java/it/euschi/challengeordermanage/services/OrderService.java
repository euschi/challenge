package it.euschi.challengeordermanage.services;

import it.euschi.challengeordermanage.entities.Order;

import java.util.List;
import java.util.UUID;

public interface OrderService {

    List<Order> findAllByClientId(String idClient);
}
