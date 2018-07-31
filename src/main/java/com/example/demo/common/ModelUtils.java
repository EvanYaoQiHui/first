package com.example.demo.common;

import com.example.demo.model.Foods;
import com.example.demo.model.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:Evan
 * @Date:2018/7/31 $time$
 * @Describe：$describe$
 * @Return:$returns$
 * @Param:$params$
 */
public class ModelUtils {

    public static List<Order> getOrder(){
        List<Order> list=new ArrayList<>();
        for (int i=0;i<2;i++){
            List<Order> list1=new ArrayList<>();
            List<Foods> list2=new ArrayList<>();

            Order order1=new Order();
            order1.setName("第1天计划");
            order1.setType("减肥");
            list1.add(order1);

            Foods food1=new Foods();
            food1.setId("2");
            food1.setName("双皮蛋");
            food1.setPrice(10.5);
            food1.setDescription("双皮蛋很好吃");
            food1.setIcon("http://localhost:8080");
            list2.add(food1);
            order1.setFoods(list2);
            list.add(order1);
        }
        return list;
    }
}
