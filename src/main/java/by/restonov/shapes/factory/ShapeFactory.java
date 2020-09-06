package by.restonov.shapes.factory;

import by.restonov.shapes.entity.Point;
import by.restonov.shapes.entity.Shape;

public interface ShapeFactory {

    Shape createShape(Point baseCenter, Point vertex, double radius);
}