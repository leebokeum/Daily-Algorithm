package sort;

import java.util.Arrays;

/**
 * 삽입 정렬
 * 성능 : O(n2)
 */

public class InsertSort {
    public static void main(String[] args) {
        int[] list = {88, 42, 2, 34, 43, 4, 66, 3, 6, 1};

        int temp;
        int j;

        for(int i = 1; i < list.length; i++){ //회차
            System.out.println(Arrays.toString(list));
            temp = list[i];
            for( j=i-1; j>= 0 &&  list[j] > temp; j--){
                list[j+1] = list[j];
            }

            list[j+1] = temp;
        }

        System.out.println("최종 : " + Arrays.toString(list));

    }
}
