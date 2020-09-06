package by.restonov.shapes.action;

import by.restonov.shapes.entity.Point;
import by.restonov.shapes.entity.Shape;
import by.restonov.shapes.entity.impl.Cone;
import by.restonov.shapes.entity.impl.TruncatedCone;

import java.awt.geom.Point2D;

public class Calculation {

    public double square(Cone cone) {
        double height = height(cone);
        double radius = cone.getRadius();
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)));
    }

    public double volume(Cone cone) {
        double height = height(cone);
        double radius = cone.getRadius();
        return Math.PI * Math.pow(radius, 2) * (height / 3);
    }

    public double volume (TruncatedCone truncatedCone) {
        double height = height(truncatedCone);
        double upperRadius = truncatedCone.getUpperRadius();
        double bottomRadius = truncatedCone.getBottomRadius();
        return ((Math.PI * height) / 3) * (Math.pow(upperRadius, 2) + upperRadius * bottomRadius + Math.pow(bottomRadius, 2));
    }

    public double height(Cone cone) {
        Point vertex = cone.getVertex();
        Point baseCenter = cone.getBaseCenter();
        double vertexXCoord = vertex.getXCoord();
        double vertexYCoord = vertex.getYCoord();
        double baseCenterXCoord = baseCenter.getXCoord();
        double baseCenterYCoord = baseCenter.getYCoord();
        return Point2D.distance(vertexXCoord, vertexYCoord, baseCenterXCoord, baseCenterYCoord);
    }

    public double height (TruncatedCone truncatedCone) {
        Point upperBaseCenter = truncatedCone.getUpperBaseCenter();
        Point bottomBaseCenter = truncatedCone.getBottomBaseCenter();
        double upperBaseCenterX = upperBaseCenter.getXCoord();
        double upperBaseCenterY = upperBaseCenter.getYCoord();
        double bottomBaseCenterX = bottomBaseCenter.getXCoord();
        double bottomBaseCenterY = bottomBaseCenter.getYCoord();
        return Point2D.distance(upperBaseCenterX, upperBaseCenterY, bottomBaseCenterX, bottomBaseCenterY);
    }

    public double volumesRatio(Cone cone, TruncatedCone truncatedCone) {
        double coneRadius = cone.getRadius();
        double truncatedConeRadius = truncatedCone.getBottomRadius();
        return 1 - Math.pow(coneRadius / truncatedConeRadius, 3);
    }

    public boolean findIsBaseCenterOnXAxis(Cone cone) {
        Point baseCenter = cone.getBaseCenter();
        double baseCenterYCoord = baseCenter.getYCoord();
        return baseCenterYCoord == 0.0;
    }

    public boolean checkIsShapeACone(Shape shape) {
        boolean flag = false;
        Point baseCenter = shape.getBaseCenter();
        Point vertex = shape.getVertex();
        double radius = shape.getRadius();
        if (baseCenter != null && vertex != null && radius != 0.0) {
            flag = true;
        }
        return flag;
    }
}
