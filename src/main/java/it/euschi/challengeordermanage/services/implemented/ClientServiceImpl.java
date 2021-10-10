package it.euschi.challengeordermanage.services.implemented;

import it.euschi.challengeordermanage.entities.Client;
import it.euschi.challengeordermanage.exceptions.NotFoundException;
import it.euschi.challengeordermanage.repositories.ClientRepository;
import it.euschi.challengeordermanage.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;


    @Override
    public List<Client> getAllClients() {
        List<Client> clients = clientRepository.findAll();

        if(clients.isEmpty()){
            throw new NotFoundException("Non ci sono clienti salvati");
        } else {
            return clients;
        }
    }
}
