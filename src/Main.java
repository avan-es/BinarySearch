import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int arraySize = sc.nextInt();
        bs.createArray(arraySize);
        bs.display();
        System.out.println("Введите число для поиска в сформированном массиве:");
        int searchElement = sc.nextInt();
        bs.search(searchElement);
    }
}
