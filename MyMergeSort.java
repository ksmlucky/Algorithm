import java.util.ArrayList;

public class MyMergeSort {

    // 정렬되지 않은 배열을 끝까지 분리하는 단계
    public ArrayList<Integer> mergeSplitFunc(ArrayList<Integer> dataList) {
        if (dataList.size() <= 1) {
            return dataList;
        }
        int medium = dataList.size() / 2;

        // 배열의 일부분을 인덱스 배열로 지칭을 해서 서브 배열로 빼오기 위함
        // 0부터 medium-1 인덱스 번호까지 해당 배열 아이템을 서브 배열로 추출
        ArrayList<Integer> leftArr = this.mergeSplitFunc(new ArrayList<Integer>(dataList.subList(0, medium)));
        // medium부터 끝 인덱스 번호까지 해당 배열 아이템을 서브 배열로 추출
        ArrayList<Integer> rightArr = this.mergeSplitFunc(new ArrayList<Integer>(dataList.subList(medium, dataList.size())));

        return mergeFunc(leftArr, rightArr);
    }

    public ArrayList<Integer> mergeFunc(ArrayList<Integer> leftList, ArrayList<Integer> rightList) {
        ArrayList<Integer> mergedList = new ArrayList<Integer>();
        int leftPoint = 0;
        int rightPoint = 0;

        // CASE1: left, right 둘 다 리스트에 데이터가 존재하는 경우
        while (leftList.size() > leftPoint && rightList.size() > rightPoint) {
            if (leftList.get(leftPoint) > rightList.get(rightPoint)) {
                mergedList.add(rightList.get(rightPoint));
                rightPoint += 1;
            } else {
                mergedList.add(leftList.get(leftPoint));
                leftPoint += 1;
            }
        }

        // CASE2: rightList에 데이터가 없는 경우
        // 위의 while문을 통과했기 때문에 leftList에 데이터가 있는 경우 = rightList에 데이터가 없는 경우
        while (leftList.size() > leftPoint) {
            mergedList.add(leftList.get(leftPoint));
            leftPoint += 1;
        }

        // CASE3: leftList에 데이터가 없는 경우
        while (rightList.size() > rightPoint) {
            mergedList.add(rightList.get(rightPoint));
            rightPoint += 1;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            testData.add((int) (Math.random() * 100));
        }

        MyMergeSort mergeSort = new MyMergeSort();

        System.out.println(mergeSort.mergeSplitFunc(testData));
    }
}
