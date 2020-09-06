package by.restonov.shapes.entity;

public class IdGenerator {
    private static final int MIN_ID = 1;
    private static final int MAX_ID = 100000;
    private static int counter;

    public IdGenerator() {
        counter = MIN_ID;
    }

    public static int generateId() {
        counter++;
        if (MIN_ID + counter > MAX_ID) {
            counter = MIN_ID;
        }
        return counter;
    }
}
