package by.restonov.shapes.creator;

import by.restonov.shapes.entity.Cone;
import by.restonov.shapes.entity.Point;
import by.restonov.shapes.factory.ConeShapeFactory;
import by.restonov.shapes.factory.ShapeFactory;
import by.restonov.shapes.parser.DataParser;
import by.restonov.shapes.reader.DataReader;

import java.util.ArrayList;
import java.util.List;

public class ConeListCreator {
    DataReader reader = new DataReader();
    ShapeFactory factory = new ConeShapeFactory();
    DataParser parser = new DataParser();
    List<Cone> cones = new ArrayList<>();

    public List<Cone> createConeList(String dataPath) {
        List<String> dataForCones = new ArrayList<>();
        try {
            dataForCones = reader.readData(dataPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < dataForCones.size();) {
            double[] data = parser.parseData(dataForCones.get(i));
            Cone cone = (Cone) factory.createShape();
            cone.setName("Cone" + ++i);
            cone.setId(i);
            cone.setBaseCenter(new Point(data[0], data[1]));
            cone.setVertex(new Point(data[2], data[3]));
            cone.setRadius(data[4]);
            cones.add(cone);
        }
        return cones;
    }
}