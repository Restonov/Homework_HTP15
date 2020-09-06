package by.restonov.shapes.entity;

import by.restonov.shapes.observer.VertexObserver;

public interface Shape {
    public String getName();
    public void setName(String name);

    public int getId();
    public void setId(int id);

    public Point getBaseCenter();
    public void setBaseCenter(Point baseCenter);

    public Point getVertex();
    public void setVertex(Point vertex);

    public double getRadius();
    public void setRadius(double radius);

    public void setHeight(double height);
    public double getHeight();

    public void attach(VertexObserver observer);
    public void detach(VertexObserver observer);
}
