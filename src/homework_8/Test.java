package homework_8;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {


        System.out.println(Arrays.toString(countries()));


    }


    public static String[] countries(){
        String s = Arrays.toString(Countries.values());
        String[] ss = s.split(",");
        return ss;
        }
    }

enum Countries{
    Armenia,
    French,
    USA,
    Russian,
    Georgia,
    Spanish,
    Portugal;

}