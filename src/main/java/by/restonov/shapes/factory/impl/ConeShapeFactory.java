package by.restonov.shapes.factory.impl;

import by.restonov.shapes.entity.impl.Cone;
import by.restonov.shapes.factory.ShapeFactory;

public class ConeShapeFactory implements ShapeFactory {

    @Override
    public Cone createShape(String name, int id) {
        return new Cone(name, id);
    }
}
