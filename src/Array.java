import java.util.Arrays;
import java.util.Scanner;

public class Array {
    private int[] intArray;
    private int n;
    Scanner sc = new Scanner(System.in);

    public Array(int size) {
        this.n = size;
        this.intArray = new int[n];
    }

    public void imp() {
        System.out.println("Введите элементы массива. Количество элементов: "+this.n);
        for (int i = 0; i < n; i++) {
            intArray[i] = sc.nextInt();
        }
    }
    public void exp(){
        System.out.print("Вывод элементов массива: ");
        for (int currentValue : intArray)
            System.out.print(currentValue + " ");
        System.out.print("\n");
    }
    public void sort(){
        Arrays.sort(intArray);
        System.out.print("Вывод элементов массива (отсортировано): ");
        for (int currentValue : intArray)
            System.out.print(currentValue + " ");
    }
}