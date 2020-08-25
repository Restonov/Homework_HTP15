package by.restonov.shapes.sorter;

import by.restonov.shapes.comparator.BaseCenterXCoordComparator;
import by.restonov.shapes.entity.impl.Cone;

import java.util.List;

public class ConeListSorter {

    public List<Cone> sort(List<Cone> coneList) {
        coneList.sort(new BaseCenterXCoordComparator());
        return coneList;
    }
}


