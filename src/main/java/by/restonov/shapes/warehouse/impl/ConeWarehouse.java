package by.restonov.shapes.warehouse.impl;

import by.restonov.shapes.entity.impl.Cone;
import by.restonov.shapes.factory.ShapeParametersFactory;
import by.restonov.shapes.factory.impl.ConeParametersFactory;
import by.restonov.shapes.warehouse.ShapeWarehouse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConeWarehouse implements ShapeWarehouse {
    private Map<Integer, ConeParameters> coneWarehouse = new HashMap<>();

    public void add(List<Cone> coneList) {
        for (Cone cone: coneList) {
            int coneId = cone.getId();
            ShapeParametersFactory factory = new ConeParametersFactory();
            ConeParameters coneParameters = (ConeParameters) factory.createParameters(cone);
            coneWarehouse.put(coneId, coneParameters);
        }
    }

    public void edit(Cone cone) {

    }
}
