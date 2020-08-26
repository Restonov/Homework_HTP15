package by.restonov.shapes.factory.impl;

import by.restonov.shapes.action.Calculation;
import by.restonov.shapes.entity.ShapeParameters;
import by.restonov.shapes.entity.impl.Cone;
import by.restonov.shapes.factory.ShapeParametersFactory;
import by.restonov.shapes.entity.impl.ConeParameters;

public class ConeParametersFactory implements ShapeParametersFactory {

    @Override
    public ShapeParameters createParameters(Cone cone) {
        ShapeParameters coneParameters = new ConeParameters();
        Calculation calculation = new Calculation();
        double square = calculation.square(cone);
        double volume = calculation.volume(cone);
        coneParameters.setSquare(square);
        coneParameters.setVolume(volume);
        return coneParameters;
    }
}
