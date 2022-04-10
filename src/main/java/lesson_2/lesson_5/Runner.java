package lesson_2.lesson_5;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-03-23 15:12
 */
public class Runner {

    static PersonOperations personOperations = new PersonOperations();

    public static void main(String[] args) {
        personOperations.searchUnder21();
        System.out.println("================================================================");
        personOperations.sortBySurnameThenByName();
        System.out.println("================================================================");
        personOperations.writePersonsInFile();
        personOperations.readPersonsFromFile();
        System.out.println("================================================================");
    }
}
