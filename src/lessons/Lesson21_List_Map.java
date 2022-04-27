package lessons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Lesson21_List_Map {
    public static void main(String[] args) {

//        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//
//        System.out.println(cars.get(0));
//
//        cars.set(0, "Opel");
//
//        cars.remove(0);
//
//        cars.size();
//
//        System.out.println(cars.size());
//
//        for (int i = 0; i < cars.size(); i++) {
//            System.out.println(cars.get(i));
//        }
//
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(33);
//        myNumbers.add(15);
//        myNumbers.add(20);
//        myNumbers.add(34);
//        myNumbers.add(8);
//        myNumbers.add(12);
//
//        Collections.sort(myNumbers);  // Sort myNumbers
//
//        for (int i : myNumbers) {
//            System.out.println(i);
//        }
//        System.out.println(myNumbers);
//    }


    HashMap<String, String> capitalCities = new HashMap<String, String>();
// Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);

        System.out.println(capitalCities.get("England"));

}
}
