package lesson_5;

import java.io.*;
import java.util.Comparator;
import java.util.List;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-03-23 15:05
 */
public class PersonOperations {

    List<Person> persons = new PersonManagement().createPersons();
    private final String PERSONS_PATH = new File("").getAbsolutePath() +
            "\\src\\main\\java\\lesson_5\\PersonFile.txt";


    public void searchUnder21() {
        persons.stream()
                .filter(person -> person.getAge() < 21)
                .forEach(System.out::println);
    }

    public void sortBySurnameThenByName() {
        persons.sort(Comparator.comparing(Person::getSurname).thenComparing(Person::getName));
        persons.forEach(System.out::println);
    }

    public void writePersonsInFile() {
        ObjectOutputStream database = null;
        try {
            FileOutputStream fileOut = new FileOutputStream(PERSONS_PATH);
            database = new ObjectOutputStream(fileOut);
            database.writeObject(persons);
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

    public void readPersonsFromFile() {
        ObjectInputStream database = null;
        try {
            FileInputStream fileIn = new FileInputStream(PERSONS_PATH);
            database = new ObjectInputStream(fileIn);
            persons = (List<Person>) database.readObject();
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
        persons.stream()
                .map(person -> person.getSurname() + " " + person.getName())
                .forEach(System.out::println);
    }
}

