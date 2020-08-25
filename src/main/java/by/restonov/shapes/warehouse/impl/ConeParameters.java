package by.restonov.shapes.warehouse.impl;

import by.restonov.shapes.warehouse.ShapeParameters;

public class ConeParameters implements ShapeParameters {
    private double volume;
    private double square;

    public ConeParameters() {
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConeParameters{");
        sb.append("volume=").append(volume);
        sb.append(", square=").append(square);
        sb.append('}');
        return sb.toString();
    }
}
