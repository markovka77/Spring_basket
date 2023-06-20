package com.course2.spring_basket;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//@Scope(scopeName = "Prototype")
public class BasketList {


    List<Integer> basket = new ArrayList<>();


}
