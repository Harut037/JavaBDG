package homework_5;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Java Statements

        // 1. Գրել method, որը ստուգում է տրված x ամբողջ թիվը զույգ է թե կենտ.
        Main a = new Main();
        a.number(3);


        // 2. Գրել method, որը ստուգում է տրված x ամբողջ թիվը դրական է թե բացասական.

        a.positiveOrNegativeOrZero(1);

        /* 3. Գրել method, որը ստուգում է տրված x ամբողջ թիվը ՝ կամ փոքր 8 ից և մեծ 5 ից
         *  Կամ փոքր 20 ից և մեծ 15 ից.
         */

        a.trueOrFalse(9);

        /* 4.Գրել method, որը ստուգում է տրվածղ ամբողջ թիվը կարող է բաժանվել 5-ի և 7-ի վրա
         *  առանց մնացորդի.
         */

        a.number2(105);

        //  5․ Գրել method, որը ստուգում է տրված եռանիշ թվի երկրորդ թվանշանը 7 է թե ոչ։

        a.isSecondNumber7(173);

        /* 6, Գրել method, որը ստուգում է (x,y) կորդինատներով կետը գտնվում է արդյոք K(0,5)
         * շրջանի մեջ թե ոչ։
         */

       a.round(5,0,0,4,11);

        // 7. Գրել method, որը գտնում է տրված 3 թվերից մեծագույնը։

        a.biggest(6,1,3);

        /* 8․ Գրե՛ք method, որը ստուգում է տրված տարին համարվում է արդյոք նահանջ։ (նահանջ
         *    է համարվում այն տարին որը բաժանվում է 4 և 400 բայց միևնույն ժամանակ չի
         *     բաժանվում 100-ի)
         */

        a.year(2004);

        // Java Loops

        // Loops

        // 1. Ինչ ավելացնենք ___ բաց թողնված դիրքում որ տպի 8 ․

        int f = 0;
        while (f++ < 10) {
            f = f + 7;
            break;
        }
        System.out.println(f);

        // 2. Գտնել սխալը և ուղղել․

        int x3 = 2;
        int y3 = 5;
        while (x3 < 10) {
            y3++;
            x3++;
        }

        int p = 15;
        while (p > 10) {
            p = --p;
        }
        System.out.println(p);

        // 3.Գրել method, որը console -ում տպում է 1 ից 200 թվերը․

        a.oneTo200(0);

        // 4.Գրել method, որը console -ում տպում է տրված թվի առաջին թվանշանը

        a.firstDigit(3432);

        /* 5. Տրված են int x5 = 1, int y5 = 0. Քանի դեռ x < 5 ից և y < 10 տպել x5+y5
         *   արտահայտությունը․
         *   Քանի որ գրած չէր ոնց են փոխվում, 3 դեպք եմ քննարկել։
         */

        a.firstCase(0,1);
        a.secondCase(1,0);
        a.thirdCase(1,0);

        // 6. Գրել method, որը console -ում տպում է քառակուսի, օգտագործեք * սիմվոլը։

        a.square(4);

         /* 7․ Գրել method, որը console -ից ստանում է N թիվը և հաշվում է [1-N] բոլոր 5 -ի բաժանվող
              թվերի գումարը։
         */

        a.divisibleOnFive();

        // 8. Գրել method, որը հաշվում է [1-N] բոլոր երկնիշ զույգ թվերի արտադրյալը։

        a.evenNumber();

        /* 9․ Գրել method, որը [1-N] հաջորդական թվերի մեջ գտնում է մեծագույն և փոքրագույն
              տարրերը և հաշվում նրանց թվաբանական միջինը։
         */

        a.theGreatestAndTheSmallest();

        /* 10․ Գրել method, որը ստանում է 5 - անիշ ամբողջ թիվ և հաշվում այդ թվի թվանշանների
       գումարը։
     */

       a.sumOfNumbers();
    }

    /**
     * Write a method that checks whether the given integer x is even or odd.
     * @param x
     */
    public void number(int x) {
        if (x % 2 == 1) {
            System.out.println("կենտ");
        } else {
            System.out.println("զույգ");
        }
    }

    /**
     * Write a method that checks whether the given integer x is positive or negative.
     * @param k
     */
    public void positiveOrNegativeOrZero(int k) {
        System.out.println((k > 0) ? "Positive" : (k < 0) ? "Negative" : "Zero");
    }

    /**
     * Write a method that checks if a given integer x is either less than 8 or greater than 5
     * Or smaller than 20 and larger than 15
     * @param l
     */
    public void trueOrFalse(int l) {
        if ((l > 5 && l < 8) || (l < 20 && l > 15)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    /**
     * Write a method that checks whether a given integer is divisible by 5 and 7
     * @param o
     */
    public void number2(int o) {
        if (o % 5 == 0 && o % 7 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    /**
     * Write a method that checks whether the second digit of a given three-digit number is 7 or not.
     * @param a
     */
    public void isSecondNumber7(int a) {
        if (a % 100 / 10 == 7) {
            System.out.println("Այո 7 է");
        } else {
            System.out.println("Ոչ 7 չէ");
        }
    }

    /**
     * Write a method that checks if the point with coordinates (x,y) is located in K(0,5)
     * in the district or not?
     * @param r
     * @param x0
     * @param y0
     * @param x1
     * @param y1
     */
    public void round(int r, int x0, int y0, int x1, int y1) {
        if (((x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0)) <= r * r) {
            System.out.println("Կետը գտնվում է");
        } else {
            System.out.println("Չի գտնվում");
        }
    }

    /**
     * Write a method that finds the largest of the given 3 numbers.
     * @param n
     * @param m
     * @param s
     */
    public void biggest(int n, int m, int s) {
        if (m > s && m > n) {
            System.out.println("m կլինի մեծագույնը ");
        } else {
            if (n > m && n > s) {
                System.out.println("n կլինի մեծագույնը");
            } else {
                System.out.println("s կլինի մեծագույնը");
            }
        }
    }

    /**
     * Write a method that checks whether the given year is considered a leap year. (a year that is divisible by 4 and 400 but
     * not at the same time is considered a leap year divisible by 100)
     * @param year
     */
    public void year(int year) {
        if (year % 4 == 0 && year % 400 == 0) {
            System.out.println("Նահանջ տարի");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Նահանջ տարի");
        } else {
            System.out.println("Նահանջ տարի չէ");
        }
    }

    /**
     * Write a method that prints the numbers 1 to 200 to the console.
     * @param x2
     */
    public void oneTo200(int x2) {
        for (x2 = 1; x2 <= 200; x2++) {
            System.out.print(x2 + ", ");
        }
        System.out.println();
    }

    /**
     * Write a method that prints the first digit of the given number in the console.
     * @param num
     * @return
     */
    public int firstDigit(int num) {
        while (num > 10) {
            num = num / 10;
            {
                if (num < 10) {
                    System.out.println(num);
                }
            }

        }
        return num;
    }

    /**
     * Given int x = 1, int y = 0. As long as x < 5 and y < 10 print the expression x+y:
     * @param x5
     * @param y5
     */
    public void firstCase(int x5, int y5) {
        while (x5++ < 5 && y5++ < 10) {
        }
        System.out.println(x5 + y5);
    }

    /**
     * Given int x = 1, int y = 0. As long as x < 5 and y < 10 print the expression x+y:
     * @param x6
     * @param y6
     */
    public void secondCase(int x6, int y6) {
        while (x6++ < 5 && y6 < 10) {
        }
        System.out.println(x6 + y6);
    }

    /**
     * Given int x = 1, int y = 0. As long as x < 5 and y < 10 print the expression x+y:
     * @param x7
     * @param y7
     */
    public void thirdCase(int x7, int y7) {
        while (x7 < 5 && y7++ < 10) {
        }
        System.out.println(x7 + y7);
    }

    /**
     * To write a method that prints a square in the console, use the * symbol.
     * @param ff
     */
    public void square(int ff) {
        for (int i = 0; i <= ff; i++) {
            for (int j = 0; j <= ff; j++) {
                if (i == 0 || j == 0 || i == ff || j == ff) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Write a method that receives the number N from the console and counts [1-N] all divisible by 5
     * the sum of the numbers.
     */
    public void divisibleOnFive() {
        Scanner sc = new Scanner(System.in);
        int nn = sc.nextInt();
        int sum1 = 0;
        int x = 0;
        for (x = 5; x <= nn; x++) {
            if (x % 5 == 0) {
                sum1 += x;
            }
        }
        System.out.println(sum1);
    }

    /**
     * Write a method that calculates the product of all two-digit even numbers [1-N].
     */
    public void evenNumber(){
        Scanner cs = new Scanner(System.in);
        int kk = cs.nextInt();
        int sum2 = 1;
        int x = 10;
        for(x = 10; x <= kk; x = x + 2 ){
            if(x % 2 == 0){
                sum2 *= x;
                if(kk > 100 || kk < 10){
                    System.out.println("Դուք անցել եք տրված սահմանը");
                    break;
                }
            }
        }
        System.out.println(sum2);
    }

    /**
     * Write a method that finds the largest and smallest number in [1-N] sequences
     * elements and calculates their arithmetic mean.
     */
    public void theGreatestAndTheSmallest(){
        Scanner sq = new Scanner(System.in);
        double first = 1;
        double last = sq.nextDouble();
        double result = (first + last) / 2;
        System.out.println(result);
    }

    /**
     * Write a method that receives a 5-digit integer and counts the digits of that number sum.
     */
    public void sumOfNumbers(){
        Scanner ss = new Scanner(System.in);
        int sum = ss.nextInt();
        System.out.println( (sum % 10) + (sum / 10 % 10) + (sum / 100 % 10) + (sum / 1000 % 10) + (sum / 10000 % 10) );
    }
}

