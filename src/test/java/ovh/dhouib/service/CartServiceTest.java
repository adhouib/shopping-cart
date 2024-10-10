package ovh.dhouib.service;

import org.junit.jupiter.api.Test;
import ovh.dhouib.domain.Cart;
import ovh.dhouib.domain.Client;
import ovh.dhouib.domain.PersonalClient;
import ovh.dhouib.domain.ProfessionalClient;
import ovh.dhouib.domain.enums.ProductTypeEnum;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartServiceTest {

    public ICartService cartService = new CartService();

    @Test
    public void testCalculateTotalForPersonnalClient() {
        Client client = new PersonalClient("1", "Client", "user");

        Map<ProductTypeEnum, Integer> products = new HashMap<>();
        products.put(ProductTypeEnum.HIGH_RANGE_PHONE, 2);
        products.put(ProductTypeEnum.LOW_RANGE_PHONE, 3);
        products.put(ProductTypeEnum.LAPTOP, 2);

        Cart cart = new Cart(client, products);
        cartService.calculateTotal(cart);

        assertEquals((2 * 1500 ) + (3 * 800) + (2 * 1200), cart.getTotal().doubleValue());
    }

    @Test
    public void testCalculateTotalForProfessionalClient() {
        Client client = new ProfessionalClient("1", "Company Holding", "123456789",
                "FR12345678901",15_000_000d);

        Map<ProductTypeEnum, Integer> products = new HashMap<>();
        products.put(ProductTypeEnum.HIGH_RANGE_PHONE, 3);
        products.put(ProductTypeEnum.LOW_RANGE_PHONE, 4);
        products.put(ProductTypeEnum.LAPTOP, 10);

        Cart cart = new Cart(client, products);
        cartService.calculateTotal(cart);

        assertEquals((3 * 1000 ) + (4 * 550) + (10 * 900), cart.getTotal().doubleValue());
    }

    @Test
    public void testCalculateTotalForProfessionalClientSmallBuissiness() {
        Client client = new ProfessionalClient("1", "Small Company", "123456789",
                "FR12345678901", 1_500_000d);

        Map<ProductTypeEnum, Integer> products = new HashMap<>();
        products.put(ProductTypeEnum.HIGH_RANGE_PHONE, 2);
        products.put(ProductTypeEnum.LOW_RANGE_PHONE, 4);
        products.put(ProductTypeEnum.LAPTOP, 5);

        Cart cart = new Cart(client, products);
        cartService.calculateTotal(cart);

        assertEquals((2 * 1150 ) + (4 * 600) + (5 * 1000), cart.getTotal().doubleValue());
    }
}
