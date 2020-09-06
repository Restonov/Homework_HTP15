package by.restonov.shapes.comparator;

import by.restonov.shapes.entity.Point;
import by.restonov.shapes.entity.impl.Cone;

import java.util.Comparator;

public enum ConeComparator implements Comparator<Cone> {

    FIRST_COORDINATE_X_POINT {
        @Override
        public int compare(Cone cone1, Cone cone2) {
            Point baseCenter1 = cone1.getBaseCenter();
            Point baseCenter2 = cone2.getBaseCenter();
            double xCoord1 = baseCenter1.getXCoord();
            double xCoord2 = baseCenter2.getXCoord();

            return Double.compare(xCoord1, xCoord2);
        }
    },
    ID {
        @Override
        public int compare(Cone cone1, Cone cone2) {
            int id1 = cone1.getId();
            int id2 = cone2.getId();

            return Integer.compare(id1, id2);
        }
    }
}
