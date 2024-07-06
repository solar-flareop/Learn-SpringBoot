package com.solarflare.spring_basics;

import org.springframework.stereotype.Component;

@Component
public class ChocolateSyrup implements Syrup{
    @Override
    public void getSyrupType() {
        System.out.println("Chocolate Syrup");
    }
}
