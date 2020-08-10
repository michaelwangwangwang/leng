package com.example.leng.controller;


import com.example.leng.bean.User;
import com.example.leng.dao.MainDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private MainDao dao;

    @PostMapping("/login")
    @ResponseBody
    public boolean login(@RequestBody User u){
        if(dao.select(u.username).password.equals(u.password)){
            return true;
        }
        return false;

    }

}
