package fourth_lab;

public class BooleanArray implements BooleanArrayInterface {
    private boolean[] array = new boolean[1024];

    @Override
    public void set(int index, boolean value) {
        if (index >= 0 && index < 1024) {
            array[index] = value;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public boolean get(int index) {
        checkIndex(index);
        return array[index];
    }

    @Override
    public void setTrue(int index) {
        set(index, true);
    }

    @Override
    public void setFalse(int index) {
        set(index, false);
    }

    @Override
    public void invert(int index) {
        checkIndex(index);
        array[index] = !array[index];
    }
    @Override
    public int countTrue() {
        int count = 0;
        for (boolean value : array) {
            if (value) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (boolean value : array) {
            sb.append(value ? '1' : '0');
        }
        return sb.toString();
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
    }
}
