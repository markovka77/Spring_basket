package com.course2.spring_basket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequestMapping(path = "/order")
@RestController

public class BasketController {

    @GetMapping(path = "/add")
    public Vegetables add(@RequestParam Integer id,
                          @RequestParam String name ){
        BasketService.addInBasket(name,id);
    return new Vegetables(name,id);
    }
    @GetMapping(path="/get")
    public List get(){
        BasketService.getFromBasket();
        return BasketList.basket;

    }
}
