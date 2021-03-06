package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0,"jeep");
        myCars.add(1,"lada");
        myCars.add(2,"yugo");

        System.out.println(myCars.toString());
        String allCarsIn1St = myCars.toString();

        System.out.println("allCarsIn1St = " + allCarsIn1St);

        myCars.set(0, "lamborghini");
        System.out.println("after set = " + myCars.toString());

        myCars.set(4, "honda");
        System.out.println("after set = " + myCars.toString());

        System.out.println("index of ford = " + myCars.indexOf("ford"));
        int moskvichIndex = myCars.indexOf("moskvich");

        System.out.println("moskvishIndex = " + moskvichIndex);

        myCars.set(moskvichIndex, "jiguli");
        System.out.println("after set to jiguli = " + myCars);

        myCars.set(myCars.indexOf("ford") , ("trabant"));
        System.out.println("after set to trabant = " + myCars);

        if(myCars.contains("lada")){
            myCars.set(myCars.indexOf("lada"), "bugatti");
        }else {
            System.out.println("lada is not found ");
        }

        System.out.println("after set bugatti = " + myCars.toString());

        /**
         lamborghini -> prius
         toyota -> lexus
         trabant -> audi
         */
        for(int i = 0; i < myCars.size(); i++) {
            if (myCars.get(i).equals("lamborghini")) {
                myCars.set(i, "prius");
            } else if (myCars.get(i).equals("toyota")) {
                myCars.set(i, "lexus");
            } else if (myCars.get(i).equals("trabant")) {
                myCars.set(i , "audi");
            }
        }
        System.out.println("after loop = " + myCars);

    }
}
