package com.example.demo.controller;

import com.example.demo.common.ModelUtils;
import com.example.demo.model.Order;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:Evan
 * @Date:2018/7/31 $time$
 * @Describe：$describe$
 * @Return:$returns$
 * @Param:$params$
 */
@RestController
public class OrderController {

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable int id){
        List<Order> list=ModelUtils.getOrder();
        list.remove(id);
    }
}
