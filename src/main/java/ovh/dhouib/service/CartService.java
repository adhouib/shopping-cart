package ovh.dhouib.service;

import ovh.dhouib.domain.Cart;

import java.math.BigDecimal;

public class CartService implements ICartService {

    @Override
    public void calculateTotal(Cart cart) {
        BigDecimal total = cart.getProducts().entrySet().stream()
                .map(entry -> {
                    Double price = switch (entry.getKey()) {
                        case HIGH_RANGE_PHONE -> cart.getClient().getHighPhonePrice();
                        case LOW_RANGE_PHONE -> cart.getClient().getLowPhonePrice();
                        case LAPTOP-> cart.getClient().getLaptopPrice();
                        default -> 0d;
                    };
                    return BigDecimal.valueOf(price).multiply(BigDecimal.valueOf(entry.getValue()));
                }).reduce(BigDecimal.ZERO, BigDecimal::add);


        cart.setTotal(total);
    }
}
