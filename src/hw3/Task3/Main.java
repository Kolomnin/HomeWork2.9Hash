package hw3.Task3;


import java.util.HashMap;
import java.util.Map;

public class Main {

   static Passport passport1 = new Passport("1234 123456", "Иванов", "Иван", "Иванович", "10.11.1973");
   static Passport passport2 = new Passport("6541 123456", "Петров", "Петр", "Петрович", "10.08.1985");
   static Passport passport3 = new Passport("9876 123456", "Сидеров", "Сидр", "Сидорович", "01.12.1981");
   static Passport passport4 = new Passport("1234 123456", "Иванов", "Иван", "Иванович", "10.11.1973");

    static Map<String, Passport> map = new HashMap<>();

    public static void main(String[] args) {

        addPassport(passport1);
        addPassport(passport2);
        addPassport(passport3);
        addPassport(passport4);

        System.out.println(map);
        System.out.println(getPassport("1234 123456"));
    }

    public static void addPassport(Passport passport) {
        map.put(passport.getNumber(), passport);
    }

    public static Passport getPassport(String number) {
        return map.get(number);

    }
}
