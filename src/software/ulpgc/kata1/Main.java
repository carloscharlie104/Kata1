package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Carlos", LocalDate.of(1999, 6, 10));
        System.out.println(person);
    }
}
