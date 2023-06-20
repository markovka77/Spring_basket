package com.course2.spring_basket;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope("Session")
public class BasketList {


    static List<Vegetables>basket=new ArrayList<>();





}
