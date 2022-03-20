package com.owned.design.principles.solid.liskov.example_1.weird;

/**
 * TODO 16/03/22 Find a better example on Liskov
 */
public class RectangleV1 {

    private Integer length;
    private Integer width;

    RectangleV1(Integer length, Integer width) {
        this.length = length;
        this.width = width;
    }

    public Integer getLength() {
        return this.length;
    }

    public Integer getWidth() {
        return this.width;
    }

    public Integer getArea() {
        return this.length * this.width;
    }
}