public class BinarySearch {

    private int[] array;
    private int arraySize;

    //Создание и заполнение массива
    public int[] createArray (int size) {
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i*2;
        }
        arraySize = array.length;
        return array;
    }

    //Вывод массива
    public void display() {
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Индекс [" + i + "]: " + array[i]);
        }
    }

    //Бинарный поиск
    public void search (int element) {
        int lowerBound = 0; //Нижняя граница
        int upperBound = array.length - 1; //Верхняя граница (-1 т.к. индексация в массивах начинается с 0
        int correctIndex; //Индекс текущего элемента (середина в диапазоне)
        int steps = 0; //Количество шагов

        //Цикл поиска. До тех пор, пока нижняя граница не станет больше верхней границы
        while (lowerBound <= upperBound) {
            steps++;
            //Вычисление индекса текущего элемента
            correctIndex = (lowerBound + upperBound) / 2;
            System.out.println("Шаг " + steps + ". Диапазон поиска: [" + lowerBound + ";" + upperBound + "]. Середина: [" + correctIndex + "]." );
            //Вывод диапазона поиска
            displayNewDiapason(lowerBound, upperBound);
            //Проверка текущего (серединного) элемента на равенство искомому элементу, если элемент найдет - вывести результат и закончить поиск
            if (array[correctIndex] == element) {
                System.out.println("Искомый элемент " + element + " найден на позиции " + correctIndex + " за " + steps + " шагов.");
                System.out.println("При линейном поиске на это потребовалось бы " + (correctIndex + 1) + " шагов/шага.");
                return;
            }
            //Если текущей элемент меньше искомого элемента, то сдвинуть нижнюю границу наверх и прибавить 1 (это текущий элемент)
            if (array[correctIndex] < element) {
                lowerBound = correctIndex + 1;
            } else {
                //Иначе сдвинуть верхнюю границу вниз и вычесть 1 (это текущий элемент)
                upperBound = correctIndex - 1;
            }
        }
        System.out.println("Искомый элемент не найден.");
    }

    //Вывод массива с X по Y элемент
    private void displayNewDiapason(int lowerBound, int upperBound) {
        for (int i = lowerBound; i <= upperBound; i++) {
            System.out.println("Индекс [" + i + "]: " + array[i]);
        }
    }

}