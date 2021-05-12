package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String [] student1 = new String[5];
        student1[0] = "AD1234";
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = "443-713-0888";

        String[] student2 = {"DA4321", "Jack", "Teller", "B22", "713-443-0888"};

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstname = " + student1[1]);
        System.out.println("student1 lastname = " + student1[2]);
        System.out.println("student1 batchname = " + student1[3]);
        System.out.println("student1 mobile phone number = " + student1[4]);

        System.out.println("student data length: " + student1.length);

        if (student1.length == 5){
            System.out.println("PASS: data array has correct length");
        }else{
            System.out.println("FAIL: data array has incorrect length");
        }
        if(student1.length == student2.length){
            System.out.println("PASS: data arrays length match");
        }else {
            System.out.println("FAILED: data arrays length mismatch");
        }
        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());

        String mobileNum = student1[4];
    }

}
