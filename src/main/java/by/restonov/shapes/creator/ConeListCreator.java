package by.restonov.shapes.creator;

import by.restonov.shapes.entity.IdGenerator;
import by.restonov.shapes.entity.Point;
import by.restonov.shapes.entity.impl.Cone;
import by.restonov.shapes.factory.PointFactory;
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
        PointFactory pointFactory = new PointFactory();
        ShapeFactory shapeFactory = new ConeFactory();
        List<Cone> cones = new ArrayList<>();

        for (int i = 0; i < parsedData.size(); i++) {
            double[] data = parsedData.get(i);
            int id = IdGenerator.generateId();

            Point baseCenter = pointFactory.createPoint(data[BASE_CENTER_X], data[BASE_CENTER_Y]);
            Point vertex = pointFactory.createPoint(data[VERTEX_X], data[VERTEX_Y]);
            double radius = data[RADIUS];

            Cone cone = (Cone) shapeFactory.createShape(baseCenter, vertex, radius);
            cone.setName("Cone" + i);
            cone.setId(id);

            cones.add(cone);
        }
        return cones;
    }
}