package by.restonov.shapes.action;

import by.restonov.shapes.entity.Point;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.awt.geom.Point2D;

public class Calculations {
    static Logger logger = LogManager.getLogger();

    public double findSquare(double height, double radius) {
        logger.log(Level.INFO, "Производится расчет площади фигуры");
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)));
    }

    public double findVolume(double height, double radius) {
        return Math.PI * Math.pow(radius, 2) * (height / 3);
    }

    public double findHeight (Point vertex, Point baseCenter) {
        return Point2D.distance(vertex.getXCoord(), vertex.getYCoord(), baseCenter.getXCoord(), baseCenter.getYCoord());
    }
}
