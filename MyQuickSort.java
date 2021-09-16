import java.util.ArrayList;
import java.util.Arrays;

public class MyQuickSort {
    public ArrayList<Integer> quickSort(ArrayList<Integer> dataList) {
        if (dataList.size() <= 1) {
            return dataList;
        }
        int pivot = dataList.get(0);

        ArrayList<Integer> leftArr = new ArrayList<Integer>();
        ArrayList<Integer> rightArr = new ArrayList<Integer>();

        for (int i = 1; i < dataList.size(); i++) {
            if (dataList.get(i) > pivot) {
                rightArr.add(dataList.get(i));
            } else {
                leftArr.add(dataList.get(i));
            }
        }

        ArrayList<Integer> mergedArr = new ArrayList<Integer>();
        mergedArr.addAll(this.quickSort(leftArr));
        // mergedArr.add((pivot));
        mergedArr.addAll(Arrays.asList(pivot));
        mergedArr.addAll(this.quickSort(rightArr));

        return mergedArr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            testData.add((int) (Math.random() * 100));
        }

        MyQuickSort quickSort = new MyQuickSort();
        System.out.println(quickSort.quickSort(testData));
    }
}
