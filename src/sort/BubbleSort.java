package sort;

import java.util.Arrays;

/**
 * ���� ����
 * ���� :
 */
public class BubbleSort {

    // ���� ���� �˰���
    public static void main(String[] args) {

        int[] number = {1, 42, 2, 34, 43, 4, 66, 3, 6};

        boolean swithed;
        do{
            swithed = false;
            for(int i= 0; i < number.length-1; i++){
                if(number[i] > number[i+1]){
                    int tmp = number[i+1];
                    number[i+1] = number[i];
                    number[i] = tmp;
                    swithed = true;
                }
            }

        }while (swithed);

        System.out.println(Arrays.toString(number));
    }
}
