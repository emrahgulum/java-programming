package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        balance = balance - baklava;
        System.out.println("balance after baklava = " + balance);
        
        double kunefe = 44.45;
        System.out.println("kunefe = " + kunefe);
        balance =  balance - kunefe;
        System.out.println("balance after kunefe = " + balance);
        // second kunefe %50 off.Lets buy it
        kunefe = kunefe / 2;
        System.out.println("kunefe = " + kunefe);
        // buy it and decrease balace with kunefe price
        balance =  balance - kunefe;
        System.out.println("balance after second kunefe = " + balance);

        double pilav = 7.99;
        System.out.println("pilav = " + pilav);
        balance=balance-pilav;
        System.out.println("balance after pilav = " + balance);

        double icedTea= 3.00;
        System.out.println("icedTea = " + icedTea);//buy 4 icedtea and decrease balance
        balance = balance - icedTea * 4;
        System.out.println("after 4 drinks of iced tea = " + balance);
        // return baklava

        System.out.println("returning baklava= "+ baklava);
        balance=balance+baklava;
        System.out.println("balance after returning baklava = $" + balance);



    }
}
