package newPro.lesson5.homework5;

/**
 * Java. Homework #3
 * @author Yehor Zhornik
 * @version 18 May 2023
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private Map<String, List<Integer>> phoneBook = new HashMap<>();

    public void add(String contactSurname, List<Integer> phoneNumber) {
        phoneBook.put(contactSurname, phoneNumber);
    }

    public List<Integer> getNumbers(String surname) {
        if (!phoneBook.containsKey(surname)) {
            throw new RuntimeException("This key is not present");
        }
        return phoneBook.get(surname);
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Петров", List.of(1141441));
        phoneBook.add("Петров", List.of(2541441));
        phoneBook.add("Петров", List.of(1141441));
        phoneBook.add("Сидоров", List.of(1141441));
        phoneBook.add("Сидоров", List.of(1141441));
        phoneBook.add("Иванов", List.of(1141441));

    }


}

