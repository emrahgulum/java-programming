package day57_abstraction_polymorphism.abstarct_class_vs_interface;

public class Runner {
    public static void main(String[] args) {

        /**
         * WE cannot create object(instantiate) neither of them
        AbstractA absA = new AbstractA();
        InterfaceA iA = new InterfaceA();
        */
        InterfaceA.staticMethodE("wooden spoon");
    }
}
