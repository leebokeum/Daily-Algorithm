/*
    �Ǻ���ġ ���� �����
    an = a-1 + a-2

 */

public class Algorithm_3_Fibonacci {
    public static void main(String[] args) {
        //ù��° ���
        int a[] = new int[100];
        a[0] = 1;
        a[1] = 1;

        for (int i = 2; i < a.length; i++) {
            a[i] = a[i-1] + a[i-2];
        }

        for (int i: a) {
            System.out.printf("%d", i);
        }

        System.out.println("");
        
        //�ι�°���
        int pre = 1;
        int prepre =1;

        System.out.printf("%d", pre );
        System.out.printf("%d", prepre );
        for(int i =2; i<100; i++){
            int res = pre + prepre;
            System.out.printf("%d", res );
            prepre = pre;
            pre = res;
        }

    }
}
