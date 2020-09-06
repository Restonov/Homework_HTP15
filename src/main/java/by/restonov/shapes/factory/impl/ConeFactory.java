package by.restonov.shapes.factory.impl;

import by.restonov.shapes.entity.Point;
import by.restonov.shapes.entity.impl.Cone;
import by.restonov.shapes.factory.ShapeFactory;

public class ConeFactory implements ShapeFactory {

    @Override
    public Cone createShape(Point baseCenter, Point vertex, double radius) {
        return new Cone(baseCenter, vertex, radius);
    }
}
