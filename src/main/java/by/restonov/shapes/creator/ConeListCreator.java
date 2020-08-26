package by.restonov.shapes.creator;

import by.restonov.shapes.entity.Point;
import by.restonov.shapes.entity.impl.Cone;
import by.restonov.shapes.factory.ShapeFactory;
import by.restonov.shapes.factory.impl.ConeFactory;

import java.util.ArrayList;
import java.util.List;

public class ConeListCreator {
    private static final int BASE_CENTER_X = 0;
    private static final int BASE_CENTER_Y = 1;
    private static final int VERTEX_X = 2;
    private static final int VERTEX_Y = 3;
    private static final int RADIUS = 4;

    public List<Cone> createConeList(List<double[]> parsedData) {
        ShapeFactory factory = new ConeFactory();
        ArrayList<Cone> cones = new ArrayList<>();

        for (int i = 0; i < parsedData.size(); i++) {
            Cone cone = (Cone) factory.createShape("Cone" + i, i);
            double[] data = parsedData.get(i);

            Point baseCenter = new Point();
            baseCenter.setXCoord(data[BASE_CENTER_X]);
            baseCenter.setYCoord(data[BASE_CENTER_Y]);

            Point vertex = new Point();
            vertex.setXCoord(data[VERTEX_X]);
            vertex.setYCoord(data[VERTEX_Y]);

            double radius = data[RADIUS];

            cone.setBaseCenter(baseCenter);
            cone.setVertex(vertex);
            cone.setRadius(radius);

            cones.add(cone);
        }
        return cones;
    }
}