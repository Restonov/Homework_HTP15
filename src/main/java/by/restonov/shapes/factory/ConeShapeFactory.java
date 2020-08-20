package by.restonov.shapes.factory;

import by.restonov.shapes.entity.Cone;
import by.restonov.shapes.entity.api.Shape;

public class ConeShapeFactory implements ShapeFactory {

    public Shape createShape() {
        return new Cone();
    }
}
