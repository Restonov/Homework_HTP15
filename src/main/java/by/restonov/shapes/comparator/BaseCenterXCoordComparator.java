package by.restonov.shapes.comparator;

import by.restonov.shapes.entity.Point;
import by.restonov.shapes.entity.impl.Cone;

import java.util.Comparator;

public class BaseCenterXCoordComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone cone1, Cone cone2) {
        Point baseCenter1 = cone1.getBaseCenter();
        Point baseCenter2 = cone2.getBaseCenter();
        double xCoord1 = baseCenter1.getXCoord();
        double xCoord2 = baseCenter2.getXCoord();

        if (xCoord1 > xCoord2) {
            return 1;
        }
        else if (xCoord1 < xCoord2) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
