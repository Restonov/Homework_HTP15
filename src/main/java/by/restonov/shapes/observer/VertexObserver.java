package by.restonov.shapes.observer;

import by.restonov.shapes.entity.impl.Cone;
import by.restonov.shapes.entity.impl.ConeParameters;
import by.restonov.shapes.entity.ConeWarehouse;
import by.restonov.shapes.factory.ShapeParametersFactory;
import by.restonov.shapes.factory.impl.ConeParametersFactory;

public class VertexObserver{

    public void actionPerformed(Cone cone) {
        ShapeParametersFactory factory = new ConeParametersFactory();
        ConeParameters parameters = (ConeParameters) factory.createParameters(cone);

        int coneId = cone.getId();

        ConeWarehouse warehouse = ConeWarehouse.getInstance();
        warehouse.replace(coneId, parameters);
    }
}
