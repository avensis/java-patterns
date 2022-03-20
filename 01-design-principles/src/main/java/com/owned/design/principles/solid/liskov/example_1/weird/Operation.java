package com.owned.design.principles.solid.liskov.example_1.weird;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Operation {
    boolean validateSquareArea(SquareV1 square){
        if (square.getLength() != square.getWidth()){
            log.info("Not Liskov compliant");
            return false;
        } else {
            log.info(square.getArea());
            return true;
        }
    }
}
