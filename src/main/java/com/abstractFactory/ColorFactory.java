package com.abstractFactory;


import com.abstractFactory.colors.Blue;
import com.abstractFactory.colors.Color;
import com.abstractFactory.colors.Green;
import com.abstractFactory.colors.Red;
import com.abstractFactory.shaps.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }
}

