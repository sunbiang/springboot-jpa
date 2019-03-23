package com.server.gks.controller;

import com.server.gks.entity.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Controller
public class UserController {

    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping("/hello")
    @ResponseBody
    private void hello(){
        User user = entityManager.find(User.class, 1L);
        System.out.println(user);

    }
}
