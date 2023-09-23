package ru.sorokin.mytemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyTemplateApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MyTemplateApplication.class, args);
        context.close();
    }
}
