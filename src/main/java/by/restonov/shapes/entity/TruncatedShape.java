package by.restonov.shapes.entity;

public interface TruncatedShape {
    public String getName();
    public void setName(String name);
    public int getId();
    public void setId(int id);
    public Point getBottomBaseCenter();
    public void setBottomBaseCenter(Point bottomBaseCenter);
    public Point getUpperBaseCenter();
    public void setUpperBaseCenter(Point upperBaseCenter);
    public double getBottomRadius();
    public void setBottomRadius(double bottomRadius);
    public double getUpperRadius();
    public void setUpperRadius(double upperRadius);
    public double getHeight();
    public void setHeight(double height);
}
