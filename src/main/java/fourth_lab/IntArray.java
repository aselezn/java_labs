package fourth_lab;

public class IntArray implements BooleanArrayInterface {
    int[] array;

    public IntArray() {
        int tempsize = 32;
        this.array = new int[tempsize];
    }

    @Override
    public void set(int index, boolean value) {
        if (index >= 0 && index < 1024) {
            int indexArray = index / 32;
            int bitIndex = index % 32;
            int element = this.array[indexArray];
            int mask = 1 << bitIndex;
            if (value) {
                this.array[indexArray] = element | mask;
            } else {
                this.array[indexArray] = element & ~mask;
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public boolean get(int index) {
        checkIndex(index);
        int arrayIndex = index / 32;
        int bitIndex = index % 32;
        return (array[arrayIndex] & (1 << bitIndex)) != 0;
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
        int arrayIndex = index / 32;
        int bitIndex = index % 32;
        array[arrayIndex] ^= (1 << bitIndex);
    }

    @Override
    public int countTrue() {
        int count = 0;
        for (int value : array) {
            count += Integer.bitCount(value);
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1024; i++) {
            sb.append(get(i) ? '1' : '0');
        }
        return sb.toString();
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= 1024) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
    }
}
