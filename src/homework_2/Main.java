package homework_2;

        public class Main {
            public static void main(String[] args) {

                // Group (Integer)
                byte a = -111;  // 1
                byte b =  36;
                System.out.println(a);
                System.out.println(b);
                short c = -743; // 2
                short d = 2002;
                System.out.println(c);
                System.out.println(d);
                int e = -847236588; // 3
                int f = 94723287;
                System.out.println(e);
                System.out.println(f);
                long g = -73923849009763L; // 4
                long h = 2132234566757L;
                System.out.println(g);
                System.out.println(h);
                System.out.println("--------------------");

                // byte, short, int, long ( Min & Max values )
                byte $min = -128; // 5
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
                float j = -8977.6F; // 6
                float k = 37712722.9F;
                System.out.println(j);
                System.out.println(k);
                double l = -87347379837.37; // 7
                double m = 97321813723282323823.999;
                System.out.println(l);
                System.out.println(m);
                System.out.println("----------------------");

                // float և double ( Min & Max values )
                float min3 = 1.40239846e-45F; // 8
                float max3 = 3.40282347e38F;
                System.out.println(min3);
                System.out.println(max3);
                double $min2 = 4.9406564584124654e-324;
                double $max2 = 1.7976931348623157e308;
                System.out.println($min2);
                System.out.println($max2);

        /* 12.345 և 3456․091 կտանք float  // 9
`          34.567839023 և 8923.1234857 կտանք double
         */
                System.out.println("---------------------");

                // Group (Character)
                char n = '&'; // 10
                char o = '?';
                System.out.println(n);
                System.out.println(o);
                char s = 77;  // M - ի կոդ // 11.1
                char w = 109; // m - ի կոդ
                System.out.println(s);
                System.out.println(w);
                char t = 0x0039; // 9 թվանշանի unicode // 11.2
                System.out.println(t);
                System.out.println("--------------------------");

                // Group (Boolean)
                boolean p = true; // 12
                boolean q = false;
                System.out.println(p);
                System.out.println(q);

//                int year = 201I; // error կտա, քանի որ տառ կա, int միայն ամբողջ թվերի համար
//                System.out.println(year);

                // 14
                int aa = 7;
                long bb = aa;
                System.out.println(bb);

                // 15
                int myInt = 7; // 15
                double myDouble = myInt;
                System.out.println(myInt);

                // 16
                double dd = 9.78d;
                int ii = (int) dd;
                System.out.println(ii);

                //17
                int ff = 9999;
                byte gg = (byte) ff;
                System.out.println(gg);

                // 18
//                long max = 3123456789; // վերջում պետքա L ինի default - ը double
//                double d = 1000_.00; // _ սա պետքա չլիներ
//                char i = 'i';
//                char j = 'j';
//                char ij = i + j; // char - ի մեջ, միայն մեկ սիմվոլ
//                int 7a = 8; // variable - ը չի կարող թվով սկսվել
//                long h = h + 8; // տառ չի կարող լինել
//                int n,m = 11; m = n; // Variable 'n' might not have been initialized


            }
        }


