package lesson_5;

import lesson_2.lesson_5.Person;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-03-23 18:21
 */
class PersonOperationsTest {


    @Test
    void shouldSearchUnder21() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alex", "Smith", 25));
        personList.add(new Person("John", "Johnson", 22));
        personList.add(new Person("James", "Williams", 30));
        personList.add(new Person("Robert", "Jones", 21));
        personList.add(new Person("Michael", "Brown", 20));
        personList.stream()
                .filter(person -> person.getAge() < 21)
                .forEach(System.out::println);
    }

    @Test
    void shouldSortBySurnameThenByName() {
        List<Person> personList2 = new ArrayList<>();
        personList2.add(new Person("Hhh", "Iii", 25));
        personList2.add(new Person("Bbb", "Ccc", 22));
        personList2.add(new Person("Aaa", "Ccc", 30));
        personList2.add(new Person("Fff", "Ggg", 21));
        personList2.add(new Person("Aaa", "Iii", 20));
        personList2.sort(Comparator.comparing(Person::getSurname).thenComparing(Person::getName));
        personList2.forEach(System.out::println);
    }

    @Test
    void shouldWritePersonsInFile() {
        List<Person> personList3 = new ArrayList<>();
        personList3.add(new Person("Alex", "Smith", 25));
        personList3.add(new Person("John", "Johnson", 22));
        personList3.add(new Person("James", "Williams", 30));
        personList3.add(new Person("Robert", "Jones", 21));
        personList3.add(new Person("Michael", "Brown", 20));
        ObjectOutputStream database = null;
        try {
            FileOutputStream fileOut = new FileOutputStream(new File("").getAbsolutePath() +
                    "\\src\\test\\java\\lesson_5\\PersonFileTest.txt");
            database = new ObjectOutputStream(fileOut);
            database.writeObject(personList3);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert database != null;
                database.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    void readPersonsFromFile() {
        List<Person> personList4 = new ArrayList<>();
        ObjectInputStream database = null;
        try {
            FileInputStream fileIn = new FileInputStream(new File("").getAbsolutePath() +
                    "\\src\\test\\java\\lesson_5\\PersonFileTest.txt");
            database = new ObjectInputStream(fileIn);
            personList4 = (List<Person>) database.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                assert database != null;
                database.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        personList4.stream()
                .map(person -> person.getSurname() + " " + person.getName())
                .forEach(System.out::println);

    }
}