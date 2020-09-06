package by.restonov.shapes.entity.impl;

import by.restonov.shapes.entity.Point;
import by.restonov.shapes.entity.Shape;
import by.restonov.shapes.observer.VertexObserver;

public class Cone implements Shape {
    private String name;
    private int coneId;
    private Point baseCenter;
    private Point vertex;
    private double radius;
    private double height;
    private VertexObserver observer = new VertexObserver();

    public Cone() {
    }

    public Cone(String name, int id) {
        this.name = name;
        this.coneId = id;
    }

    public Cone(Point baseCenter, Point vertex, double radius) {
        this.baseCenter = baseCenter;
        this.vertex = vertex;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return coneId;
    }

    public void setId(int id) {
        this.coneId = id;
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
        notifyObserver();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public void attach(VertexObserver observer) {
        this.observer = observer;
    }

    public void detach(VertexObserver observer) {
        this.observer = null;
    }

    private void notifyObserver() {
        observer.actionPerformed(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cone cone = (Cone) o;

        if (coneId != cone.coneId) return false;
        if (Double.compare(cone.radius, radius) != 0) return false;
        if (name != null ? !name.equals(cone.name) : cone.name != null) return false;
        if (baseCenter != null ? !baseCenter.equals(cone.baseCenter) : cone.baseCenter != null) return false;
        return vertex != null ? vertex.equals(cone.vertex) : cone.vertex == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + coneId;
        result = 31 * result + (baseCenter != null ? baseCenter.hashCode() : 0);
        result = 31 * result + (vertex != null ? vertex.hashCode() : 0);
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cone{");
        sb.append("name='").append(name).append('\'');
        sb.append(", id=").append(coneId);
        sb.append(", baseCenter=").append(baseCenter);
        sb.append(", vertex=").append(vertex);
        sb.append(", radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }
}
