package Lesson5;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-03-23 18:10
 */
class PersonManagementTest {

    @Test
    void shouldAddPersonsToList() {
        List<Person> persons = new PersonManagement().createPersons();
        Person person = new Person("John", "Doe", 25);
        persons.add(person);
        System.out.println(persons);
    }
}