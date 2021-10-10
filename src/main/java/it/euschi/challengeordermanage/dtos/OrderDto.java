package it.euschi.challengeordermanage.dtos;

import it.euschi.challengeordermanage.entities.Order;
import it.euschi.challengeordermanage.entities.Product;
import lombok.Getter;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Value
@Getter
public class OrderDto {

    String id;
    String code;
    LocalDateTime confirmation;
    List<ProductDto> products;

    public OrderDto(Order order, List<Product> relatedProducts){
        this.id = order.getId();
        this.code = order.getCode();
        this.confirmation = order.getConfirmation();
        this.products = relatedProducts.stream().map(ProductDto::new).collect(Collectors.toList());
    }
}
