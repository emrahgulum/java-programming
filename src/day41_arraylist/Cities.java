package day41_arraylist;

import java.util.ArrayList;

public class Cities {
    public static void main(String[] args) {
        // declare arraylist
        ArrayList<String> cities = new ArrayList<>();
        //add cities to arraylist -> add methods

        cities.add("Washington DC");
        cities.add("New York");
        cities.add("Vienna");
        cities.add("Adana");
        cities.add("LA");
        cities.add(0, "Ashgabat");
        System.out.println(cities);

        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " + cities.get(5));
        System.out.println("last city = " + cities.get(cities.size()-1));

        System.out.println("count of items = " + cities.size());

        int size = cities.size();
        System.out.println("there are " + size + " cities in the list");

        for (int i = 0; i< cities.size(); i ++ ){
            System.out.print(cities.get(i) + " ");
        }
        System.out.println();

        //for each loop
        for (String city : cities){
            System.out.print(city+ " ");
        }
        System.out.println();
        //delete item from arraylist
        //1 remove using index, delete value index 3
        cities.remove(3);
        //2 remove using object/value
        cities.remove("New York");

        System.out.println("after remove = " + cities);

        //delete or remove all values from list

        cities.clear();
        System.out.println("cities = "+ cities);

        if(cities.isEmpty()){
            System.out.println("List is empty");
        }

        if(cities.size() == 0){
            System.out.println("List is empty");
        }

    }
}
