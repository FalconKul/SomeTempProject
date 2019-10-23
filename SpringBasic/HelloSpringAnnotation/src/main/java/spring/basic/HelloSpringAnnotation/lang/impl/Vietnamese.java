package spring.basic.HelloSpringAnnotation.lang.impl;

import spring.basic.HelloSpringAnnotation.lang.Language;

public class Vietnamese implements Language {

    @Override
    public String getGreeting() {
        return "Xin chào";
    }

    @Override
    public String getBye() {
        return "Tạm biệt";
    }
}
