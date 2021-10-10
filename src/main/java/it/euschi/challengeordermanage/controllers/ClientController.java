package it.euschi.challengeordermanage.controllers;

import it.euschi.challengeordermanage.dtos.ClientDto;
import it.euschi.challengeordermanage.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("client")
@CrossOrigin(origins = "http://localhost:3000")
public class ClientController {

    private final ClientService clientService;

    @GetMapping
    public List<ClientDto> getAllClients(){
        return clientService
            .getAllClients()
            .stream()
            .map(ClientDto::new)
            .collect(Collectors.toList());
    }
}
