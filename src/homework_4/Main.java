package Homework_4;

public class Main {
    public static void main(String[] args) {

        // Ստեղծել 2 փոփոխական(int a = 8, int b = 6), տպել console -ում հետևյալը․
        int a = 8;
        int b = 6;
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a - b);
        System.out.println(a % b);

        // Ստեղծել 2 փոփոխական(double c = 6.4, double d = 0.03), տպել console -ում հետևյալը.
        double c = 6.4;
        double d = 0.03;
        System.out.println(c + d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c - d);
        System.out.println(c % d);

        // Տպել console -ում հետևյալ արտահայտությունների պատասխանները`
        int x = 2 * ((5 + 3) * 4 - 8);
        int y =  2 * 5 + 3 * 4 - 8;
        System.out.println(x);
        System.out.println(y);

        // Ստեղծել 2 փոփոխական(int e = 10, int f = -88, boolean n1 = true), տպել console -ում հետևյալը․
        int e = 10;
        int f = -88;
        boolean n1 = true;
        System.out.println(-e);
        System.out.println(-f);
        System.out.println(+e);
        System.out.println(-e + 92);
        System.out.println(!n1);
        System.out.println(!(!n1));
        System.out.println(e++);
        System.out.println(--f);
        int k = 3;
        int l = ++k * 5 / k-- + --k;

        // Տպել console -ում հետևյալ արտահայտությունների պատասխանները`
        int x1 = (int)1.0;
        System.out.println(x1);
        short y1 = (short)1921222;
        System.out.println(y1);
        System.out.println(2147483647 + 1);
        long y2 = (x = 3);
        System.out.println(y2);
        boolean y3 = false;
        boolean x2 = (y3 = true);
        System.out.println(x2);

        // Ստեղծել 2 փոփոխական(int aa = 10, int bb = 20), տպել console -ում հետևյալը․
        int aa = 10;
        int bb = 20;
        System.out.println(aa < bb);
        System.out.println(aa <= bb);
        System.out.println(aa >= bb);
        System.out.println(aa > bb);


        // Գտնե և ուղղելլ սխալը․
        // 1
        float v = 2.1f;

        // 2
        byte x5 = 5;
        byte y5 = 10;
        int z5 = x5 + y5;

        // 3
        short x6 = 10;
        short y6 = 3;
        int z6 = x * y;

        // 4
        long x7 = 10L;
        int y7 = 5;
        y7 *= x7;

        /* 8,9 Հայտարարել երկու int տիպի փոփոխականներ, վերագրել 10 և 5 այնուհետև փոփոխականի արժեքները տեղերով
        *փոխել, փորձեք 8-րդ խնդիրը լուծել առանց երրորդ փոփոխական օգտագործելու։
         */
        int i = 5;
        i = i << 1; // կլինի 10
        int p = 10;
        p = p >> 1; // կլինի

        //  10 Գրել ծրագիր, որը հաշվում է 1-100 թվերի գումարը։ (ցիկլ չօգտագործել):
        // Դատարկ չթողնելու համար սենց գրեցի ))

         int first = 1;
         int length = 100;
         int s = (1 + 100) * 100 / 2;
        System.out.println(s);



        // Ստեղծել 2 փոփոխական(int a = 8, int b = 3), տպել console -ում հետևյալը․
        int a1 = 8;
        int b1 = 3;
        System.out.println(a1 & b1);
        System.out.println(a1 ^ b1 );
        System.out.println(a1 | b1);
        System.out.println(~ a1);
        System.out.println(true ||  (a < 4));
        System.out.println((b1 >= 6) || (++a1 <= 7));
        System.out.println((a1 < b1)? a1 : b1);
        System.out.println(b1^b1);

        // Տպել console -ում հետևյալը․
        System.out.println(10 << 2);
        System.out.println(-10 << 3);
        System.out.println(20 >> 2);
        System.out.println(15 >> 3);

        // Տրված փոփոխականը բազմապատկեք 8-ով և 16-ով առանց օգտագործելու *-նշանը։
        int q = 1;
        q = q << 3; // 8 անգամ կմեծանա
        System.out.println(q);
        int o = 1;
        o = o << 4; // 16 անգամ կմեծանա
        System.out.println(o);

        // 1 - A,D
        // 2 - A,B,D
        // 3 - F ?
        // 4 - B,C,D,F
        // 5 - C ?
        // 6 - F ?
        // 7 - D ?
        // 8 - B ?
        // 9 - F ?
        // 10 - D
        // 11 - A
        // 12 - D
        // 13 - A
        // 14 - C
        // 15 - E
        // 16 - D ?
        // 17 - D ?
        // 18 - A ?
        // 19 - D
        // 20 - B ?



    }

}





