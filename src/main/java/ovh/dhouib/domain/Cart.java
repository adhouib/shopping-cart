package ovh.dhouib.domain;

import lombok.Getter;
import lombok.Setter;
import ovh.dhouib.domain.enums.ProductTypeEnum;

import java.math.BigDecimal;
import java.util.Map;

@Getter
@Setter
public class Cart {

    private Client client;
    private Map<ProductTypeEnum, Integer> products;
    private BigDecimal total;

    public Cart(Client client, Map<ProductTypeEnum, Integer> products) {
        this.client = client;
        this.products = products;
    }

}
