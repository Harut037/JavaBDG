package homework_7;

import java.util.Scanner;

 public class StringUtil {
    public static void main(String[] args) {

        /* 1. Write a method that performs String concatenation with the given parameter:
         *  Same problem with StringBuilder.
         */
        concatenation();

        /* 2. Write a method that takes a String parameter and prints each empty character using a new line
         *  String Literal:
         */
        stringLiteral();

        // 3. Write a method (reverse) that reverses String.
        reverse();

        // 4 Write a method that checks how many times the token holder is found in the given text.
        System.out.println(countSubString("I am learning java in night", "in"));

        /* 5. Write a method that capitalizes text using String.
         *  Same problem with StringBuilder.
         */
        toUpperCase();

        /* 6. rite a method that reads a string of 20 characters from the console, prints it if the string
         *   the length is less than 20, then we must silence the line by writing the symbol "*" instead of less symbols.
         */
        append();

        // 7. Write a method that removes all "a" characters from the given text. Same problem with StringBuilder
        removeElementA("I am learning java now");

        // 8. Write a method that replaces all "a" symbols in the given text with "*" using String.
        aReplaceAsterisk("I am learning java now");

        // 9. Write a method that finds the longest word in the text, the words in the text are separated by trying:
        longestWorld("I am learning java now");

        // 10. Write a method that finds in which index the String c symbol was first encountered.
        indexOF("I am learning java now");

        /* 11. Write a method that finds and prints the substring from the beginning of
               the given string up to the nth index using String. Same problem with StringBuilder
         */
        printSubLine("I am learning java", 8 );
        printSubLine1(new StringBuilder("I am learning java"), 6);

        // 12. Write a method that checks if the given String parameter is empty and not null:
        checkString("");

        // 13. Write a method that splits the sentence by ',' and finds the longest word.
        longestWorldTwo("I, am, learning, java, now");
    }

    /**
     * Method give String's & StringBuilder's concatenation examples:
     */
    static void concatenation() {
        Scanner sc = new Scanner(System.in);
        ;
        System.out.print("Input parameters: ");
        System.out.print("Result: " + sc.next() + sc.next());
        System.out.println();
        System.out.print("Input parameters: ");
        System.out.print("Result: " + sc.nextInt() + sc.nextInt() + sc.next());
        System.out.println();
        System.out.print("Input parameters: ");
        System.out.print("Result: " + sc.next() + sc.nextInt() + sc.next());
        System.out.println();
        System.out.print("Input parameters: ");
        System.out.print("Result: " + sc.next() + sc.nextInt() + sc.nextInt() + sc.next());
        System.out.println();
//         Scanner ss = new Scanner(System.in);
//         StringBuilder s = new StringBuilder();
//         System.out.print("Input parameters: ");
//         System.out.print("Result: " + ss.next()+ ss.next());
//         System.out.println();
//         System.out.print("Input parameters: ");
//         System.out.print("Result: " + ss.nextInt() + ss.nextInt() +  ss.next());
//         System.out.println();
//         System.out.print("Input parameters: ");
//         System.out.print("Result: " + ss.next() + ss.nextInt() + ss.next());
//         System.out.println();
//         System.out.print("Input parameters: ");
//         System.out.print("Result: " + ss.next() + ss.nextInt() + ss.nextInt() + ss.next());
    }

    /**
     *
     */
    static void stringLiteral() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input parameters: ");
        System.out.println("Result: " + sc.next() + "\n\t\t" + sc.next() + "\n\t\t" + sc.next() + "\n\t\t" + sc.next());
        System.out.println();
    }

    /**
     * Method give reverse element
     */
    static void reverse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input parameters: ");
        StringBuilder sb = new StringBuilder(sc.next());
        System.out.println("Result: " + sb.reverse());
        System.out.println();
    }

    static void subString() {

    }

    /**
     * Method give upper case words
     */

    static void toUpperCase() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input parameters: ");
        String str = sc.next();
        System.out.println("Too upper case: " + str.toUpperCase());
        System.out.print("Input parameters: ");
        System.out.println();
        ;
//            StringBuilder builder = new StringBuilder();
//      for (int i = 0; i < builder.length(); i++) {
//          if (Character.isLowerCase(builder.charAt(i))){
//              builder.setCharAt(i, Character.toUpperCase(builder.charAt(i)));
//          }
//      }
    }

    /**
     * Method give append * in empty places
     */
    static void append() {
        Scanner sc = new Scanner(System.in);
        StringBuilder k = new StringBuilder(20);
        k = new StringBuilder(sc.next());
        for (int i = 0; i < k.length(); i++) {
            if (k.length() < 20) {
                k.append("*");
            }
        }
        System.out.print(k);
        System.out.println();
    }


    /**
     * Method give the longest world int the text
     * @return longest word in the text
     */
    static String longestWorld(String s) {
        String[] ss = s.split(" ");
        int max = ss[0].length();
        String l = ss[0];
        for (int i = 1; i < ss.length - 1; i++) {
            if (ss[i].length() > max) {
                max = ss[i].length();
                l = ss[i];
            }
        }
        System.out.println(l);
        System.out.println();
        return l;

    }

    /**
     * 'a' replace '*' in the text
     */
    static void aReplaceAsterisk(String s) {
        String[] ss = s.split(" ");
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'a') {
                s.replace('a', '*');

            }

        }
        System.out.println("Result: " + s.replace('a', '*') + ",");
        System.out.println();
    }

    /**
     * Remove 'a' element in the text
     */
    static void removeElementA(String s) {
        String[] ss = s.split(" ");
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'a') {
                s.replace('a', '"');

            }

        }
        System.out.println("Result: " + s.replace("a", "") + ",");
        System.out.println();

//        StringBuilder sbo = new StringBuilder("I am learning java now");
//        for (int i = 0; i < sbo.length() - 1; i++) {
//            if(sbo.charAt(i) == 'a'){
//                sbo =  sbo.deleteCharAt(i);
//            }
//        }
//        System.out.print(sbo + "," );
    }

    /**
     * The first element index
     */
    static void indexOF(String s) {
        String[] ss = s.split(" ");
        int index = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'a') {
                index = s.indexOf(s.charAt(i));
            }
        }
        System.out.println("Result: " + index);
        System.out.println();
    }

    /**
     * Checking String
     * @param name
     */
    static void checkString(String name) {
        if (!name.isEmpty() && name != null) {
            System.out.println("Result: " + name);
        } else {
            System.out.println("Result: " + "Is empty or null");
        }
        System.out.println();
    }

    /**
     * Method give the longest word in the text
     * @param s
     * @return String element
     */
    static String longestWorldTwo(String s) {
        String[] ss = s.split(", ");
        int max = ss[0].length();
        String l = ss[0];
        for (int i = 1; i < ss.length - 1; i++) {
            if (ss[i].length() > max) {
                max = ss[i].length();
                l = ss[i];
            }
        }
        System.out.println(l);
        System.out.println();
        return l;
    }

    /**
     * Method counts how many times, "token"  occurs in the text
     * @param line
     * @param token
     * @return
     */
    static int countSubString(String line, String token){
        return line.split(token).length - 1;
    }

    /**
     * Method finds and prints the substring from the beginning of the given string up to the nth index using String.
     * @param line
     * @param n
     */
    static void printSubLine(String line, int n){
        String s =  line.substring(0,n);
        System.out.println(s);
    }

    /**
     * Method finds and prints the substring from the beginning of the given string up to the nth index using String.
     * @param line
     * @param n
     */
    static void printSubLine1(StringBuilder line, int n){
        String k = line.substring(0,n);
        System.out.println(k);
    }

}




