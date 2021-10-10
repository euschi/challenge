package it.euschi.challengeordermanage.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class StockInventory {

    @Id
    private String id;

    @Column(nullable = false)
    private Integer warehouseResidues;

}
