package it.euschi.challengeordermanage.dtos;

import it.euschi.challengeordermanage.entities.Client;
import lombok.Getter;
import lombok.Value;

@Value
@Getter
public class ClientDto {

    String id;
    String name;
    String email;

    public ClientDto(Client client){
        this.id = client.getId();
        this.name = client.getName();
        this.email = client.getEmail();
    }
}
