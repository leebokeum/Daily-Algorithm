package sort;

import java.util.Arrays;

public class SelectionSort2 {
    public static void main(String[] args) {
        int[] list = {1, 42, 2, 34, 43, 4, 66, 3, 6};

        int idxMin;
        int temp;

        for(int i=0; i < list.length-1; i++){ //회차
            System.out.println(i + "회차 :" );
            idxMin = i;
            for (int j=i+1; j < list.length; j++ ){
                if(list[idxMin] > list[j]){
                    idxMin = j;
                }
            }

            temp = list[idxMin];
            list[idxMin] = list[i];
            list[i] = temp;
            System.out.println(Arrays.toString(list));
        }

        System.out.println("최종 : " + Arrays.toString(list));
    }
}
