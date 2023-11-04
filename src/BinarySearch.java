public class BinarySearch {

    private int[] array;
    private int arraySize;

    public int[] createArray (int size) {
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i*2;
        }
        arraySize = array.length;
        return array;
    }

    public void display() {
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Индекс [" + i + "]: " + array[i]);
        }
    }

    public void search (int element) {
        int lowerBound = 0;
        int upperBound = array.length - 1;
        int correctIndex;
        int steps = 0;

        while (lowerBound <= upperBound) {
            steps++;
            correctIndex = (lowerBound + upperBound) / 2;
            System.out.println("Шаг " + steps + ". Диапазон поиска: [" + lowerBound + ";" + upperBound + "]. Середина: [" + correctIndex + "]." );
            displayNewDiapason(lowerBound, upperBound);
            if (array[correctIndex] == element) {
                System.out.println("Искомый элемент " + element + " найден на позиции " + correctIndex + " за " + steps + " шагов.");
                System.out.println("При линейном поиске на это потребовалось бы " + (correctIndex + 1) + " шагов/шага.");
                return;
            }
            if (array[correctIndex] < element) {
                lowerBound = correctIndex + 1;
            } else {
                upperBound = correctIndex - 1;
            }
        }
        System.out.println("Искомый элемент не найден.");
    }

    private void displayNewDiapason(int lowerBound, int upperBound) {
        for (int i = lowerBound; i <= upperBound; i++) {
            System.out.println("Индекс [" + i + "]: " + array[i]);
        }
    }

}