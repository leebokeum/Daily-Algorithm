public class Star {
    /**
     * º°Âï±â
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * 1¹ø º°Âï±â
         * *
         * **
         * ***
         * ****
         * *****
         */
        System.out.println("1¹ø º°Âï±â");
        for(int i=0; i < 5; i++){
            for(int j=0; j<=i; j++){
                System.out.printf("%s", "*");
            }
            System.out.println();
        }

        /**
         * 2¹ø º°Âï±â
         * *****
         * ****
         * ***
         * **
         * *
         */

        System.out.println("2¹ø º°Âï±â");
        for(int i=0; i < 5; i++){
            for(int j=0; j<=4-i; j++){
                System.out.printf("%s", "*");
            }
            System.out.println();
        }
    }
}
