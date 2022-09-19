package homework_6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Arrays arrays = new Arrays();

        // Write a method that prints the positive elements of an int[] n array:
        arrays.positiveElementsInArray();

        // Write a method that prints the elements of the short[] s array in reverse order:
        arrays.arrayReverseElements();

        // Write a method that finds and prints the largest element of the long[] l array:
        arrays.maximumElement();

        // Write a method that finds and prints the smallest element of the float[] f array:
        arrays.minimumElement();

        // Write a method that moves the elements of the int[] n array into the int[] m array.
        arrays.copyElements();

        /* Write a method that creates two arrays of the same size,
           adds the corresponding elements of the array and writes to the third array.
         */
        arrays.sumArrayElements();

        // Write a method that counts how many times the number k is found in the elements of the array.
        arrays.duplicateElements();

    }


    /**
     * Method give positive elements in array
     * @return num
     */
   public  int positiveElementsInArray() {
       System.out.print("Enter size of array: ");
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int[] n = new int[num];
       for (int i = 0; i < num ; i++) {
           System.out.print("Enter numbers" + (i + 1) + " " + "integer element: " );
           n[i] = sc.nextInt();
       }
       System.out.print("Positive elements: ");
        for (int i = 1; i < num; i++) {
            if (n[i] > 0) {
                System.out.print(n[i] + ", ");
            }
        }
        System.out.println("\n");
        return num;
    }


    /**
     * Method give reverse elements in array
     * @return num
     */
   public short arrayReverseElements() {
        System.out.print("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        short num = sc.nextShort();
        short[] s = new short[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter numbers" + (i + 1) + " " + "integer element: " );
            s[i] = sc.nextShort();
        }
        System.out.print("Reverse elements: ");
        for (int i = num - 1; i >= 0; i--) {
            System.out.print(s[i] + ", ");
        }
        System.out.println("\n");
        return  num;
    }

    /**
     * Method give max element in array
     * @return biggest
     */
    long maximumElement() {
        System.out.print("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long[] l = new long[num];
        for (int i = 0; i < num ; i++) {
            System.out.print("Enter number" + (i + 1) + " " + "integer element: ");
            l[i] = sc.nextLong();
        }
        System.out.print("Maximum element: ");
        long biggest = l[0];
        for (int i = 0; i < num; i++) {
            if (l[i] > biggest) {
                biggest = l[i];
            }
        }
        System.out.print("The biggest element: " + biggest);
        System.out.println("\n");
        return biggest;
    }

    /**
     * Method give min element in array
     * @return smallest
     */
    float minimumElement() {
        System.out.print("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        float[] f = new float[num];
        for (int i = 0; i < num ; i++) {
            System.out.print("Enter number" + (i + 1) + " " + "integer element: ");
            f[i] = sc.nextFloat();
        }
        float smallest = f[0];
        for (int i = 0; i < f.length; i++) {
            if (smallest > f[i]) {
               smallest = f[i];
            }
        }
        System.out.println("The smallest element: " + smallest);
        System.out.println();
        return smallest;
    }

    /**
     * Method give move from one array's elements to another array
     */
    void copyElements(){
        System.out.print("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] n = new int[num];
        for (int i = 0; i < num ; i++) {
            System.out.print("Enter numbers" + (i + 1) + " " + "integer element: " );
            n[i] = sc.nextInt();
        }
        System.out.print("Copy element: ");
        int m[] = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            m[i] = n[i];
            System.out.print(m[i] + ", ");
        }
        System.out.println("\n");
    }

    /**
     * Method give sum array elements
     */
    void sumArrayElements() {
        System.out.print("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] a = new int[num];
        int[] b = new int[num];
        System.out.println();
        System.out.println("The first array");
        for (int i = 0; i < num ; i++) {
            System.out.print("Enter numbers" + (i + 1) + " " + "integer element: " );
            a[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("The second array");
        for (int i = 0; i < num ; i++) {
            System.out.print("Enter numbers" + (i + 1) + " " + "integer element: ");
            b[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("The sum of array's elements: ");
        int[] c = new int[num];
        for (int i = 0; i < num; i++) {
            c[i] = a[i] + b[i];
            System.out.print(c[i] + ", ");
        }
        System.out.println("\n");
    }

    /**
     * Method give how many times the number k is found in the elements of the array in.
     * @return counter
     */
    int duplicateElements(){
        System.out.print("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Enter k number");
        int k = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num ; i++) {
            System.out.print("Enter numbers" + (i + 1) + " " + "integer element: " );
            arr[i] = sc.nextInt();
        }
        int counter = 0;
        for (int i = 0; i < num; i++) {
            if (k == arr[i]){
                counter++;
                }
            }
        System.out.println("Your k number matches the elements of the array: " + counter);
        return counter;
    }



}