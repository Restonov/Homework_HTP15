package by.restonov.shapes.repository;

import by.restonov.shapes.comparator.ConeComparator;
import by.restonov.shapes.entity.impl.Cone;
import by.restonov.shapes.specification.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConeRepository {
    private static ConeRepository instance;
    private List<Cone> repository = new ArrayList<>();

    private ConeRepository() {
    }

    public static ConeRepository getInstance(){
        if (instance == null) {
            instance = new ConeRepository();
        }
        return instance;
    }

    public List<Cone> sort(ConeComparator comparator) {
        repository.sort(comparator);
        return repository;
    }

    public List<Cone> query(Specification specification) {
        List<Cone> specifiedList;
        specifiedList = repository.stream().filter(specification::specify).collect(Collectors.toList());
        return specifiedList;
    }

    public void add(Cone cone) {
        repository.add(cone);
    }

    public void remove(Cone cone) {
        repository.remove(cone);
    }

    public void update(Cone cone) {
        if (!repository.contains((cone))) {
            repository.add(cone);
        }
    }
}
