package by.restonov.shapes.entity.impl;

import by.restonov.shapes.entity.Point;
import by.restonov.shapes.entity.Shape;

public class TruncatedCone implements Shape {
    private String name;
    private int truncatedConeId;
    private Point bottomBaseCenter;
    private Point upperBaseCenter;
    private double bottomRadius;
    private double upperRadius;
    private double height;

    public TruncatedCone() {
    }

    public TruncatedCone(String name, int truncatedConeId) {
        this.name = name;
        this.truncatedConeId = truncatedConeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return truncatedConeId;
    }

    public void setId(int id) {
        this.truncatedConeId = id;
    }

    public Point getBottomBaseCenter() {
        return bottomBaseCenter;
    }

    public void setBottomBaseCenter(Point bottomBaseCenter) {
        this.bottomBaseCenter = bottomBaseCenter;
    }

    public Point getUpperBaseCenter() {
        return upperBaseCenter;
    }

    public void setUpperBaseCenter(Point upperBaseCenter) {
        this.upperBaseCenter = upperBaseCenter;
    }

    public double getBottomRadius() {
        return bottomRadius;
    }

    public void setBottomRadius(double bottomRadius) {
        this.bottomRadius = bottomRadius;
    }

    public double getUpperRadius() {
        return upperRadius;
    }

    public void setUpperRadius(double upperRadius) {
        this.upperRadius = upperRadius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TruncatedCone that = (TruncatedCone) o;

        if (truncatedConeId != that.truncatedConeId) return false;
        if (Double.compare(that.bottomRadius, bottomRadius) != 0) return false;
        if (Double.compare(that.upperRadius, upperRadius) != 0) return false;
        if (Double.compare(that.height, height) != 0) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (bottomBaseCenter != null ? !bottomBaseCenter.equals(that.bottomBaseCenter) : that.bottomBaseCenter != null)
            return false;
        return upperBaseCenter != null ? upperBaseCenter.equals(that.upperBaseCenter) : that.upperBaseCenter == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + truncatedConeId;
        result = 31 * result + (bottomBaseCenter != null ? bottomBaseCenter.hashCode() : 0);
        result = 31 * result + (upperBaseCenter != null ? upperBaseCenter.hashCode() : 0);
        temp = Double.doubleToLongBits(bottomRadius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(upperRadius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TruncatedCone{");
        sb.append("name='").append(name).append('\'');
        sb.append(", truncatedConeId=").append(truncatedConeId);
        sb.append(", bottomBaseCenter=").append(bottomBaseCenter);
        sb.append(", upperBaseCenter=").append(upperBaseCenter);
        sb.append(", bottomRadius=").append(bottomRadius);
        sb.append(", upperRadius=").append(upperRadius);
        sb.append('}');
        return sb.toString();
    }
}
