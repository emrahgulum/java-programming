package day06_arithmetic_operators;

public class CalculateAge {
    public static void main(String[] args){
        int yearOfBirth = 2013;
        int currentYear = 2021;
        int age = currentYear - yearOfBirth;
                System.out.println(age);
        System.out.println("You are "+age+" years old.");





        int num =2;
        boolean b = true;

        switch (num){

            case 0:
                b=false;
            case 1:
                System.out.println(1);
            case 2:
                if (b){
                    System.out.println(2);
                }else{
                    b = false;
                }
            case 3:
                if (b) {
                    System.out.println(3);
                    b = false;
                    }else{
                    break;
                }
            case 4:
                System.out.println(4);
            case 5 :
                if (!b){
                    break;
                }
                System.out.println(5);
        }

    }

}
