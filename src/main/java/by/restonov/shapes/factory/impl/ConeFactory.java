package by.restonov.shapes.factory.impl;

import by.restonov.shapes.entity.Shape;
import by.restonov.shapes.entity.impl.Cone;
import by.restonov.shapes.factory.ShapeFactory;

public class ConeFactory implements ShapeFactory {

    @Override
    public Shape createShape(String name, int id) {
        return new Cone(name, id);
    }
}
