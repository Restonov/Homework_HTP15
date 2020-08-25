package by.restonov.shapes.entity;

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
        if (Double.compare(point.xCoord, xCoord) != 0) return false;
        return Double.compare(point.yCoord, yCoord) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(xCoord);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(yCoord);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Point{");
        sb.append("xCoord=").append(xCoord);
        sb.append(", yCoord=").append(yCoord);
        sb.append('}');
        return sb.toString();
    }
}