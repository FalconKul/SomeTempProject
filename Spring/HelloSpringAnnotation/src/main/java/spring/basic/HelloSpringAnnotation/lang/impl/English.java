package spring.basic.HelloSpringAnnotation.lang.impl;

import spring.basic.HelloSpringAnnotation.lang.Language;

public class English implements Language {

    @Override
    public String getGreeting() {
        return "Hello";
    }

    @Override
    public String getBye() {
        return "Bye bye~";
    }
}
