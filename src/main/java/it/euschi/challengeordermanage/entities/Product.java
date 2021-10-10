package it.euschi.challengeordermanage.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Product {

    @OneToOne
    private StockInventory stockInventory;

    @ManyToOne
    private Order order;

    @Id
    private String id;

    @Column(nullable = false, unique = true, length = 50)
    private String code;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(length = 50)
    private String saller; //here better a relation with an entity named User or Seller, it depends on project structure needs
}
