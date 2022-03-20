package com.owned.design.principles.solid.liskov.example_1.weird;

public final class SquareV1 extends RectangleV1 {
    public SquareV1(Integer lengthAndWidth) {
        super(lengthAndWidth, lengthAndWidth);
    }
}
