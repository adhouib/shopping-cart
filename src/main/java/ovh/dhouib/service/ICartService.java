package ovh.dhouib.service;

import ovh.dhouib.domain.Cart;

public interface ICartService {
    void calculateTotal(Cart cart);
}
