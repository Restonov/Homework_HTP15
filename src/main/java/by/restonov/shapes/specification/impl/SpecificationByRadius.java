package by.restonov.shapes.specification.impl;

import by.restonov.shapes.entity.impl.Cone;
import by.restonov.shapes.specification.Specification;

public class SpecificationByRadius implements Specification {
    private double maxRadius;

    public SpecificationByRadius(double maxRadius) {
        this.maxRadius = maxRadius;
    }

    @Override
    public boolean specify(Cone cone) {
        double radius = cone.getRadius();
        return radius <= maxRadius;
    }
}
