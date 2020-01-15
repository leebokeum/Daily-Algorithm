package sort;

import java.util.Arrays;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] list = {42, 63, 2, 34, 43, 4, 66, 3, 1};

        for(int i=1; i < list.length; i++){ //회차
            System.out.print(i + "회차 :");
            for(int j=0; j < list.length-i; j++){
                if(list[j]>list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(list));
        }

        System.out.println("최종 : " + Arrays.toString(list));
    }
}
