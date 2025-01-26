package com.slimavicius.DemoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    private Computer comp;

    @Autowired
    public void setLaptop(Laptop laptop) {
        this.comp = laptop;
    }
    public void build() {

        comp.compile();
        System.out.println("Working on an Awesome project");
    }
}
