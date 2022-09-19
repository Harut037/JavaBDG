package homework_2;

public class Main1 {
    public static void main(String[] args) {

            hi(0, 6);
            hk();
            hl();
            hc('*');
            hf( 1.6F,  7.36F);
            text();
        }


        /**
         * Write a method which .has two input parameters type int and return 0.
         * @param a
         * @param b
         * @return
         */
        public static int hi (int a, int b) { // 1
            return 0;
        } // 1

        /**
         * Write a method which has not input parameters and returns nothing.
         */
        public static void hk (){ // 2
        }

        /**
         * Write a method which .has a boolean input parameters and print “Hello World”.
         * @return
         */
        public static  boolean hl (){ // 3
            System.out.println("Hello World");
            return true;
        }

        /**
         * Write a method which .has a char input parameter and return this input parameter.
         * @param a
         * @return
         */
        public static char hc ( char a){ // 4
            return a;
        }

        /**
         * Write a method which .has two float input parameters and return one of them.
         * @param a
         * @param b
         * @return
         */
        public static float hf (float a, float b){ // 5
            return a;
        }

        /**
         * Write a method which .has call itself inside body(recursion).
         */
        public static void text (){ // 6
            System.out.println("BDG");
            text();
        }


}
