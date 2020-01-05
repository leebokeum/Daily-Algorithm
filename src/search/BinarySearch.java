package search;

import java.util.ArrayList;
import java.util.List;

/**
 * 이진 검색
 * 정렬된 리스트의 속성을 이용한다는 특징이 있다.
 * O(n) 성능
 */
public class BinarySearch {
    public static void main(String[] args) {
        final List<Integer> numbers = new ArrayList<Integer>();
        final int value = 20;

        for(int i=10; i < 100; i++ ){
            numbers.add(i);
        }

        boolean result = binarySearch(numbers, value);
        System.out.println(String.valueOf(result));

    }

    public static boolean binarySearch(final List<Integer> numbers, final int value) {
        if(numbers == null || numbers.isEmpty()){
            return false;
        }

        final int comparison = numbers.get(numbers.size() / 2);

        if(value == comparison){
            return true;
        }

        if(value < comparison){
            return binarySearch(numbers.subList(0, numbers.size()/2), value);
        }else{
            return binarySearch(numbers.subList(numbers.size()/2 + 1, numbers.size()), value);
        }
    }
}
