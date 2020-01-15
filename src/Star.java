public class Star {
    /**
     * 별찍기
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * 1번 별찍기
         * *
         * **
         * ***
         * ****
         * *****
         */
        System.out.println("1번 별찍기");
        for(int i=0; i < 5; i++){
            for(int j=0; j<=i; j++){
                System.out.printf("%s", "*");
            }
            System.out.println();
        }

        /**
         * 2번 별찍기
         * *****
         * ****
         * ***
         * **
         * *
         */

        System.out.println("2번 별찍기");
        for(int i=0; i < 5; i++){
            for(int j=0; j<=4-i; j++){
                System.out.printf("%s", "*");
            }
            System.out.println();
        }
    }
}
