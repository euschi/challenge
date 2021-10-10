package it.euschi.challengeordermanage.services.implemented;

import it.euschi.challengeordermanage.entities.Order;
import it.euschi.challengeordermanage.exceptions.NotFoundException;
import it.euschi.challengeordermanage.repositories.OrderRepository;
import it.euschi.challengeordermanage.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public List<Order> findAllByClientId(String idClient) {
        List<Order> orders = orderRepository.findAllByClient_IdOrderByConfirmation(idClient);

        if (orders.isEmpty()) {
            throw new NotFoundException("Non sono stati trovati ordini per il cliente richiesto");
        } else {
            return orders;
        }
    }
}
