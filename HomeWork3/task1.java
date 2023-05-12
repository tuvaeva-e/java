package HomeWork3;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Реализовать алгоритм сортировки слиянием.

public class task1 {
    public static void mergeSort(List<Integer> array) {
        if (array.size() > 1) {
            int middle = array.size() / 2;

            List<Integer> left = new ArrayList<>();
            for (int elem : array.subList(0, middle))
                left.add(elem);

            List<Integer> right = new ArrayList<>();
            for (int elem : array.subList(middle, array.size()))
                right.add(elem);

            mergeSort(left);
            mergeSort(right);

            int n, i, j;
            n = i = j = 0;

            while (i < left.size() && j < right.size()) {
                if (left.get(i) < right.get(j))
                    array.set(n++, left.get(i++));
                else
                    array.set(n++, right.get(j++));
            }

            while (i < left.size())
                array.set(n++, left.get(i++));

            while (j < right.size())
                array.set(n++, right.get(j++));
        }
    }

    public static List<Integer> makeRandomList(int arrayLength) {
        List<Integer> numbersList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++)
            numbersList.add(i, random.nextInt(101));
        return numbersList;
    }

    public static void main(String[] args) {
        List<Integer> list = makeRandomList(15);
        System.out.println("Исходный список:");
        System.out.println(list);

        mergeSort(list);
        System.out.println("Отсортированный список:");
        System.out.println(list);
    }
}
