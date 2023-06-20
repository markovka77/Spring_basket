package com.course2.spring_basket;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


@Service

public class BasketService {


    private final BasketList basket;
    private BasketList basketList;

    public BasketService(BasketList basket) {
        this.basketList = basket;
        this.basket = basket;
    }


    public Collection addToBasket(List<Integer> artiqule) {
       basketList.basket.addAll(artiqule);
        return basketList.basket;
    }


    public Collection getBasket() {
        return basketList.basket.stream()
                .collect(Collectors.toList());
    }
}




