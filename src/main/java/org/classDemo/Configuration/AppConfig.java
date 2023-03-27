package org.classDemo.Configuration;

import org.classDemo.Domain.User;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("bean1")
    public User method1(){
        return new User(101, "anu", "anu@123");
    };
    @Bean("bean2")
    public User method2(){
    User user=new User();
    user.setUserId(102);
    user.setUserName("Siva");
    user.setPassword("Shiva@123");
    return user;
    };
}
