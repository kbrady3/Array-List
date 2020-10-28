//Kabrina Brady

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ArrayListBrady {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        //Adds following names
        //Andy, Angela, Dwight, Erin, Jim, Michael, Pam, Toby
        names.add("Andy");
        names.add("Angela");
        names.add("Dwight");
        names.add("Erin");
        names.add("Jim");
        names.add("Michael");
        names.add("Pam");
        names.add("Toby");

        //Prints contents
        for (int i = 0; i < names.size(); i++){
            String name = names.get(i);
            System.out.println(name);
        }

        System.out.println();

        //Prints size
        System.out.println("Size: " + names.size());

        System.out.println();

        //Sets Andy to Andy Bernard
        names.set(0, "Andy Bernard");
        //Prints modified ArrayList
        for (String item: names){
            System.out.println(item);
        }

        System.out.println();

        //Inserts Kelly after Jim
        names.add(5, "Kelly");
        //Prints contents
        for (String item: names){
            System.out.println(item);
        }

        System.out.println();

        //Enhanced for loop
        for (String item: names){
            System.out.println(item);
        }

        System.out.println();

        //Creates second array
        ArrayList<String> names2 = new ArrayList<String>();
        //Adds values
        names2.add("Andy");
        names2.add("Angela");
        names2.add("Dwight");
        names2.add("Erin");
        names2.add("Jim");
        names2.add("Michael");
        names2.add("Pam");
        names2.add("Toby");
        //Prints contents
        for (String item: names2){
            System.out.println(item);
        }

        System.out.println();

        //Removes first element from names
        names.remove(0);
        //Prints both arrays
        for (String item: names){
            System.out.println(item);
        }
        System.out.println();
        for (String item: names2){
            System.out.println(item);
        }
    }
}