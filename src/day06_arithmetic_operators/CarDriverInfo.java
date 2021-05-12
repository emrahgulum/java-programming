package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
        String carModel = "Jeep Wrangler";
        String  driverName = "Batman";
        String licenseNum = "Btm 123";
        short speed = 55;
        boolean isAutomatic = false;
        char licenseClass = 'C';

        System.out.println("Car model : " + carModel);
        System.out.println(carModel + " is car model.");
        System.out.println("Driver name : " + driverName);
        System.out.println(driverName + " is driving a car.");
        System.out.println(driverName + " is driving a " + carModel);
        System.out.println("Current speed is " +speed+".");
        System.out.println("Current speed : " +speed+" mph.");
        System.out.println("Is car automatic -> " + isAutomatic);
        System.out.println(licenseClass + " - " + isAutomatic);

    }
}
