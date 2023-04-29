package fourth_lab;

public class Main {
    public static void main(String[] args) {
        BooleanArrayInterface boolArray = new BooleanArray();
        BooleanArrayInterface intArray = new IntArray();

        // Пример использования обеих реализаций
        boolArray.setTrue(10);
        intArray.setTrue(10);

        boolArray.setFalse(20);
        intArray.setFalse(20);

        boolArray.invert(30);
        intArray.invert(30);

        System.out.println("Boolean array countTrue: " + boolArray.countTrue());
        System.out.println("Int array countTrue: " + intArray.countTrue());

        System.out.println("Boolean array toString: " + boolArray.toString().substring(0, 50) + "...");
        System.out.println("Int array toString: " + intArray.toString().substring(0, 50) + "...");

        // Проверяем, что обе реализации ведут себя одинаково
        for (int i = 0; i < 1024; i++) {
            if (boolArray.get(i) != intArray.get(i)) {
                System.out.println("Mismatch at index " + i);
            }
        }

    }
}

