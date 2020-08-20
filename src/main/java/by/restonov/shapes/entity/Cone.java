package by.restonov.shapes.entity;

import by.restonov.shapes.entity.api.Shape;
import java.util.Objects;

public class Cone implements Shape {
    private String name;
    private int id;
    private Point baseCenter;
    private Point vertex;
    private double radius;

    public Cone() {
    }

    public Cone(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Point getBaseCenter() {
        return baseCenter;
    }

    public void setBaseCenter(Point baseCenter) {
        this.baseCenter = baseCenter;
    }

    public Point getVertex() {
        return vertex;
    }

    public void setVertex(Point vertex) {
        this.vertex = vertex;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Cone{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cone)) return false;
        Cone cone = (Cone) o;
        return getId() == cone.getId() &&
                Objects.equals(getName(), cone.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId());
    }


}
