/**
 * 팩토리얼 결과 값 구하기
 * 4! = 24
 */

public class Algorithm_4_Factorial {
    public static void main(String[] args) {

        System.out.println(fac(6));

        int res = 1;
        for (int i = 1; i <= 6; i++){
            res *= i;
        }

        System.out.println(res);
    }

    public static int fac(int n){
        if(n <= 1){
            return n;
        }

        return fac(n-1) * n;
    }
}
