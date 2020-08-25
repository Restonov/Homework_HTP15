package by.restonov.shapes.creator;

import by.restonov.shapes.entity.Point;
import by.restonov.shapes.entity.impl.Cone;
import by.restonov.shapes.exception.DataReaderException;
import by.restonov.shapes.factory.ShapeFactory;
import by.restonov.shapes.factory.impl.ConeShapeFactory;
import by.restonov.shapes.parser.DataParser;
import by.restonov.shapes.reader.DataReader;

import java.util.ArrayList;
import java.util.List;

public class ConeListCreator {

    public List<Cone> createConeList(final String dataPath) {
        DataReader reader = new DataReader();
        DataParser parser = new DataParser();
        ShapeFactory factory = new ConeShapeFactory();
        ArrayList<Cone> cones = new ArrayList<>();
        List<String> dataForCones = new ArrayList<>();

        try {
            dataForCones = reader.readData(dataPath);
        } catch (DataReaderException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < dataForCones.size(); i++) {
            String inputData = dataForCones.get(i);
            double[] parsedData = parser.parseData(inputData);
            Cone cone = (Cone) factory.createShape("Cone" + i, i);

            Point baseCenter = new Point(parsedData[0], parsedData[1]);
            Point vertex = new Point(parsedData[2], parsedData[3]);
            double radius = parsedData[4];

            cone.setBaseCenter(baseCenter);
            cone.setVertex(vertex);
            cone.setRadius(radius);

            cones.add(cone);
        }
        return cones;
    }
}