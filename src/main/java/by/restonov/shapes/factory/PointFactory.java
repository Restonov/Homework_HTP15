package by.restonov.shapes.factory;

import by.restonov.shapes.entity.Point;

public class PointFactory {
    public Point createPoint(double xCoord, double yCoord) {
        return new Point(xCoord, yCoord);
    }
}
