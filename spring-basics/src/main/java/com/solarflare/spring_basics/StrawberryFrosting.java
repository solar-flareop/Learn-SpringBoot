package com.solarflare.spring_basics;

import org.springframework.stereotype.Component;

@Component
public class StrawberryFrosting implements Frosting{
    @Override
    public void getFrostingType() {
        System.out.println("Strawberry Frosting");
    }
}
