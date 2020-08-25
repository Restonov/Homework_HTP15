package by.restonov.shapes.factory;

import by.restonov.shapes.entity.impl.Cone;
import by.restonov.shapes.warehouse.ShapeParameters;

public interface ShapeParametersFactory {
    ShapeParameters createParameters(Cone cone);
}
