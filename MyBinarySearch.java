import java.util.ArrayList;
import java.util.Collections;

public class MyBinarySearch {
    public boolean searchFunc(ArrayList<Integer> dataList, Integer searchItem) {
        if (dataList.size() == 1 && searchItem == dataList.get(0)) {
            return true;
        }
        if (dataList.size() == 1 && searchItem != dataList.get(0)) {
            return false;
        }
        if (dataList.size() == 0) {
            return false;
        }

        int medium = dataList.size() / 2;

        if (searchItem == dataList.get(medium)) {
            return true;
        } else {
            if (searchItem < dataList.get(medium)) {
                return this.searchFunc(new ArrayList<Integer>(dataList.subList(0, medium)), searchItem);
            } else {
                return this.searchFunc(new ArrayList<Integer>(dataList.subList(medium, dataList.size())), searchItem);
            }
        }
    }

    public static void main(String[] args) {
        MyBinarySearch binarySearch = new MyBinarySearch();

        ArrayList<Integer> testData = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            testData.add((int) (Math.random() * 100));
        }
        Collections.sort(testData);

        System.out.println(testData);

        System.out.println(binarySearch.searchFunc(testData, 99));
    }
}
