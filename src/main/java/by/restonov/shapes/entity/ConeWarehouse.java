package by.restonov.shapes.entity;

import by.restonov.shapes.entity.impl.ConeParameters;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ConeWarehouse {
    private static ConeWarehouse instance;
    private static Map<Integer, ConeParameters> parametersMap = new HashMap<>();

    private ConeWarehouse() {
    }

    public static ConeWarehouse getInstance(){
        if (instance == null) {
            instance = new ConeWarehouse();
        }
        return instance;
    }

    public void put(Integer coneId, ConeParameters parameters) {
        parametersMap.put(coneId, parameters);
    }

    public void replace(Integer coneId, ConeParameters parameters) {
        parametersMap.replace(coneId, parameters);
    }

    public void remove(Integer coneId) {
        parametersMap.remove(coneId);
    }

    public ConeParameters get(Integer coneId) {
        return parametersMap.get(coneId);
    }

    public static Map<Integer, ConeParameters> getParametersMap() {
        return Collections.unmodifiableMap(parametersMap);
    }

}
