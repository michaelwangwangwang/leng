package com.example.leng.bean;


import java.io.Serializable;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Data
public class User implements Serializable {

    public String username;
    public String password;

}
