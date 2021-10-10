package it.euschi.challengeordermanage.controllers;

import it.euschi.challengeordermanage.dtos.OrderDto;
import it.euschi.challengeordermanage.exceptions.BadRequestException;
import it.euschi.challengeordermanage.repositories.ProductRepository;
import it.euschi.challengeordermanage.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("order")
@CrossOrigin(origins = "http://localhost:3000")
public class OrderController {

    private final OrderService orderService;
    private final ProductRepository productRepository;

    @GetMapping("by-client")
    public List<OrderDto> findAllByClientId(@RequestParam String idClient) {

        if (idClient.isBlank()) {
            throw new BadRequestException("Selezionare un cliente valido");
        }

        return orderService
            .findAllByClientId(idClient)
            .stream()
            .map(order -> new OrderDto(order, productRepository.findAllByOrder_Id(order.getId())))
            .collect(Collectors.toList());
    }
}
