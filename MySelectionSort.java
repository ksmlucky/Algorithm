import java.util.ArrayList;
import java.util.Collections;

public class MySelectionSort {
    public ArrayList<Integer> selectionSort(ArrayList<Integer> dataList) {
        int lowest;
        for (int stand = 0; stand < dataList.size() - 1; stand++) {
            lowest = stand;
            for (int index = stand + 1; index < dataList.size(); index++) {
                if (dataList.get(lowest) > dataList.get(index)) {
                    lowest = index;
                }
            }
            Collections.swap(dataList, lowest, stand);
        }

        return dataList;
    }
    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            testData.add((int) (Math.random() * 100));
        }
        System.out.println(testData);

        MySelectionSort sort = new MySelectionSort();
        sort.selectionSort(testData);

        System.out.println(testData);
    }
}
