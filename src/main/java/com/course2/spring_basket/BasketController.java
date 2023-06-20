package com.course2.spring_basket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;


@RequestMapping(path = "/order")
@RestController

public class BasketController  {
    private BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "/add")
    public void add(@RequestParam List<Integer> artiqule) {
       basketService.addToBasket(artiqule);

    }

    @GetMapping(path = "/get")
    public Collection get() {
        return basketService.getBasket();

    }


}


