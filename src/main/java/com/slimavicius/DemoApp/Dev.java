package com.slimavicius.DemoApp;

import org.springframework.stereotype.Component;

@Component
public class Dev {

    Laptop laptop;

    public void build() {

        laptop.compile();
        System.out.println("Working on an Awesome project");
    }
}
