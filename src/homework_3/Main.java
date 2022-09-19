package homework_3;

public class Main {

    public static void main(String[] args) {

        // 1 - B,C,E
        // 2 - D
        // 3 - B,D,E
        // 4 - A,B
        // 5 - D,C
        // 6 - E
        // 7 - A,B,C
        // 8 - B
        // 9 - A,C,D,E
        // 10 - E
        // 11 - C,D
        // 12 - G
        // 13 - A,D
        // 14 - D
        // 15 - A,E
        // 16 - B,C,D
        // 17 - A,E
        // 18 - C,D,E
        // 19 - B,D
        // 20 - B,E
        // 21 - A
        // 22 - B,E
        // 23 - C,D ?

        City n = new City();
        City p = new City();

        n.name = "Yerevan";
        p.population = 1_092_028;

        n.name = "Moscow";
        p.population = 12_640_818;

        n.name = "New York";
        p.population = 19_223_191;

        n.name = "Paris";
        p.population = 11_142_303;

        Rectangle x = new Rectangle();
        x.lenght = 14;
        x.width = 5;
        System.out.print(x.calculateArea());

        System.out.println("---------------------------------------------------");

        Employee person1 = new Employee();
        person1.id =  137213433;
        person1.name1 = "Harut";
        person1.department = "Developing";
        person1.age = 19;
        person1.gender = "male";
        person1.printEmployee();

        System.out.println("--------------------------------------------------------");

        Employee person2 = new Employee();
        person2.id =  254513433;
        person2.name1 = "Stela";
        person2.department = "Developing";
        person2.age = 19;
        person2.gender = "female";
        person2.printEmployee();

        System.out.println("--------------------------------------------------------");

        Employee person3 = new Employee();
        person3.id = 323482733;
        person3.name1 = "Aram";
        person3.department = "Logistic";
        person3.age = 32;
        person3.gender = "male";
        person3.printEmployee();

        Car c = new Car();
        c.model = "C203";
        c.color = "Black";
        Car k = new Car();
        k.model = "S505";
        c.color = "White";
        c.startEngine();
        c.isEngineStart = true;
        c.stopEngine();
        c.isEngineStart = false;


    }
}

/**
 * Սահմանել երեք class(Dog, Cat , Horse), որոնք գտնվում են նույն ․java ֆայլում:
 */
class Dog{

}

class Cat{

}

class Horse{

}

/**
 * Սահմանել երկու class(Book, Author), որոնք գտնվում են տարբեր .java ֆայլերում և նույն package
 * ում:
 */
class Book{

}


/**
 * Սահմանել City class : fields (name, population )
 * Ստեղծել Yerevan, Moscow, New York , Paris քաղաքները համապատասխան
 * մարդաքանակով
 */
class City {
    public String name;
    public int population;

}

/**
 *Սահմանել Rectangle class : fields (length, width ) , methods ( calculateArea() ) .
 * Ստեղծել ուղղանկյուն (բարձրություն 5, լայքն 14) և հաշվել ուղղանկյան
 * մակերեսը ։
 */
class Rectangle {
    public static int width;
    public  static int lenght;


    public static int  calculateArea(){
    int s = lenght * width;
    return s;


    }
}

/**
 *Սահմանել Address class : fields (country , region, city , street, house ) .
 * Սահմանել Bank class : fields (bankName, address (type Address)) .
 */
class Address{
   public String country;
   public String region;
   public String city;
   public String street;
   public String house;
}

class Bank{
    public String ankName;
    public String address;

    }

/**
 * Սահմանել Employee class-ը, որը ունի
 * ● fields (id, name, department, age , gender)
 *
 * ● methods printEmployee() որը տպում է Employee մասին ամբողջական
 * ինֆորմացիա։
 * Ստեղծել 3 աշխատող( 2 տղա և 1 աղջիկ), որոնցից երկուսը աշխատում են
 * նույն դեպարտամենտում և ունեն նույն տարիքը։
 */
class Employee{
    public int id;
    public String name1;
    public String department;
    public int age;
    public String gender;

 void  printEmployee() {
     System.out.println(" Id " +"          "+ id);
     System.out.println(" Անուն " +"       "+ name1);
     System.out.println(" Բաժին " +"       "+ department);
     System.out.println(" Տարիք " +"       "+ age);
     System.out.println(" Սեռ " +"         "+ gender);
    }

}


/**
 * Սահմանել Car class-ը, որը ունի
 * ● fields (model, color, currentSpeed (default արժեքը 0), isEngineStart (true or
 * false))
 * ● methods (stopEngine() անջատում է մատոռը , startEngine() միացնում է մատոռը)
 * Ստեղծել Mercedes C203 սև և S505 սպիտակ մակնիշի մեքենաներ․
 */
class Car{
    public String model;
    public String color;
    public int currentSpeed;
    public boolean isEngineStart;

    void stopEngine(){

    }

    void startEngine(){

    }
}





