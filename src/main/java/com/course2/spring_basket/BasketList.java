package com.course2.spring_basket;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class BasketList {


    private List<Integer> basket = new ArrayList<>();

    public BasketList(List<Integer> basket) {
        this.basket = basket;
    }

    public List<Integer> getBasket() {
        return basket;
    }

    public  void setBasket(List<Integer> basket) {
        this.basket = basket;
    }
}
