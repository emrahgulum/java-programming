package day05_primitivies_concatanation;

public class CellPhone {
    public static void main(String[] args){
        String brand = "Apple";
        String model = "Iphone 11";
        String color = "Blue";
        double price = 699.00;
        short storage = 256;
        boolean hasCamera = true;

        System.out.println(brand);
        System.out.println(model);
        System.out.println("Color is " + color);
        System.out.println("Price is $"+price);
        System.out.println("Storage is " + storage + "GB");
        System.out.println("Has camera? - "+hasCamera);

    }
}
