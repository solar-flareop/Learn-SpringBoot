package com.solarflare.spring_basics;

import org.springframework.stereotype.Component;

@Component
public class ChocolateFrosting implements Frosting{
    @Override
    public void getFrostingType() {
        System.out.println("Chocolate Frosting");
    }
}
