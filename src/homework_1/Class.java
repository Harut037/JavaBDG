package homework_1;

public class Class {
    public static void main(String[] args) {

        // Group (Integer)
        // 1
        byte a = -111;
        byte b =  36;
        System.out.println(a);
        System.out.println(b);
        // 2
        short c = -743;
        short d = 2002;
        System.out.println(c);
        System.out.println(d);
        // 3
        int e = -847236588;
        int f = 94723287;
        System.out.println(e);
        System.out.println(f);
        // 4
        long g = -73923849009763L;
        long h = 2132234566757L;
        System.out.println(g);
        System.out.println(h);
        System.out.println("--------------------");

        // byte, short, int, long ( Min & Max values )
        // 5
        byte $min = -128;
        byte $max = 127;
        System.out.println($min);
        System.out.println($max);
        short _min = -32768;
        short _max = 32767;
        System.out.println(_min);
        System.out.println(_max);
        int min1 = -2147483648;
        int max1 = 2147483647;
        System.out.println(min1);
        System.out.println(max1);
        long min2 = -9_223_372_036_854_775_808L;
        long max2 = 9_223_372_036_854_775_807L;
        System.out.println(min2);
        System.out.println(max2);
        System.out.println("-------------------------");

        // Group (Floating point number)
        // 6
        float j = -8977.6F;
        float k = 37712722.9F;
        System.out.println(j);
        System.out.println(k);
        // 7
        double l = -87347379837.37;
        double m = 97321813723282323823.999;
        System.out.println(l);
        System.out.println(m);
        System.out.println("----------------------");

        // float և double ( Min & Max values )
        // 8
        float min3 = 1.40239846e-45F;
        float max3 = 3.40282347e38F;
        System.out.println(min3);
        System.out.println(max3);
        double $min2 = 4.9406564584124654e-324;
        double $max2 = 1.7976931348623157e308;
        System.out.println($min2);
        System.out.println($max2);

        // 9
        /* 12.345 և 3456․091 կտանք float
`          34.567839023 և 8923.1234857 կտանք double
         */
        System.out.println("---------------------");

        // Group (Character)
        // 10
        char n = '&';
        char o = '?';
        System.out.println(n);
        System.out.println(o);
        // 11.1
        char s = 77;  // M - ի կոդ
        char w = 109; // m - ի կոդ
        System.out.println(s);
        System.out.println(w);
        // 11.2
        char t = 0x0039; // 9 թվանշանի unicode
        System.out.println(t);
        System.out.println("--------------------------");

        // Group (Boolean)
        // 12
        boolean p = true;
        boolean q = false;
        System.out.println(p);
        System.out.println(q);

        // 13
//        int year = 201I; // error կտա, քանի որ տառ կա, int միայն ամբողջ թվեր է պարունակում
//        System.out.println(year);


    }
}