package Lesson2.madScientists;

import Lesson2.madScientists.logic.Simulator;

/**
 * Teamwork by Alexandr Yusikov, Lidia Zhibul, Alex Mikhalevich
 */

public class Runner {
    public static void main(String[] args) {

        System.out.println("Pull request from Aleksandr");
        System.out.println("Pull request from Lidia");

        Simulator.getInstance().execute();
    }
}
