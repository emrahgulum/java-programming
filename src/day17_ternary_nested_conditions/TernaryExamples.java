package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score1 = 25;
        String result1;
        if (score1>60){
            result1 = "Pass";
        }else {
            result1 = "Fail";
        }
        System.out.println("result1 = " +result1);

        int score = 88;
        String result = (score > 60) ? "Pass" : "Fail";
        System.out.println("result = " + result);

        String quality = "good";
        int rating = quality.equals("good")? 100 : 0 ;
    }
}
