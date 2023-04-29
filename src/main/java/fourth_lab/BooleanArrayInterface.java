package fourth_lab;

public interface BooleanArrayInterface {
    void set(int index, boolean value);

    boolean get(int index);

    void setTrue(int index);

    void setFalse(int index);

    void invert(int index);

    int countTrue();

    String toString();
}
