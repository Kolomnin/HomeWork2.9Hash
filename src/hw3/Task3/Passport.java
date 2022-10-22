package hw3.Task3;

import java.text.SimpleDateFormat;
import java.util.Objects;

public class Passport {
    private String number;
    private String name;
    private String lastName;
    private String middleName;
    private String birthDay;

    public Passport(String number, String lastName, String name, String middleName, String birthDay) {
        try {
            if (number == null || number.isBlank() || !number.matches("\\d{4}\\s\\d{6}")) {
                throw new RuntimeException("Введен неправильный номер паспорта");
            } else {
                this.number = number;
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        setLastName(lastName);
        setName(name);
        setMiddleName(middleName);
        setBirthDay(birthDay);
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            if (name == null || name.isBlank()) {
                throw new IllegalArgumentException("Неправильно введенное имя");
            } else {
                this.name = name;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        try {
            if (lastName == null || lastName.isBlank()) {
                throw new IllegalArgumentException("Неправильно введенная фамилия");
            } else {
                this.lastName = lastName;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        try {
            if (birthDay == null || birthDay.isBlank()) {
                throw new IllegalArgumentException("Неправильно введенная дата");
            } else {
                this.birthDay = birthDay;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return  "Passport: " +
                "number: " + number +
                ", lastName: " + lastName +
                ", name: " + name +
                " middleName: " + middleName +
                ", birthDay: " + birthDay+"\n";
    }
}






