package it.euschi.challengeordermanage.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "`order`")
public class Order {

    @ManyToOne
    private Client client;

    @Id
    private String id;

    @Column(nullable = false, unique = true, length = 50)
    private String code;

    private LocalDateTime confirmation;
}
