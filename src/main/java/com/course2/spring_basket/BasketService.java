package com.course2.spring_basket;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;


@Service

public class BasketService {

    private BasketList basketList;

    public BasketService(BasketList basketList) {
        this.basketList = basketList;
    }

    public Collection addToBasket(List<Integer> basket) {
        basketList.setBasket(basket);
        return basketList.getBasket();
    }


    public Collection getBasket() {
        return basketList.getBasket();
    }


}




