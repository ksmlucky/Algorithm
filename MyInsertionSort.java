import java.util.ArrayList;
import java.util.Collections;

public class MyInsertionSort {
    public ArrayList<Integer> insertionSort(ArrayList<Integer> dataList) {
        for (int index = 0; index < dataList.size() - 1; index++) {
            for (int index2 = index + 1; index2 > 0; index2--) {
                if (dataList.get(index2) < dataList.get(index2 - 1)) {
                    Collections.swap(dataList, index2, index2 - 1);
                } else {
                    break;
                }
            }
        }
        return dataList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            testData.add((int) (Math.random() * 100));
        }
        System.out.println(testData);

        MyInsertionSort sort = new MyInsertionSort();
        sort.insertionSort(testData);

        System.out.println(testData);
    }
}
