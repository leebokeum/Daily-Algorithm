public class Star {
    /**
     * �����
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * 1�� �����
         * *
         * **
         * ***
         * ****
         * *****
         */
        System.out.println("1�� �����");
        for(int i=0; i < 5; i++){
            for(int j=0; j<=i; j++){
                System.out.printf("%s", "*");
            }
            System.out.println();
        }

        /**
         * 2�� �����
         * *****
         * ****
         * ***
         * **
         * *
         */

        System.out.println("2�� �����");
        for(int i=0; i < 5; i++){
            for(int j=0; j<=4-i; j++){
                System.out.printf("%s", "*");
            }
            System.out.println();
        }
    }
}
