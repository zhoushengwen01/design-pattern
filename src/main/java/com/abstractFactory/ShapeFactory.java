package com.abstractFactory;


import com.abstractFactory.colors.Color;
import com.abstractFactory.shaps.Circle;
import com.abstractFactory.shaps.Rectangle;
import com.abstractFactory.shaps.Shape;
import com.abstractFactory.shaps.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        throw new UnsupportedOperationException();
    }
}
