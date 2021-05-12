package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int speedLimit = 5_5; //55 speedlimit :55
        int currentSpeed = 4_5; // current speed: 45
        System.out.println(currentSpeed > speedLimit);
        System.out.println(speedLimit < currentSpeed);
        System.out.println(speedLimit == currentSpeed);

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding );
        System.out.println("currentSpeed = " + currentSpeed + "mph");
        System.out.println("speedLimit = " + speedLimit + "mph");
        //45 + 20 -> 65
        currentSpeed += 20; //65

        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding );
        System.out.println("currentSpeed = " + currentSpeed + "mph");
        System.out.println("speedLimit = " + speedLimit + "mph");

        double accountBalance = 250.25;
        double itemPrice = 200.99;
        System.out.println("can i efford? - " +(accountBalance >= itemPrice));
        
        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("canAfford = " + canAfford);

        //decrease balance by itemPrice. using shorthand operator
        accountBalance = accountBalance - itemPrice;
        accountBalance -= itemPrice;

        boolean isBroke = accountBalance <= 0;
        System.out.println("Am i broke? - " + isBroke);

    }
}
