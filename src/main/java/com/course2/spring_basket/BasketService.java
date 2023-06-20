package com.course2.spring_basket;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import static com.course2.spring_basket.BasketList.basket;

@Service
@Scope("Session")
public class BasketService {



    public static void addInBasket(String name,Integer id){
        basket.add(new Vegetables(name,id));

    }
    public static void getFromBasket(){
        basket.forEach(v->v.getName());

    }
}
