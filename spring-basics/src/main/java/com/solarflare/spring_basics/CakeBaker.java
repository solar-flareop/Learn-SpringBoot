package com.solarflare.spring_basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {
    @Qualifier("strawberryFrosting")
    @Autowired
    Frosting frosting;

    @Qualifier("chocolateSyrup")
    @Autowired
    Syrup syrup;

    void bakeCake(){
        syrup.getSyrupType();
        frosting.getFrostingType();
    }
}
