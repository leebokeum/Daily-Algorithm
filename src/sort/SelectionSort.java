package sort;

/**
 * 선택정렬
 * O(n2)
 * 재귀함수로
 *
 */

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr =  {3, 6, 2, 1, 8, 4};
        printArr(arr);
        selectionSort(arr, 0);
        printArr(arr);
    }

    public static void selectionSort(int[] arr, int start){
        if(start < arr.length-1){
            int min_index = start;
            for(int i= start; i < arr.length; i++){
                if(arr[i] < arr[min_index]){
                    min_index = i;
                }
            }
            swap(arr, start, min_index);
            selectionSort(arr, start+1);
        }
    }

    public static void printArr(int[] arr){
        for(int data : arr){
            System.out.print(data + ",");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

}


