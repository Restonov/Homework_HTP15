package by.restonov.shapes.entity;

import java.util.Objects;

public class Point {
    private double xCoord;
    private double yCoord;

    public Point() {
    }

    public Point(double xCoord, double yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public double getXCoord() {
        return xCoord;
    }

    public void setXCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    public double getYCoord() {
        return yCoord;
    }

    public void setYCoord(double yCoord) {
        this.yCoord = yCoord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.xCoord, xCoord) == 0 &&
                Double.compare(point.yCoord, yCoord) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCoord, yCoord);
    }

    @Override
    public String toString() {
        return "Point{" +
                "xCoord=" + xCoord +
                ", yCoord=" + yCoord +
                '}';
    }
}