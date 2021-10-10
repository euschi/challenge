package it.euschi.challengeordermanage.dtos;

import it.euschi.challengeordermanage.entities.Product;
import lombok.Getter;
import lombok.Value;

@Value
@Getter
public class ProductDto {

    String id;
    String code;
    String name;
    String saller;

    public ProductDto(Product product){
        this.id = product.getId();
        this.code = product.getCode();
        this.name = product.getName();
        this.saller = product.getSaller();
    }
}
